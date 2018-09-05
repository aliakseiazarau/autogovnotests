package registrationPage;

import PageFactoryFiles.RegistrationPage;
import org.openqa.selenium.WebDriver;

 public class HeroicSite {
    WebDriver webDriver;

    public HeroicSite(WebDriver driver) {
       this.webDriver = driver;
    }

    public RegistrationPage registrationPage() {
        return new RegistrationPage(webDriver);
    }

}

