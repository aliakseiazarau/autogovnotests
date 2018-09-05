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


public class heroicColumnLayout1 {
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
    public void  test() throws InterruptedException {

        Actions action = new Actions(webDriver);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logger")));
        webDriver.findElement(By.cssSelector(".animationSidebar .button-add-element")).click();

        webDriver.findElement(By.cssSelector(".cart-element__image-inner:nth-child(1)")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dropdown-modal__body ")));
        webDriver.findElement(By.cssSelector(".dropdown-modal__body-inner .dropdown-modal__item:nth-child(1)")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sidebar-properties-item__extra-content_section .button-add-element"))).click();

        List<WebElement> list = new ArrayList<WebElement>();
        list = webDriver.findElements(By.cssSelector(".modal-choose-column__row .modal-choose-column__item.column-grid"));

        for (int i = 0; i < list.size(); i++) {
            Thread.sleep(2000);
            list = webDriver.findElements(By.cssSelector(".modal-choose-column__row .modal-choose-column__item.column-grid"));
            wait.until(ExpectedConditions.elementToBeClickable(list.get(i))).click();
            action.moveToElement (webDriver.findElement(By.cssSelector(".sidebar-properties-item__extra-content_section .button-add-element"))).perform();
            wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.cssSelector(".sidebar-properties-item__extra-content_section .button-add-element")))).click();
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