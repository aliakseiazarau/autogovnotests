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


public class integrationCreationSidebar {
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
    public void  test() throws InterruptedException, AWTException {

        Actions action = new Actions(webDriver);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logger")));

        webDriver.findElement(By.cssSelector(".animationSidebar .button-add-element")).click();
        webDriver.findElement(By.cssSelector(".cart-element__image-inner:nth-child(1)")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dropdown-modal__body ")));
        webDriver.findElement(By.cssSelector(".dropdown-modal__body-inner .dropdown-modal__item:nth-child(1)")).click();
        webDriver.findElement(By.cssSelector(".dropdown-modal_green .dropdown-modal__item:nth-child(1)")).click();

        webDriver.findElement(By.cssSelector(".dropdown-modal_dark .dropdown-modal__item:nth-child(8)")).click();

        action.moveToElement(webDriver.findElement(By.xpath("//button[contains(@class,'button-add-new button-add-new_dark insert-new__button')]"))).perform();

        webDriver.findElement(By.xpath("//button[contains(@class,'button-add-new button-add-new_dark insert-new__button')]")).click();

        webDriver.findElement(By.cssSelector(".dropdown-modal_dark .dropdown-modal__item:nth-child(8)")).click();
        action.moveToElement(webDriver.findElement(By.xpath("//button[contains(@class,'button-add-new button-add-new_dark insert-new__button')]")),0,400).perform();

        List<WebElement> inputs = new ArrayList<WebElement>();
        inputs = webDriver.findElements(By.cssSelector(".column-col .defaultPadding .element-col"));
        wait.until(ExpectedConditions.elementToBeClickable(inputs.get(1))).click();

        List<WebElement> plus = new ArrayList<WebElement>();
        plus = webDriver.findElements(By.xpath("//button[contains(@class,'button-add-new button-add-new_dark insert-new__button')]"));
        wait.until(ExpectedConditions.elementToBeClickable(plus.get(1))).click();

        List<WebElement> knopka  = new ArrayList<WebElement>();
        knopka = webDriver.findElements(By.cssSelector(".dropdown-modal_dark .dropdown-modal__item:nth-child(6)"));
        wait.until(ExpectedConditions.elementToBeClickable(knopka.get(1))).click();

        webDriver.findElement(By.cssSelector(".sidebar-main-menu .sidebar-main-menu__item:nth-child(6)")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Integrations')]"))).click();

        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("document.querySelector('.activeSidebar .button-add-element').click()");
  //      action.moveToElement(webDriver.findElement(By.cssSelector(".sidebar-integration .button-add-element"))).click();
 //       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sidebar-integration .button-add-element"))).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".connect-fields-setup .without-accordion"))).click();
//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-form-setup .select-panel-list__inner"))).click();  // - здесь раскрывается модалка с типами интеграции. понадобится, если надо
//                                                                                                                                                выбарать интег-цию отличную от email (она выбрана по умолчанию)

          List<WebElement> modal_inputs = new ArrayList<WebElement>();
          modal_inputs = webDriver.findElements(By.cssSelector(".modal-form-setup .sidebarEitem .input-field"));


          wait.until(ExpectedConditions.elementToBeClickable(modal_inputs.get(0))).click();
          wait.until(ExpectedConditions.elementToBeClickable(modal_inputs.get(0))).sendKeys("Email#17");
          wait.until(ExpectedConditions.elementToBeClickable(modal_inputs.get(1))).click();
          String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE;
          wait.until(ExpectedConditions.elementToBeClickable(modal_inputs.get(1))).sendKeys(del + "aliaksei.azarau@startmatter.com");
          webDriver.findElement(By.cssSelector(".button-add-element_integration")).click();



          action.moveToElement(webDriver.findElement(By.cssSelector(".element-type-button_element")),0,0).perform();
          Thread.sleep(500);
          action.moveToElement(webDriver.findElement(By.xpath("//span[@class='insert-elements__description element-description element-description_ready']")),10,10).perform();
          Thread.sleep(500);
          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='insert-elements__description element-description element-description_ready']"))).click();

          wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".select-panel-list__header"))).click();
          wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".select-panel-list__body .select-panel-list__list-item"))).click();

//          wait.until(ExpectedConditions.elementToBeClickable(integr_list.get(integr_list.size()-1))).click();

          Thread.sleep(1000);

        JavascriptExecutor integr = (JavascriptExecutor)webDriver;
        List<WebElement> integr_list = webDriver.findElements(By.cssSelector(".select-panel-list__body .select-panel-list__list-item"));
        for (WebElement web : integr_list) {
            integr.executeScript("arguments[0].click()", web );
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".choose-integration__button .button-add-element_integration"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".modal-form-setup__step-3 .button-add-element_integration"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".modal-form-setup__step-3 .button-add-element_integration"))).click();

        Thread.sleep(5000);

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".sidebar-footer .publish-changes"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".sidebar-footer .preview-button"))).click();

        Thread.sleep(7000);

//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".False.input-i2:nth-child(1)"))).sendKeys("Alioshka");
//          wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).sendKeys("aliaksei.azarau@startmatter.com");


        List<WebElement> inputs_render = new ArrayList<WebElement>();
        inputs_render = webDriver.findElements(By.cssSelector(".contentWrapper .input-form-item"));
        wait.until(ExpectedConditions.elementToBeClickable(inputs_render.get(0))).sendKeys("Alioshka");
        wait.until(ExpectedConditions.elementToBeClickable(inputs_render.get(1))).sendKeys("aliaksei.azarau@startmatter.com");

        Thread.sleep(7000);



    }

    @AfterClass
    public static void post() {
        if (webDriver != null) {
            webDriver.quit();

        }
    }
}