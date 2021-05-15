package page;

import factory.Button;
import factory.DropDown;
import factory.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage {

    public Button fizLicoButton;
    public DropDown reestrUsersDrop;
    public Button newClientButton;
    public Button createButton;
    public Button saveButton;
    public Field downloadFileField;
    public Button agentCircleButton;
    public Field fizLastNameField;
    public Field fizFirstNameField;
    public Field fizMiddleNameField;
    public Field fizBirthdateField;
    public DropDown fizGenderDrop;
    public Field fizMestoRogdeniaField;
    public Field fizEmailField;
    public Field fizPhoneField;
    public Field fizCodeKeyField;
    public DropDown pravoLgotiDrop;
    public DropDown docTypeDrop;
    public Field fizSeriesField;
    public Field fizNumbersField;
    public Field fizCodeField;
    public Field fizkemVidanField;
    public Field fizDateField;
    public Field fizSnilsField;
    public Field fizInnField;
    public DropDown fizAdressDrop;
    public Field agentLastNameField;
    public Field agentFirstNameField;
    public Field agentMiddleNameField;
    public Field agentBirthdayField;
    public DropDown agentGenderDrop;
    public Field agentMestoRojdeniaField;
    public Field agentEmailField;
    public Field agentPhoneField;
    public Field agentCodeKeyField;
    public DropDown agentDocTypeDrop;
    public Field agentSeriesFiled;
    public Field agentNumberFiled;
    public Field agentCodeFiled;
    public Field agentKemVadanFiled;
    public Field agentDateFiled;
    public Field agentSnilsFiled;
    public Field agentInnFiled;
    public DropDown agentAdressDrop;
    public DropDown ppNamedocDrop;
    public Field ppSeriesFiled;
    public Field ppNumberdocFiled;
    public Field ppDateDocFiled;
    public Field ppOrganDocField;

    public UserPage(WebDriver driver) {
        this.fizLicoButton = new Button(driver,By.xpath("(//div[@class=\"Badge__badge--1ie9s\"])[1]/.."));
        this.newClientButton = new Button(driver, By.xpath("//button[text()='Новый участник']"));
        this.createButton = new Button(driver, By.xpath("//button[text()='Создать участника']"));
        this.saveButton = new Button(driver, By.xpath("//button[text()='Сохранить']"));
        this.agentCircleButton = new Button(driver, By.xpath("//*[@class=\"CircleButton__button--ES6fF CircleButton__button--success--cNQb6 CircleButton__button--size_m--VsWor\"]"));
        this.fizLastNameField = new Field(driver, By.xpath("//input[@name=\"lastName\"]"));
        this.fizFirstNameField = new Field(driver, By.xpath("//input[@name=\"firstName\"]"));
        this.fizMiddleNameField = new Field(driver, By.xpath("//input[@name=\"middleName\"]"));
        this.fizBirthdateField = new Field(driver, By.xpath("//input[@name=\"birthDate\"]"));
        this.fizGenderDrop = new DropDown(driver, By.xpath("//*[text()='Пол']/..//*[@class=\"Select__select__arrow--3N4X7\"]"), By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.fizMestoRogdeniaField = new Field(driver, By.xpath("//textarea[@name=\"birthPlace\"]"));
        this.fizEmailField = new Field(driver, By.xpath("//input[@name=\"email\"]"));
        this.fizPhoneField = new Field(driver, By.xpath("//input[@name=\"phone\"]"));
        this.fizCodeKeyField = new Field(driver, By.xpath("//input[@name=\"keyword\"]"));
        this.pravoLgotiDrop = new DropDown(driver, By.xpath("//*[text()='Право льготы']/..//*[@class=\"Select__select__arrow--3N4X7\"]"), By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.docTypeDrop = new DropDown(driver, By.xpath("//*[text()='Тип документа']/..//*[@class=\"Select__select__arrow--3N4X7\"]"), By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.fizSeriesField = new Field(driver, By.xpath("//input[@name=\"docSeries\"]"));
        this.fizNumbersField = new Field(driver, By.xpath("//input[@name=\"docNumber\"]"));
        this.fizCodeField = new Field(driver, By.xpath("//input[@name=\"docIssuerCode\"]"));
        this.fizkemVidanField = new Field(driver, By.xpath("//textarea[@name=\"docIssuerOrgan\"] "));
        this.fizDateField = new Field(driver, By.xpath("//input[@name=\"docDate\"]"));
        this.fizSnilsField = new Field(driver, By.xpath("//input[@name=\"snils\"]"));
        this.fizInnField = new Field(driver, By.xpath("//input[@name=\"inn\"]"));
        this.fizAdressDrop = new DropDown(driver, By.xpath("//textarea[@name=\"address.value\"]"), By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.agentLastNameField = new Field(driver, By.xpath("//input[@name=\"agent.0.lastName\"]"));
        this.agentFirstNameField = new Field(driver, By.xpath("//input[@name=\"agent.0.firstName\"]"));
        this.agentMiddleNameField = new Field(driver, By.xpath("//input[@name=\"agent.0.middleName\"]"));
        this.agentGenderDrop = new DropDown(driver,By.xpath("(//*[text()='Пол']/..//*[@class=\"Select__select__arrow--3N4X7\"])[2]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.agentBirthdayField = new Field(driver, By.xpath("//input[@name=\"agent.0.birthDate\"]"));
        this.agentMestoRojdeniaField = new Field(driver, By.xpath("//textarea[@name=\"agent.0.birthPlace\"]"));
        this.agentEmailField = new Field(driver, By.xpath("//input[@name=\"agent.0.email\"]"));
        this.agentPhoneField = new Field(driver, By.xpath("//input[@name=\"agent.0.phone\"]"));
        this.agentCodeKeyField = new Field(driver, By.xpath("//input[@name=\"agent.0.keyword\"] "));
        this.agentDocTypeDrop = new DropDown(driver, By.xpath("(//*[text()='Тип документа']/..//*[@class=\"Select__select__arrow--3N4X7\"])[2]"), By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.agentSeriesFiled = new Field(driver, By.xpath("//input[@name=\"agent.0.docSeries\"]"));
        this.agentNumberFiled = new Field(driver, By.xpath("//input[@name=\"agent.0.docNumber\"]"));
        this.agentCodeFiled = new Field(driver, By.xpath("//input[@name=\"agent.0.docIssuerCode\"]"));
        this.agentKemVadanFiled = new Field(driver, By.xpath("//textarea[@name=\"agent.0.docIssuerOrgan\"] "));
        this.agentDateFiled = new Field(driver, By.xpath("//input[@name=\"agent.0.docDate\"]"));
        this.agentSnilsFiled = new Field(driver, By.xpath("//input[@name=\"agent.0.snils\"]"));
        this.agentInnFiled = new Field(driver, By.xpath("//input[@name=\"agent.0.inn\"]"));
        this.agentAdressDrop = new DropDown(driver, By.xpath("//textarea[@name=\"agent.0.address.value\"]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.ppNamedocDrop = new DropDown(driver, By.xpath("//input[@name=\"inDocuments.name\"]"), By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.ppSeriesFiled = new Field(driver, By.xpath("//input[@name=\"inDocuments.series\"]"));
        this.ppNumberdocFiled = new Field(driver, By.xpath("//input[@name=\"inDocuments.number\"]"));
        this.ppDateDocFiled = new Field(driver, By.xpath("//input[@name=\"inDocuments.date\"]"));
        this.ppOrganDocField = new Field(driver, By.xpath("//input[@name=\"inDocuments.issuerOrgan\"]"));
        this.reestrUsersDrop = new DropDown(driver,By.xpath("//div[@class=\"Menu__container--3Qoqq\"]"));
        //дописать логику загрузки файлов
        this.downloadFileField = new Field(driver, By.xpath("//input[@type=\"file\"]"));
        //:\Users\ssardaev.NE0D4E8288246\Desktop\Тестовые файлы\Документы

    }
}