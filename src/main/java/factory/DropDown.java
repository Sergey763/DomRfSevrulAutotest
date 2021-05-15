package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;

public class DropDown {

    private WebDriver driver;
    private By locatorDown;
    private By locatorSpisok;

    public DropDown(WebDriver driver, By locatorDown, By locatorSpisok) {
        this.driver = driver;
        this.locatorDown = locatorDown;
        this.locatorSpisok = locatorSpisok;
    }
    public DropDown(WebDriver driver, By locatorDown) {
        this.driver = driver;
        this.locatorDown = locatorDown;
    }

    public void sendKeys(String keys){
        driver.findElement(locatorDown).sendKeys(keys);
    }
    public void click() {
        driver.findElement(locatorDown).click();
    }


    public void clickList(String text) {
        click();
        List<WebElement> checkDrops = driver.findElements(locatorSpisok);
//        checkDrops.forEach((f)->{
//            System.out.println(f.getText());
//        });
        for (WebElement spisok : checkDrops) {
            if (spisok.getText().equals(text)) {
                spisok.click();
            }
        }
    }
    public void clickList2(String text) {
        List<WebElement> checkDrops = driver.findElements(locatorSpisok);

        for (WebElement spisok : checkDrops) {
            if (spisok.getText().equals(text.toLowerCase())) {
                spisok.click();
            }
        }
    }

    public void clickList3(String text) {
        List<WebElement> checkDrops = driver.findElements(locatorSpisok);

        for (WebElement spisok : checkDrops) {
            if (spisok.getText().contains(text)) {
                spisok.click();
            }
        }
    }

    public List<WebElement> list() {
        List<WebElement> checkDrops = driver.findElements(locatorSpisok);
        return checkDrops;
    }
    public String getText() {
        return driver.findElement(locatorDown).getText();
    }
}
