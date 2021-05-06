package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.Message;

import java.nio.file.LinkOption;
import java.util.BitSet;

public class Button {
    private WebDriver driver;
    private By locator;

    public Button (WebDriver driver, By locator) {
        this.driver = driver;
        this.locator = locator;
    }

public void click() {
    driver.findElement(locator).click();
}
public boolean isDisplayed(){
    driver.findElement(locator).isDisplayed();
    return true;
}

public boolean isEnabled() {
    return driver.findElement(locator).isEnabled();
}

}
