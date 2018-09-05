package ProfileSettings;


import PageFactoryFiles.ProfileSettings;
import PageFactoryFiles.RegistrationPage;
import PageFactoryFiles.Text;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageFactoryFiles.MainSupport;

public class ProfileSettingsTests {
    private static WebDriver webDriver;
    private static WebDriverWait wait;

    private static ProfileSettings profileSettings() {
        return new ProfileSettings(webDriver);
    }

    private static MainSupport mainSupport() {
        return new MainSupport(webDriver);
    }



    @BeforeClass
    public static void preConditions() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://app.heroicnow.com?token=117e43c29c8784f68c28ae8c7a6faefeade88957");
        wait = new WebDriverWait(webDriver, 25, 500);
        webDriver.manage().window().maximize();
    }

    @Before
    public void pre() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logger")));
    }


    @Test
    public void Name() throws InterruptedException {
        profileSettings().footerAccount.click();
        String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE;
        profileSettings().name.sendKeys(del + Text.nameProfile);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().Save).click().perform();
        profileSettings().footerSite.click();
        profileSettings().footerAccount.click();
        Assert.assertTrue(profileSettings().nameCheck.getText().contains(Text.nameProfile));
    }

    @Test
    public void Phone() throws InterruptedException {
        profileSettings().footerAccount.click();
        String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE;
        profileSettings().phone.sendKeys(del + Text.phoneProfile);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().Save).click().perform();
        profileSettings().footerSite.click();
        profileSettings().footerAccount.click();
        Assert.assertTrue(profileSettings().phone.getAttribute("value").contains(Text.phoneProfile));
    }

    @Test
    public void EmailEmpty() throws InterruptedException {
        profileSettings().footerAccount.click();
        String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE;
        profileSettings().email.sendKeys(del + "");
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().Save).click().perform();
        Assert.assertTrue(profileSettings().Alert.getText().contains(Text.emailEmptyError));
    }

    @Test
    public void EmailExists() throws InterruptedException {
        profileSettings().footerAccount.click();
        profileSettings().email.clear();
        profileSettings().email.sendKeys(Text.emailExists);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().Save).click().perform();
        Assert.assertTrue(profileSettings().Alert.getText().contains(Text.emailExistsError));
    }

    @Test
    public void EmailValid() throws InterruptedException {
        profileSettings().footerAccount.click();
        profileSettings().email.clear();
        profileSettings().email.sendKeys(Text.emailValid);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().Save).click().perform();
        profileSettings().footerSite.click();
        profileSettings().footerAccount.click();
        Assert.assertTrue(profileSettings().email.getAttribute("value").contains(Text.emailValid));
        profileSettings().email.clear();
        profileSettings().email.sendKeys(Text.emailProfile);
        actions.moveToElement(profileSettings().Save).click().perform();
        profileSettings().footerSite.click();
        profileSettings().footerAccount.click();
        Assert.assertTrue(profileSettings().email.getAttribute("value").contains(Text.emailProfile));

    }

    @Test
    public void EmailHasntDomain() throws InterruptedException {
        profileSettings().footerAccount.click();
        profileSettings().email.clear();
        profileSettings().email.sendKeys(Text.emailNoDomain);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().Save).click().perform();
        Assert.assertTrue(profileSettings().Alert.getText().contains(Text.emailInvalidError));
    }

    @Test
    public void EmailGlobalSpecialSymbols() throws InterruptedException {
        profileSettings().footerAccount.click();
        profileSettings().email.clear();
        profileSettings().email.sendKeys(Text.emailGlobalSpecial);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().Save).click().perform();
        Assert.assertTrue(profileSettings().Alert.getText().contains(Text.emailInvalidError));
    }

    @Test
    public void EmailLocalSpecialSymbols() throws InterruptedException {
        profileSettings().footerAccount.click();
        profileSettings().email.clear();
        profileSettings().email.sendKeys(Text.emailLocalSpecial);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().Save).click().perform();
        Assert.assertTrue(profileSettings().Alert.getText().contains(Text.emailInvalidError));
    }

    @Test
    public void EmailGlobalMoreThanMax() throws InterruptedException {
        profileSettings().footerAccount.click();
        profileSettings().email.clear();
        profileSettings().email.sendKeys(Text.emailGlobalOverMax);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().Save).click().perform();
        Assert.assertTrue(profileSettings().Alert.getText().contains(Text.emailInvalidError));
    }

    @Test
    public void EmailLocalMoreThanMax() throws InterruptedException {
        profileSettings().footerAccount.click();
        profileSettings().email.clear();
        profileSettings().email.sendKeys(Text.emailLocalOverMax);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().Save).click().perform();
        Assert.assertTrue(profileSettings().Alert.getText().contains(Text.emailInvalidError));
    }

    @Test
    public void EmailGlobalMaxCorrect() throws InterruptedException {
        profileSettings().footerAccount.click();
        profileSettings().email.clear();
        profileSettings().email.sendKeys(Text.emailGlobalMax);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().Save).click().perform();
        profileSettings().footerSite.click();
        profileSettings().footerAccount.click();
        Assert.assertTrue(profileSettings().email.getAttribute("value").contains(Text.emailGlobalMax));
        profileSettings().email.clear();
        profileSettings().email.sendKeys(Text.emailProfile);
        actions.moveToElement(profileSettings().Save).click().perform();
        profileSettings().footerSite.click();
        profileSettings().footerAccount.click();
        Assert.assertTrue(profileSettings().email.getAttribute("value").contains(Text.emailProfile));
    }

    @Test
    public void CurrentPassWrong() throws InterruptedException {
        profileSettings().footerAccount.click();
        profileSettings().currentPass.sendKeys(Text.currentPassWrong);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().Save).click().perform();
        Assert.assertTrue(profileSettings().currentPasswordAlert.getText().contains(Text.currentPassWrongAlert));
    }

    @Test
    public void CurrentPassEmpty() throws InterruptedException {
        profileSettings().footerAccount.click();
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().newPass).click().perform();
        profileSettings().newPass.sendKeys(Text.currentPassWrong);
        actions.moveToElement(profileSettings().Save).click().perform();
        Assert.assertTrue(profileSettings().currentPasswordAlert.getText().contains(Text.currentPassEmptyAlert));
    }

    @Test
    public void NewPassEmpty() throws InterruptedException {
        profileSettings().footerAccount.click();
        Actions actions = new Actions(webDriver);
        profileSettings().currentPass.sendKeys(Text.validPass);
        actions.moveToElement(profileSettings().Save).click().perform();
        Assert.assertTrue(profileSettings().newPasswordAlert.getText().contains(Text.newPassEmptyAlert));
    }

    @Test
    public void RepeatNewPassEmpty() throws InterruptedException {
        profileSettings().footerAccount.click();
        Actions actions = new Actions(webDriver);
        profileSettings().currentPass.sendKeys(Text.validPass);
        actions.moveToElement(profileSettings().newPass).click().perform();
        profileSettings().newPass.sendKeys(Text.invalidPass);
        actions.moveToElement(profileSettings().Save).click().perform();
        Assert.assertTrue(profileSettings().repeatNewPasswordAlert.getText().contains(Text.repeatNewPassEmptyAlert));
    }

    @Test
    public void RepeatNewPassWrong() throws InterruptedException {
        profileSettings().footerAccount.click();
        Actions actions = new Actions(webDriver);
        profileSettings().currentPass.sendKeys(Text.validPass);
        actions.moveToElement(profileSettings().newPass).click().perform();
        profileSettings().newPass.sendKeys(Text.invalidPass);
        actions.moveToElement(profileSettings().repeatNewPass).click().perform();
        profileSettings().repeatNewPass.sendKeys(Text.validPass);
        actions.moveToElement(profileSettings().Save).click().perform();
        Assert.assertTrue(profileSettings().repeatNewPasswordAlert.getText().contains(Text.repeatNewPassWrongAlert));
    }

    @Test
    public void AllPassCorrect() throws InterruptedException {
        profileSettings().footerAccount.click();
        Actions actions = new Actions(webDriver);
        profileSettings().currentPass.sendKeys(Text.validPass);
        actions.moveToElement(profileSettings().newPass).click().perform();
        profileSettings().newPass.sendKeys(Text.invalidPass);
        actions.moveToElement(profileSettings().repeatNewPass).click().perform();
        profileSettings().repeatNewPass.sendKeys(Text.invalidPass);
        actions.moveToElement(profileSettings().Save).click().perform();
        profileSettings().footerSite.click();
        profileSettings().footerAccount.click();
        profileSettings().currentPass.sendKeys(Text.invalidPass);
        actions.moveToElement(profileSettings().newPass).click().perform();
        profileSettings().newPass.sendKeys(Text.validPass);
        actions.moveToElement(profileSettings().repeatNewPass).click().perform();
        profileSettings().repeatNewPass.sendKeys(Text.validPass);
        actions.moveToElement(profileSettings().Save).click().perform();
    }



    @After
    public void postCondition() throws InterruptedException {
        profileSettings().footerSite.click();
        profileSettings().footerAccount.click();
    }

    @AfterClass
    public static void post() {
        profileSettings().footerSite.click();
        profileSettings().footerAccount.click();
        profileSettings().email.clear();
        profileSettings().email.sendKeys(Text.emailProfile);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profileSettings().Save).click().perform();
        Assert.assertTrue(profileSettings().email.getAttribute("value").contains(Text.emailProfile));
        if (webDriver != null) {
            webDriver.quit();

        }
    }
}