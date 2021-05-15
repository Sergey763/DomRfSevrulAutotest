package page;

import factory.Button;
import factory.DropDown;
import factory.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeveloperPage {

    public Button newDeveloperButton;
    public Button saveButton;
    public DropDown fullNameDrop;
    public Field shortNameField;
    public Field ogrnField;
    public Field innField;
    public Field kppField;
    public Field dateRegistField;
    public Field phoneField;
    public Field emailField;
    public Field lastNameField;
    public Field firstNameField;
    public Field middleNameField;
    public Field lastNameRpField;
    public Field firstNameRpField;
    public Field middleNameRpField;
    public Field positionField;
    public Field positionRpField;
    public DropDown polnomochiaDrop;
    public Field nameDocField;
    public Field numberField;
    public Field dateDocField;
    public DropDown adressDrop;
    public DropDown reestrDeveloper;

    public DeveloperPage(WebDriver driver) {
        this.newDeveloperButton = new Button(driver, By.xpath("//button[text()='Новый застройщик']"));
        this.saveButton = new Button(driver, By.xpath("//button[text()='Сохранить']"));
        this.fullNameDrop = new DropDown (driver, By.xpath("//input[@name=\"name\"]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.shortNameField = new Field (driver,By.xpath("//input[@name=\"firmShortName\"]"));
        this.ogrnField = new Field (driver, By.xpath("//input[@name=\"ogrn\"]"));
        this.innField = new Field (driver, By.xpath("//input[@name=\"innOrg\"]"));
        this.kppField = new Field (driver, By.xpath("//input[@name=\"kpp\"]"));
        this.dateRegistField = new Field (driver, By.xpath("//input[@name=\"regDate\"]"));
        this.phoneField = new Field (driver, By.xpath("//input[@name=\"phoneOrg\"]"));
        this.emailField = new Field(driver, By.xpath("//input[@name=\"emailOrg\"]"));
        this.lastNameField = new Field (driver, By.xpath("//input[@name=\"director.lastName\"]"));
        this.firstNameField = new Field (driver, By.xpath("//input[@name=\"director.firstName\"]"));
        this.middleNameField = new Field (driver, By.xpath("//input[@name=\"director.middleName\"]"));
        this.lastNameRpField = new Field (driver, By.xpath("//input[@name=\"director.lastNameGenitive\"]"));
        this.firstNameRpField = new Field (driver,By.xpath("//input[@name=\"director.firstNameGenitive\"]"));
        this.middleNameRpField = new Field(driver, By.xpath("//input[@name=\"director.middleNameGenitive\"]"));
        this.positionField = new Field(driver, By.xpath("//input[@name=\"director.position\"]"));
        this.positionRpField = new Field (driver, By.xpath("//input[@name=\"director.positionGenitive\"]"));
        this.polnomochiaDrop = new DropDown(driver, By.xpath("//*[text()='Полномочия директора']/..//*[@class=\"Select__select__arrow--3N4X7\"]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.nameDocField = new Field(driver, By.xpath("//input[@name=\"director.documentName\"]"));
        this.numberField = new Field (driver, By.xpath("//input[@name=\"director.documentNumber\"]"));
        this.dateDocField = new Field(driver, By.xpath("//input[@name=\"director.documentDate\"]"));
        this.adressDrop = new DropDown(driver, By.xpath("//textarea[@name=\"address.value\"]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]\n"));
        this.reestrDeveloper = new DropDown(driver,By.xpath("//div[@class=\"ListData__list--3-gL0\"]"));
    }



}
