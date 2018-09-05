package registrationPage;

import PageFactoryFiles.MainSupport;
import PageFactoryFiles.RegistrationPage;
import PageFactoryFiles.Text;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageTest {
    private static WebDriver webDriver;
    private static WebDriverWait wait;

    private static RegistrationPage registrationPage() {
        return new RegistrationPage(webDriver);
    }

    private MainSupport mainSupport() {
        return new MainSupport(webDriver);
    }


    @BeforeClass
    public static void preConditions() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get(Text.site);
        wait = new WebDriverWait(webDriver, 25, 500);
        webDriver.manage().window().maximize();
    }


    @Test
    public void loginFieldEmpty()  {
        registrationPage().passWord.sendKeys(Text.validPass);
        registrationPage().signIn.click();
        Assert.assertTrue(registrationPage().cantBlankField.getText().contains(Text.blankField));
    }

    @Test
    public void loginsNotExists() throws InterruptedException {
        registrationPage().logIn.sendKeys(Text.invalidLogin);
        registrationPage().passWord.sendKeys(Text.validPass);
        registrationPage().signIn.click();
        Assert.assertTrue(registrationPage().cantBlankField.getText().contains(Text.incorrectLogin));
    }


    @Test
    public void passFieldEmpty() {
        registrationPage().logIn.sendKeys(Text.validLogin);
        registrationPage().signIn.click();
        Assert.assertTrue(registrationPage().cantBlankField.getText().contains(Text.blankField));
    }

    @Test
    public void passIncorrect() throws InterruptedException {
        registrationPage().logIn.sendKeys(Text.validLogin);
        registrationPage().passWord.sendKeys(Text.invalidPass);
        registrationPage().signIn.click();
        Assert.assertTrue(registrationPage().cantBlankField.getText().contains(Text.incorrectPass));
    }

    @Test
    public void AllFieldsCorrect() throws InterruptedException {
        registrationPage().logIn.sendKeys(Text.validLogin);
        registrationPage().passWord.sendKeys(Text.validPass);
        registrationPage().signIn.click();
        wait.until(ExpectedConditions.visibilityOf(registrationPage().loadPage));
        Assert.assertTrue(registrationPage().loadPage.getText().contains(Text.siteLoading));
        mainSupport().clearLocalStorage();
    }

    @Test
    public void FieldsAreEmpty() throws InterruptedException {
        registrationPage().signIn.click();
        Assert.assertTrue(registrationPage().cantBlankField.getText().contains(Text.blankField));
    }

    @Test
    public void accCreation() throws InterruptedException {
        registrationPage().accCreate.click();
        wait.until(ExpectedConditions.visibilityOf(registrationPage().heroicNow));
        Assert.assertTrue(registrationPage().heroicNow.getText().contains(Text.createAccountPageHeader));
        webDriver.get(Text.site);
        Thread.sleep(2000);

    }

    @Test
    public void PassRecovery() throws InterruptedException {
        registrationPage().passRecover.click();
        registrationPage().emailRecoverySend.sendKeys(Text.validLogin);
        registrationPage().submitRecoverySend.click();
        wait.until(ExpectedConditions.visibilityOf(registrationPage().passRecoverSent));
        Assert.assertTrue(registrationPage().passRecoverSent.getText().contains(Text.passReset));
        final String POP_USER = Text.validLogin;
        final String POP_PASSWORD = Text.validMailPass;
        System.out.println(GetMailText.resetpswd);
        while (GetMailText.resetpswd == null) {
            GetMailText.getMails(POP_USER,POP_PASSWORD);
            System.out.println(GetMailText.resetpswd);
        }
        webDriver.get(GetMailText.resetpswd);
        registrationPage().newPass1.sendKeys(Text.validPass);
        registrationPage().newPass2.sendKeys(Text.validPass);
        registrationPage().submitRecoverySend.click();
        Thread.sleep(3000);
        registrationPage().backToLogin.click();
        registrationPage().logIn.sendKeys(Text.validLogin);
        registrationPage().passWord.sendKeys(Text.validPass);
        registrationPage().signIn.click();
        wait.until(ExpectedConditions.visibilityOf(registrationPage().loadPage));
        Assert.assertTrue(registrationPage().loadPage.getText().contains(Text.siteLoading));
        mainSupport().clearLocalStorage();

    }

    @Test
    public void passRecoveryIncorrect() throws InterruptedException {
        registrationPage().passRecover.click();
        registrationPage().emailRecoverySend.sendKeys(Text.invalidLogin);
        registrationPage().submitRecoverySend.click();
        wait.until(ExpectedConditions.visibilityOf(registrationPage().cantBlankField));
        Assert.assertTrue(registrationPage().cantBlankField.getText().contains(Text.invalidPassReset));
    }


    @After
    public void postCondition() throws InterruptedException {
        webDriver.navigate().refresh();
    }


    @AfterClass
    public static void post() {
        if (webDriver != null) {
            webDriver.quit();
        }

    }
}
