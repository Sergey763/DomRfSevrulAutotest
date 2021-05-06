package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Field {
    private WebDriver driver;
    private By locator;

    public Field(WebDriver driver, By locator) {
        this.driver = driver;
        this.locator = locator;
    }

    public boolean isDisplayed(){
        boolean answer = driver .findElement(locator).isDisplayed();
        return answer;
    }
    public void clear(){
        driver.findElement(locator).clear();
    }

    public void sendKeys(String keys){
        clear();
        driver.findElement(locator).sendKeys(keys);
    }
    public String getValue(){
        String value = driver.findElement(locator).getAttribute("Value");
        return value;
    }
    public String getText(){
        String text = driver.findElement(locator).getText();
        return text;
    }
    public void click(){
        driver.findElement(locator).click();
    }
}
