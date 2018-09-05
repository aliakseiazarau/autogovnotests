package TestsExamples;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class pageTemplates {
    static WebDriver webDriver;
    static WebDriverWait wait;

    @BeforeClass
    public static void preConditions() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://app.heroicnow.com?token=21f2555f922a0e6e481ff515042bc2c77b53f4cb");
        wait = new WebDriverWait(webDriver, 45, 300);
        webDriver.manage().window().maximize();

    }

    @Test
    public void test() throws InterruptedException {

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logger")));
        webDriver.findElement(By.cssSelector(".animationSidebar .button-add-element")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Funnel')]"))).click();


        List<WebElement> funnel = webDriver.findElements(By.cssSelector(".cart-element__image"));
        for (int i = 0; i < funnel.size(); i++) {
            funnel = webDriver.findElements(By.cssSelector(".cart-element__image"));
            Thread.sleep(2000);
            wait.until(ExpectedConditions.elementToBeClickable(funnel.get(i))).click();
            Thread.sleep(8000);
            webDriver.findElement(By.cssSelector(".animationSidebar .button-add-element")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Funnel')]"))).click();

        }

        List<WebElement> home = webDriver.findElements(By.cssSelector(".modal-templates__main .cart-element"));
        for (int i = 0; i < home.size(); i++) {
            home = webDriver.findElements(By.cssSelector(".modal-templates__main .cart-element"));
            wait.until(ExpectedConditions.elementToBeClickable(home.get(i))).click();
            Thread.sleep(8000);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".animationSidebar .button-add-element"))).click();

        }

        Thread.sleep(5000);
        webDriver.quit();
    }

    @AfterClass
    public static void post() {
        if (webDriver != null) {
            webDriver.quit();

        }

    }

}