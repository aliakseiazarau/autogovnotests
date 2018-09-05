package PageFactoryFiles;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class MainSupport {

    public WebDriver webDriver;
    public  JavascriptExecutor js;
    public MainSupport (WebDriver driver) {
        webDriver = driver;
        js = (JavascriptExecutor)webDriver;
        WebDriverWait wait;
        PageFactory.initElements(webDriver, this);
    }

    public void handleMultipleWindows(String windowTitle) {
        Set<String> windows = webDriver.getWindowHandles();

        for (String window : windows) {
            webDriver.switchTo().window(window);
            if (webDriver.getTitle().contains(windowTitle)) {
                return;
            }
        }
    }
    public  void removeItemFromLocalStorage(String item) {
        js.executeScript(String.format(
                "window.localStorage.removeItem('%s');", item));
    }

    public void clearLocalStorage() {
        js.executeScript(String.format("window.localStorage.clear();"));
    }
}


