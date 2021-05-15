package page;

import factory.Button;
import factory.DropDown;
import factory.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PolzovateliPage {

    public Field usersFullNameField;
    public Field polzovatelField;
    public DropDown polzovatReestrDrop;
    public DropDown developersDrop;
    public Button saveButton;
    public Button requestsButton;


    public PolzovateliPage(WebDriver driver){
        this.polzovatelField = new Field(driver,By.xpath("//span[text() = \"Всеправный Михаил Иванович\"]"));
        this.usersFullNameField = new Field(driver, By.xpath("(//span[@class=\"Text__text__inner--1-8he\"])[2]"));
        this.polzovatReestrDrop = new DropDown(driver,By.xpath("///div[@class=\"ListData__list__item--3N9S_ row\"]"));
        this.developersDrop = new DropDown(driver,By.xpath("(//*[text()='Юридическое лицо']/..//*[@class=\"Select__select__arrow--3N4X7\"])[1]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.saveButton = new Button(driver,By.xpath("//button[text()='Сохранить']"));
        this.requestsButton = new Button(driver,By.xpath("//div[@class=\"Menu__container--3Qoqq\"]"));
    }

}
