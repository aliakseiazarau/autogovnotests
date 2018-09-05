package PageFactoryFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfileSettings {
    public WebDriver webDriver;


    public ProfileSettings (WebDriver driver) {

        webDriver = driver;
        WebDriverWait wait;
        PageFactory.initElements(webDriver, this);
    }

    //ProfileSettings

    @FindBy(xpath = "//div[contains(@class,'sidebar-footer-menu')]//button[2]")
    public WebElement footerAccount;

    @FindBy(xpath = "//div[contains(@class,'sidebar-footer-menu')]//button[3]")
    public WebElement footerSite;

    @FindBy(name = "username")
    public WebElement name;

    @FindBy(xpath = "//button[@class='button-add-element'][contains(text(),'Save Changes')]")
    public WebElement Save;

    @FindBy(css = ".sidebar-full-add-list__head-subtitle")
    public WebElement nameCheck;

    @FindBy(name = "phone_number")
    public WebElement phone;

    @FindBy (name = "email")
    public WebElement email;

    @FindBy (xpath = "//div[contains(text(),'Email')]/parent::*//span")
    public WebElement Alert;

    @FindBy (name = "current")
    public WebElement currentPass;

    @FindBy (name = "password1")
    public WebElement newPass;

    @FindBy (name = "password2")
    public WebElement repeatNewPass;

    @FindBy (xpath = "//div[contains(text(),'Current Password')]/parent::*//span")
    public WebElement currentPasswordAlert;

    @FindBy (xpath = "//span[contains(text(),'New Password field is empty!')]")
    public WebElement newPasswordAlert;

    @FindBy (xpath = "//div[contains(text(),'Repeat New Password')]/parent::*//span")
    public WebElement repeatNewPasswordAlert;
}
