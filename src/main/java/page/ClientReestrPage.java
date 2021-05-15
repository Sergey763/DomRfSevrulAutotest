package page;

import factory.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientReestrPage {

    public Field clientsField;

    public ClientReestrPage(WebDriver driver){
        this.clientsField = new Field(driver, By.xpath("(//*[@class=\"col-lg-5 ListData__list__cell--2VXt_ ListData__list__cell--overflow--w5T7A\"])[1]"))
    }
}
