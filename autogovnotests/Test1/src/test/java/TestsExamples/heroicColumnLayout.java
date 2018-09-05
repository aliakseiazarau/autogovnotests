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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.awt.datatransfer.ToolkitThreadBlockedHandler;

import java.awt.*;
import java.awt.event.KeyEvent;


public class heroicColumnLayout {
    static WebDriver webDriver;
    static WebDriverWait wait;

    @BeforeClass
    public static void preConditions() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://app.heroicnow.com?token=21f2555f922a0e6e481ff515042bc2c77b53f4cb");
        wait = new WebDriverWait(webDriver, 10, 300);
        webDriver.manage().window().maximize();

    }

    @Test
    public void  test() throws InterruptedException, AWTException {

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logger")));
        webDriver.findElement(By.cssSelector(".animationSidebar .button-add-element")).click();
        webDriver.findElement(By.cssSelector(".cart-element__image-inner:nth-child(1)")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dropdown-modal__body_section .dropdown-modal__body-inner")));
        webDriver.findElement(By.cssSelector(".dropdown-modal__body-inner .dropdown-modal__item:nth-child(1)")).click();
        webDriver.findElement(By.cssSelector(".dropdown-modal_green .dropdown-modal__item:nth-child(1)")).click();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//div[contains(@class,'dropdown-modal dropdown-modal dropdown-modal_dark element-types')]//button[@class='dropdown-modal__close']")))).click();
        Thread.sleep(2000);

        Actions action = new Actions(webDriver);

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),200,200).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'Full Width Column')]")))).click();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),200,200).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'80% Width Column')]")))).click();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),200,200).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'60% Width Column')]")))).click();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),200,200).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'30% Width Column')]")))).click();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),200,200).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'Full Width Symmetrical')]")))).click();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),200,200).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'90% Width 2 Column')]")))).click();

        action.moveToElement(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'Right Sidebar Narrow')]"))).perform();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),200,200).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'80% Width 2 Column')]")))).click();


 //       action.moveToElement(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'Right Sidebar Wide')]"))).perform();

        action.moveToElement(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'Right Sidebar Narrow')]"))).perform();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),0,30).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'60% Width 2 Column')]")))).click();
        Thread.sleep(1000);

        action.moveToElement(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'Right Sidebar Narrow')]"))).perform();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),0,30).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'Right Sidebar Wide')]")))).click();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),0,30).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();

        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//div[contains(@class,'dropdown-modal dropdown-modal_green column-layout')]//div[contains(@class,'scroll-pane ps-container ps-theme-default ps-active-y')]//ul[contains(@class,'dropdown-modal__body-inner')]")))).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);


        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),0,30).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'Right Sidebar Narrow')]")))).click();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),0,30).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'Left Sidebar Wide')]")))).click();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),0,30).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'Left Sidebar Narrow')]")))).click();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),0,30).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();


        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),0,30).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//div[contains(@class,'dropdown-modal dropdown-modal_green column-layout')]//div[contains(@class,'scroll-pane ps-container ps-theme-default ps-active-y')]//ul[contains(@class,'dropdown-modal__body-inner')]")))).click();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);

        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'3 Column Row')]")))).click();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),0,30).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'4 Column')]")))).click();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),0,30).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'6 Column')]")))).click();

        action.moveToElement(webDriver.findElement(By.xpath("//div[@class='insert-new insert-new_center insert-new_visible']//div[@class='insert-new__inner']")),0,30).perform();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button[@class='button-add-new button-add-new_green']")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//div[contains(@class,'dropdown-modal dropdown-modal_green column-layout')]//div[contains(@class,'scroll-pane ps-container ps-theme-default ps-active-y')]//ul[contains(@class,'dropdown-modal__body-inner')]")))).click();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//span[@class='dropdown-modal__item-title'][contains(text(),'8 Column')]")))).click();


        Thread.sleep(10000);

        webDriver.quit();

    }

    @AfterClass
    public static void post() {
        if (webDriver != null) {
            webDriver.quit();

        }
    }
}