package page;

import factory.Button;
import factory.DropDown;
import factory.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestPage {

    public Button newRequestButton;
    public DropDown reestrRequestDrop;
    public Button createRequestButton;
    public Button dduButton;
    public Button registrDduButton;
    public Button copyButton;
    public Button addSellerButton;
    public Button addBuyerButton;
    public Button addDocOsnovButton;
    public Button addDocDopButton;
    public Field downloadFileOsnovField;
    public Field downloadFileDopField;
    public Button deleteDocButton;
    public Button sformStatmentButton;
    public Button saveButton;
    public Button sendRegistrationButton;
    public DropDown typeObjectDrop;
    public DropDown complexDrop;
    public DropDown numberHomeDrop;
    public DropDown infoIpotekalDrop;
    public DropDown searchSellerDrop;
    public DropDown searchBuyerDrop;
    public Field nameDocOsnovFild;
    public Field numberDocOsnovField;
    public Field dateDocOsnovField;
    public Field nameDocDopField;
    public Field seriesDocDopField;
    public Field numberDocDopField;
    public Field dateDocDopField;
    public Field issuedDocDopField;
    public Field uslovniyNomerField;
    //логика скачивания файла и дальнейшее его добавление

    public RequestPage(WebDriver driver){
        this.newRequestButton = new Button(driver, By.xpath("//button[text()='Новая заявка']"));
        this.reestrRequestDrop = new DropDown(driver,By.xpath("//div[@class=\"Menu__container--3Qoqq\"]"));
        this.dduButton = new Button(driver,By.xpath("//span[text()='ДДУ']"));
        this.registrDduButton = new Button(driver,By.xpath("//span[text()='Регистрация ДДУ']"));
        this.createRequestButton = new Button(driver,By.xpath("//button[text()='Создать заявку']"));
        this.copyButton = new Button(driver,By.xpath("//button[text()='Копировать заявку']"));
        this.addSellerButton = new Button(driver,By.xpath("(//button[@class=\"ct-button EditList__add--3oMn- Button__btn--i_ybi Button__btn--size_l--1i0WC Button__btn--type_secondary--1yhbS\"])[1]"));
        this.addBuyerButton = new Button(driver,By.xpath("(//button[@class=\"ct-button EditList__add--3oMn- Button__btn--i_ybi Button__btn--size_l--1i0WC Button__btn--type_secondary--1yhbS\"])[2]"));
        this.addDocOsnovButton = new Button(driver, By.xpath("(//button[@class=\"ct-button EditList__add--3oMn- Button__btn--i_ybi Button__btn--size_l--1i0WC Button__btn--type_secondary--1yhbS\"])[3]"));
        this.addDocDopButton = new Button(driver, By.xpath("(//button[@class=\"ct-button EditList__add--3oMn- Button__btn--i_ybi Button__btn--size_l--1i0WC Button__btn--type_secondary--1yhbS\"])[4]"));
        this.downloadFileOsnovField = new Field(driver, By.xpath("//input[@type='file']"));
        this.downloadFileDopField= new Field(driver, By.xpath("(//input[@type='file'])[2]"));
        this.sformStatmentButton = new Button(driver,By.xpath("//button[text()='Сформировать заявление'] "));
        this.saveButton = new Button(driver,By.xpath("//button[text()='Сохранить'] "));
        this.sendRegistrationButton = new Button(driver,By.xpath("//button[text()='Отправить на регистрацию'] "));
        this.typeObjectDrop = new DropDown(driver, By.xpath("//*[text()='Тип объекта']/..//*[@class=\"Select__select__arrow--3N4X7\"]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.complexDrop = new DropDown(driver, By.xpath("//*[text()='Комплекс']/..//*[@class=\"Select__select__arrow--3N4X7\"]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.numberHomeDrop = new DropDown(driver, By.xpath("//*[text()='Номер дома']/..//*[@class=\"Select__select__arrow--3N4X7\"]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.infoIpotekalDrop = new DropDown(driver, By.xpath("//*[text()='Информация о кредите и залоге']/..//*[@class=\"Select__select__arrow--3N4X7\"]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.searchSellerDrop = new DropDown(driver,By.xpath("//input[@name=\"seller.0.client.id\"]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.searchBuyerDrop = new DropDown(driver,By.xpath("//input[@name=\"buyer.0.client.id\"]"),By.xpath("//*[@class=\"rc-select-item-option-content\"]"));
        this.nameDocOsnovFild = new Field(driver,By.xpath("//input[@name=\"documents.0.name\"]"));
        this.numberDocOsnovField = new Field(driver,By.xpath("//input[@name=\"documents.0.number\"]"));
        this.dateDocOsnovField  = new Field(driver,By.xpath("//input[@name=\"documents.0.date\"]"));
        this.nameDocDopField = new Field(driver,By.xpath("//input[@name=\"documents.0.number\"]"));
        this.seriesDocDopField = new Field(driver,By.xpath("//input[@name=\"optionalDocuments.0.series\"]"));
        this.numberDocDopField = new Field(driver,By.xpath("//input[@name=\"optionalDocuments.0.number\"]"));
        this.dateDocDopField = new Field(driver,By.xpath("//input[@name=\"optionalDocuments.0.date\"]"));
        this.issuedDocDopField = new Field(driver,By.xpath("//input[@name=\"optionalDocuments.0.issuerOrgan\"]"));
        this.uslovniyNomerField = new Field(driver,By.xpath("//input[@name=\"condNum\"]"));

    }

}
