package page;

import factory.DropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {

    public DropDown sectionDrop;

    public MenuPage(WebDriver driver){
        this.sectionDrop = new DropDown(driver, By.xpath("//div[@class=\"Menu__container--3Qoqq\"]"));
    }
}
