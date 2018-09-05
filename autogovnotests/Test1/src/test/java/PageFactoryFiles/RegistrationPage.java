package PageFactoryFiles;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
    public WebDriver webDriver;


    public RegistrationPage(WebDriver driver) {
        webDriver = driver;
        WebDriverWait wait;
        PageFactory.initElements(webDriver, this);
    }

    //  Registration page

    @FindBy(name = "firstname")
    public WebElement firstNameField;

    @FindBy (name = "lastname")
    public WebElement lastNameField;

    @FindBy (name = "email")
    public WebElement emailField;

    @FindBy (name = "password")
    public WebElement passwordField;

    @FindBy (name = "checkboxagree")
    public WebElement checkBox;

    @FindBy (id = "submit")
    public WebElement submitButton;

    @FindBy (id = "firstname-error")
    public WebElement firstNameError;

    @FindBy (id = "lastname-error")
    public WebElement lastNameError;

    @FindBy (id = "email-field-error")
    public WebElement emailError;

    @FindBy (id = "password-error")
    public WebElement passwordError;

    @FindBy (xpath = "//label[@for='checkboxagree']")
    public WebElement checkbox;

    @FindBy (css = ".form-checkbox")
    public WebElement CheckBoxAgree;

    @FindBy (id = "checkboxagree-error")
    public WebElement checkBoxError;

    @FindBy (css =".form-description")
    public WebElement haveAccount;

    @FindBy (css = ".loading-screen__count")
    public WebElement loadPage;

    @FindBy (css = ".form-page__title")
    public WebElement moveToLogin;

//    .loading-screen__count Powering Up

//  Login page

    @FindBy (id = "user_email")
    public WebElement logIn;

    @FindBy (id = "user_password")
    public WebElement passWord;

    @FindBy (css = ".form-page__button")
    public WebElement signIn;

    @FindBy (css = ".form-page__alert")
    public WebElement cantBlankField;

    @FindBy (xpath = "//a[contains(text(),'Forgot your password? Recover it here')]")
    public WebElement passRecover;

    @FindBy (xpath = "//a[contains(text(),'Dont have an account yet? Start here!')]")
    public WebElement accCreate;

    @FindBy (css = ".header-info__subtitle")
    public WebElement heroicNow;

    @FindBy (id = "id_email")
    public WebElement emailRecoverySend;

    @FindBy (css = ".btn-submit-form")
    public WebElement submitRecoverySend;

    @FindBy (css = ".form-page__description")
    public WebElement passRecoverSent;

    @FindBy (name = "new_password1")
    public WebElement newPass1;

    @FindBy (name = "new_password2")
    public WebElement newPass2;

    @FindBy (css = ".form-page__action")
    public WebElement backToLogin;

    @FindBy (name = "support@beheroik.com")
    public WebElement gMail;

    @FindBy (css = ".ajT")
    public WebElement gMailMessage;
}
