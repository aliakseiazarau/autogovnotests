import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Supportt {
    public WebDriver webDriver;

    public Supportt (WebDriver driver) {
        webDriver = driver;
        WebDriverWait wait;
        PageFactory.initElements(webDriver, this);
    }
}


