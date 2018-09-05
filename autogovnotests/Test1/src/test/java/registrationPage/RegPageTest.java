package registrationPage;


import PageFactoryFiles.MainSupport;
import PageFactoryFiles.RegistrationPage;
import PageFactoryFiles.Text;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegPageTest {
    private static WebDriver webDriver;
    private static WebDriverWait wait;

    private static RegistrationPage registrationPage() {
        return new RegistrationPage(webDriver);
    }

    private static MainSupport mainSupport() {
        return new MainSupport(webDriver);
    }


    @BeforeClass
    public static void preConditions() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get(Text.createAccount);
        wait = new WebDriverWait(webDriver, 25, 500);
        webDriver.manage().window().maximize();
    }


    @Test
    public void firstNameEmpty() {
        registrationPage().firstNameField.sendKeys(Text.emptyNames);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().firstNameError.getText().contains(Text.firstNameEmpty));
    }


    @Test
    public void firstNameExists() {
        registrationPage().firstNameField.sendKeys(Text.firstName);
        registrationPage().submitButton.click();
        System.out.println(registrationPage().firstNameField.getAttribute("value"));
        Assert.assertTrue(registrationPage().firstNameField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidFalse));
    }

    @Test
    public void firstNameOverMaxValue() {
        registrationPage().firstNameField.sendKeys(Text.firstNameOverMax);
        registrationPage().submitButton.click();
        System.out.println(registrationPage().firstNameField.getAttribute("value"));
        Assert.assertTrue(registrationPage().firstNameField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidTrue));
    }

    @Test
    public void firstNameOnlySpaces() {
        registrationPage().firstNameField.sendKeys(Text.nameOnlySpaces);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().firstNameField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidTrue));
    }

    @Test
    public void firstNameSpecialSymbols() {
        registrationPage().firstNameField.sendKeys(Text.firstNameSpecial);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().firstNameField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidFalse));
    }






    @Test
    public void lastNameEmpty() {
        registrationPage().lastNameField.sendKeys(Text.emptyNames);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().lastNameError.getText().contains(Text.lastNameEmpty));
    }

    @Test
    public void lastNameExists() {
        registrationPage().lastNameField.sendKeys(Text.lastName);
        registrationPage().submitButton.click();
        System.out.println(registrationPage().lastNameField.getAttribute("value"));
        Assert.assertTrue(registrationPage().lastNameField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidFalse));
    }


    @Test
    public void lastNameOverMAxValue() {
        registrationPage().lastNameField.sendKeys(Text.lastNameOverMax);
        registrationPage().submitButton.click();
        System.out.println(registrationPage().lastNameField.getAttribute("value"));
        Assert.assertTrue(registrationPage().lastNameField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidTrue));
    }

    @Test
    public void lastNameOnlySpaces() {
        registrationPage().lastNameField.sendKeys(Text.nameOnlySpaces);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().lastNameField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidTrue));
    }

    @Test
    public void lastNameSpecialSymbols() {
        registrationPage().lastNameField.sendKeys(Text.lastNameSpecial);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().lastNameField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidFalse));

    }





    @Test
    public void emailFieldEmpty()  {
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().emailError.getText().contains(Text.emailEmptyAlert));
    }


    @Test
    public void emailFieldAlreadyTaken() throws InterruptedException {
        registrationPage().emailField.sendKeys(Text.emailExists);
        registrationPage().submitButton.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(registrationPage().emailError));
        Assert.assertTrue(registrationPage().emailError.getText().contains(Text.emailExistsAlert));
    }

    @Test
    public void emailFieldValid() throws InterruptedException {
        registrationPage().emailField.sendKeys(Text.emailValid);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().emailField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidFalse));
    }

    @Test
    public void emailFieldNoDomain() throws InterruptedException {
        registrationPage().emailField.sendKeys(Text.emailNoDomain);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().emailField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidTrue));
        Assert.assertTrue(registrationPage().emailError.getText().contains(Text.emailInvalidAlert));
    }

    @Test
    public void emailFieldGlobalPartSpecialSymbols() throws InterruptedException {
        registrationPage().emailField.sendKeys(Text.emailGlobalSpecial);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().emailField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidTrue));
        Assert.assertTrue(registrationPage().emailError.getText().contains(Text.emailInvalidAlert));
    }


    @Test
    public void emailFieldLocalPartSpecialSymbols() throws InterruptedException {
        registrationPage().emailField.sendKeys(Text.emailLocalSpecial);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().emailField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidTrue));
        Assert.assertTrue(registrationPage().emailError.getText().contains(Text.emailInvalidAlert));
    }

    @Test
    public void emailFieldGlobalPartMoreThanMax() throws InterruptedException {
        registrationPage().emailField.sendKeys(Text.emailGlobalOverMax);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().emailField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidTrue));
        Assert.assertTrue(registrationPage().emailError.getText().contains(Text.emailInvalidAlert));
    }

    @Test
    public void emailFieldGlobalPartCorrectValue() throws InterruptedException {
        registrationPage().emailField.sendKeys(Text.emailGlobalMax);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().emailField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidFalse));
    }

    @Test
    public void emailFieldLocalPartMoreThanMax() throws InterruptedException {
        registrationPage().emailField.sendKeys(Text.emailLocalOverMax);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().emailField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidTrue));
        Assert.assertTrue(registrationPage().emailError.getText().contains(Text.emailInvalidAlert));
    }






    @Test
    public void passwordEmpty() throws InterruptedException {
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().passwordError.getText().contains(Text.passEmptyAlert));
    }

    @Test
    public void  passwordLessThanMinValue() throws InterruptedException {
        registrationPage().passwordField.sendKeys(Text.passLessMin);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().passwordField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidTrue));
        Assert.assertTrue(registrationPage().passwordError.getText().contains(Text.passLessMinAlert));
    }

    @Test
    public void passwordMoreThanMaxValue() throws InterruptedException {
        registrationPage().passwordField.sendKeys(Text.passOverMax);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().passwordField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidTrue));
        Assert.assertTrue(registrationPage().passwordError.getText().contains(Text.passOverMaxAlert));
    }

    @Test
    public void passwordMaxValue() throws InterruptedException {
        registrationPage().passwordField.sendKeys(Text.passMax );
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().passwordField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidFalse));
    }

    @Test
    public void passwordMinValue() throws InterruptedException {
        registrationPage().passwordField.sendKeys(Text.passMin);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().passwordField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidFalse));
    }

    @Test
    public void passwordValid() throws InterruptedException {
        registrationPage().passwordField.sendKeys(Text.passValidSpec);
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().passwordField.getAttribute(Text.alertInvalid).contains(Text.alertInvalidFalse));
    }

    @Test
    public void checkBoxMarked() throws InterruptedException {
        registrationPage().checkbox.click();
        registrationPage().submitButton.click();
        Assert.assertTrue(!webDriver.findElement(By.cssSelector(".valid")).isDisplayed());
    }


    @Test
    public void allFieldsAreEmpty() throws InterruptedException {
        registrationPage().submitButton.click();
        Assert.assertTrue(registrationPage().firstNameError.getText().contains(Text.firstNameEmpty));
        Assert.assertTrue(registrationPage().emailError.getText().contains(Text.emailEmptyAlert));
        Assert.assertTrue(registrationPage().lastNameError.getText().contains(Text.lastNameEmpty));
        Assert.assertTrue(registrationPage().passwordError.getText().contains(Text.passEmptyAlert));
        Assert.assertTrue(registrationPage().checkBoxError.getText().contains(Text.termOfUseAlert));
    }

    @Test
    public void allFieldsHaveAverageValues() throws InterruptedException {
        registrationPage().firstNameField.sendKeys(Text.validNames);
        registrationPage().lastNameField.sendKeys(Text.validNames);
        registrationPage().emailField.sendKeys(Text.validMail);
        registrationPage().passwordField.sendKeys(Text.passValidSpec);
        registrationPage().checkbox.click();
        registrationPage().submitButton.click();
    }

    @Test
    public void termOfUseWorks() throws InterruptedException {
        registrationPage().CheckBoxAgree.click();
        mainSupport().handleMultipleWindows("Heroic Terms of Service");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".header__form")));
        Assert.assertTrue(webDriver.findElement(By.cssSelector(".header__form")).isDisplayed());
        webDriver.close();
        mainSupport().handleMultipleWindows("Create Your Free Account");
    }

    @Test
    public void alreadyHaveAccount() throws InterruptedException {
        registrationPage().haveAccount.click();
        registrationPage().webDriver.findElement(By.cssSelector(".form-page__actions")).click();
        Assert.assertTrue(registrationPage().moveToLogin.getText().contains("Login"));
        webDriver.get(Text.createAccount);

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
