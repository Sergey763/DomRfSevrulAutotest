import generator.Generator;
import generator.PropertyLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.AutorizationPage;
import page.UserPage;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class UserTest {
    private WebDriver driver;
    private UserPage userPage;
    private AutorizationPage autorizationPage;
    private Generator generator;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userPage = new UserPage(driver);
        autorizationPage = new AutorizationPage(driver);
        generator = new Generator();
    }

//    @AfterMethod
//    public void testDown(){
//        driver.quit();
//    }

    @Test(description = "test стенд Создание участника Физическое лицо")
    public void createClient() {
        driver.get(new PropertyLoader().getProperty("url.clientTest"));
        autorizationPage.emailField.sendKeys(new PropertyLoader().getProperty("login"));
        autorizationPage.passwordField.sendKeys(new PropertyLoader().getProperty("password"));
        autorizationPage.autorizationButton.click();

        userPage.newClientButton.click();
        userPage.fizLicoButton.click();
        userPage.createButton.click();
        userPage.fizLastNameField.sendKeys("Руни");
        userPage.fizFirstNameField.sendKeys("Уэйн");
        userPage.fizMiddleNameField.sendKeys("Марк");
        userPage.fizBirthdateField.sendKeys(generator.getDateBirthday());
//        userPage.fizGenderDrop.clickList("Мужской");
//        userPage.fizMestoRogdeniaField.sendKeys("Англия");
//        userPage.fizEmailField.sendKeys(generator.getMil());
//        userPage.fizPhoneField.sendKeys(generator.getPhone());
//        userPage.fizCodeKeyField.sendKeys("кодик");
//        userPage.docTypeDrop.clickList("Паспорт гражданина Российской Федерации");
//        userPage.fizSeriesField.sendKeys("2942");
//        userPage.fizNumbersField.sendKeys("298249");
//        userPage.fizCodeField.sendKeys("310030");
//        userPage.fizkemVidanField.sendKeys("МРО УФМС РОССИИ ПО БЕЛГОРОДСКОЙ ОБЛ. В Г. АЛЕКСЕЕВКА");
//        userPage.fizDateField.sendKeys("10112011");
//        userPage.fizSnilsField.sendKeys("98923842390");
//        userPage.fizInnField.sendKeys("985923948092");
//        userPage.fizAdressDrop.sendKeys("г Санкт-Петербург");
//        userPage.fizAdressDrop.clickList2("г Санкт-Петербург");
        userPage.agentCircleButton.click();
//        userPage.agentFirstNameField.sendKeys("Райкконен");
//        userPage.agentLastNameField.sendKeys("Кими");
//        userPage.agentMiddleNameField.sendKeys("Матиас");
//        userPage.agentBirthdayField.sendKeys("17091979");
//        userPage.agentGenderDrop.clickList("Мужской");
//        userPage.agentMestoRojdeniaField.sendKeys("Англия");
//        userPage.agentEmailField.sendKeys(generator.getMil());
//        userPage.agentPhoneField.sendKeys(generator.getPhone());
//        userPage.agentCodeKeyField.sendKeys("кодик");
//        userPage.agentDocTypeDrop.clickList("Паспорт гражданина Российской Федерации");
//        userPage.agentSeriesFiled.sendKeys("2942");
//        userPage.agentNumberFiled.sendKeys("298249");
//        userPage.agentCodeFiled.sendKeys("310030");
//        userPage.agentKemVadanFiled.sendKeys("МРО УФМС РОССИИ ПО БЕЛГОРОДСКОЙ ОБЛ. В Г. АЛЕКСЕЕВКА");
//        userPage.agentDateFiled.sendKeys("10112011");
//        userPage.agentSnilsFiled.sendKeys("98923842390");
//        userPage.agentInnFiled.sendKeys("985923948092");
        userPage.agentAdressDrop.sendKeys("г Москва");
        userPage.agentAdressDrop.clickList3("г мос");
//        userPage.ppNamedocDrop.sendKeys("Акт инвентаризации");
//        try {
//            sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        userPage.ppNamedocDrop.clickList2("акт инвентаризации");
//        userPage.ppSeriesFiled.sendKeys("763");
//        userPage.ppNumberdocFiled.sendKeys("1234567");
//        userPage.ppDateDocFiled.sendKeys("09102010");
//        userPage.ppOrganDocField.sendKeys("отделом");
        userPage.downloadFileField.sendKeys("C:/Users/ssardaev.NE0D4E8288246/Desktop/sevrulAuto/Докси.pdf");
//        userPage.saveButton.click();
    }
}
