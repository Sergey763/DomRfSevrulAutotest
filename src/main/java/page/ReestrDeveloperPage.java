package page;

import factory.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReestrDeveloperPage {
    public Field developersField;

    public ReestrDeveloperPage(WebDriver driver) {
        this.developersField = new Field(driver, By.xpath("(//*[@class=\"col-lg-5 ListData__list__cell--2VXt_ ListData__list__cell--overflow--w5T7A\"])[1]"));
    }
}
