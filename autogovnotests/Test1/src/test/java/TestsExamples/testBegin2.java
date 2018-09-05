package TestsExamples;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class testBegin2 {
    WebDriver webDriver;

    @Before
    public void preConditions() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        webDriver.manage().window().maximize();
    }

    @Test
    public void  test() throws InterruptedException {
        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());

        webDriver.findElement(By.id("lst-ib")).sendKeys("Лавруша");
        webDriver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
        webDriver.findElement(By.cssSelector("#top_nav #hdtb-msb-vis .hdtb-mitem.hdtb-imb:nth-child(2) a")).click();


        Thread.sleep(10000);

        webDriver.quit();

    }
}
