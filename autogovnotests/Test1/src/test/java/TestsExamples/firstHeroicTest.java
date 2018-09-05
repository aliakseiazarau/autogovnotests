package TestsExamples;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firstHeroicTest {
    static WebDriver webDriver;
    static WebDriverWait wait;

    @BeforeClass
    public static void preConditions() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://stg.heroicnow.com?token=21f2555f922a0e6e481ff515042bc2c77b53f4cb");
        wait = new WebDriverWait(webDriver, 15, 300);
        webDriver.manage().window().maximize();

    }

    @Test
    public void  test() throws InterruptedException {

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logger")));



        webDriver.findElement(By.cssSelector(".animationSidebar .button-add-element")).click();
        webDriver.findElement(By.cssSelector(".cart-element__image-inner:nth-child(1)")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dropdown-modal__body ")));
        webDriver.findElement(By.cssSelector(".dropdown-modal__body-inner .dropdown-modal__item:nth-child(1)")).click();
        webDriver.findElement(By.cssSelector(".dropdown-modal_green .dropdown-modal__item:nth-child(1)")).click();
        webDriver.findElement(By.cssSelector(".dropdown-modal_dark .dropdown-modal__item:nth-child(6)")).click();
        webDriver.findElement(By.cssSelector(".element-properties-tabs .element-properties-tabs__item:nth-child(2)")).click();
        webDriver.findElement(By.cssSelector(".element-properties__content .accordion-panel:nth-child(1)")).click();
        webDriver.findElement(By.cssSelector(".toggleElement")).click();

        Actions action = new Actions(webDriver);
        WebElement element = webDriver.findElement(By.cssSelector(".btn-element"));
        action.moveToElement(element).perform();

        Thread.sleep(10000);

        webDriver.quit();

    }

    @AfterClass
    public static void post(){
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}


