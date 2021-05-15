package page;

import factory.Button;
import factory.DropDown;
import factory.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComplexPage {

    public Button newComplexButton;
    public Button addPlotButoon;
    public Button addButton;
    public Button controlHomeButton;
    public Button controlPlotButton;
    public Button saveButton;
    public Field nameComplexField;
    public DropDown developerDrop;
    public Field plotNumberField;
    public Field kadastNumberField;
    public DropDown adressDrop;
    public Field areaField;
    public Field numberHomeField;

    public ComplexPage(WebDriver driver){
        this.newComplexButton = new Button(driver, By.xpath("//button[text()='Новый комплекс']"));
        this.addPlotButoon = new Button(driver, By.xpath("//button[text()='Добавить участок']"));
        this.addButton = new Button(driver, By.xpath("//button[text()='Добавить']"));
        this.controlHomeButton = new Button(driver,By.xpath("(//input[@class=\"Radio__hidden--2Je5H\"])[2]"));
        this.controlPlotButton = new Button(driver,By.xpath("//span[text()='Управление участками']"));
        this.saveButton = new Button(driver,By.xpath("//button[text()='Сохранить']"));
        this.nameComplexField = new Field(driver, By.xpath("//input[@name=\"name\"]"));
        this.developerDrop = new DropDown(driver, By.xpath("//*[text()='Застройщик']/..//*[@class=\"Select__select__arrow--3N4X7\"]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.plotNumberField = new Field(driver,By.xpath("//input[@name=\"lands.0.name\"]"));
        this.kadastNumberField = new Field(driver,By.xpath("//input[@name=\"lands.0.cadNumZu\"]"));
        this.adressDrop = new DropDown(driver, By.xpath("//textarea[@name=\"lands.0.address.value\"]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.areaField = new Field(driver,By.xpath("//input[@name=\"lands.0.area\"]"));
        this.numberHomeField = new Field(driver,By.xpath("//input[@name=\"number\"]"));

         //*[text()='Застройщик']/../..//*[@class="rc-select-selector"] click
        //*[@class="rc-select-item-option-content"]

    }

}
