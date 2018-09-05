package integrationTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;


public class integrationDelete {
    static WebDriver webDriver;
    static WebDriverWait wait;

    @BeforeClass
    public static void preConditions() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://stg.heroicnow.com?token=21f2555f922a0e6e481ff515042bc2c77b53f4cb");
//        webDriver.get("https://stg.heroicnow.com?token=2362e325f60b5437fd11c7351a4d709cc996c01d");

        wait = new WebDriverWait(webDriver, 25, 300);
        webDriver.manage().window().maximize();

    }

    @Test
    public void  test() throws InterruptedException, AWTException {

        Actions action = new Actions(webDriver);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logger")));
        webDriver.findElement(By.cssSelector(".sidebar-main-menu .sidebar-main-menu__item:nth-child(6)")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Integrations')]"))).click();
        Thread.sleep(3000);

        List<WebElement> int_list = new ArrayList<WebElement>();
        int_list = webDriver.findElements(By.cssSelector(".sidebar-integration .page-menu__list-item"));

        for (int i = 0; i < int_list.size(); i++) {
            Thread.sleep(2000);
            wait.until(ExpectedConditions.elementToBeClickable(int_list.get(0))).click();
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("document.querySelector('.sidebar-integration .sidebar-popup-menu__link').click()");
            Thread.sleep(1500);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".sidebar-integration .sidebar-popup-menu__menu"))).click();
            webDriver.switchTo().alert().accept();
            Thread.sleep(1500);
            int_list = webDriver.findElements(By.cssSelector(".sidebar-integration .page-menu__list-item"));
        }

    }

    @AfterClass
    public static void post() {
        if (webDriver != null) {
            webDriver.quit();

        }
    }
}