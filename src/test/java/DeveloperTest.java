import generator.Generator;
import generator.PropertyLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.AutorizationPage;
import page.DeveloperPage;
import page.ReestrDeveloperPage;


import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class DeveloperTest {

        private WebDriver driver;
        private AutorizationPage autorizationPage;
        private DeveloperPage developerPage;
        private ReestrDeveloperPage reestrDeveloperPage;
        private Generator generator;


    @BeforeMethod
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            developerPage = new DeveloperPage(driver);
            autorizationPage = new AutorizationPage(driver);
            generator = new Generator();
            reestrDeveloperPage = new ReestrDeveloperPage(driver);
            driver.get(new PropertyLoader().getProperty("url.developerTest"));
            autorizationPage.emailField.sendKeys(new PropertyLoader().getProperty("login"));
            autorizationPage.passwordField.sendKeys(new PropertyLoader().getProperty("password"));
            autorizationPage.autorizationButton.click();
        }
//    @After
//    public void testDown(){
//        driver.quit();
//    }

        @Test
        public void creatDeveloper() {
            developerPage.newDeveloperButton.click();
            developerPage.fullNameDrop.sendKeys("Сбербанк");
            developerPage.fullNameDrop.clickList("пао сбербанк");
            String nameDeveloper = developerPage.shortNameField.getValue();
            developerPage.phoneField.sendKeys("9181593777");
            developerPage.emailField.sendKeys("test@yandex.ru");
            developerPage.lastNameField.sendKeys("Греф");
            developerPage.firstNameField.sendKeys("Герман");
            developerPage.middleNameField.sendKeys("Оскарович");
            developerPage.lastNameRpField.sendKeys("Грефа");
            developerPage.firstNameRpField.sendKeys("Германа");
            developerPage.middleNameRpField.sendKeys("Оскаровича");
            developerPage.positionField.sendKeys("гд");
            developerPage.positionRpField.sendKeys("гд");
            developerPage.polnomochiaDrop.clickList("Доверенность");
            developerPage.nameDocField.sendKeys("без документа");
            developerPage.numberField.sendKeys("777");
            developerPage.dateDocField.sendKeys("07072007");
            developerPage.adressDrop.sendKeys("г Санкт-Петербург");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            developerPage.adressDrop.clickList2("г санкт-петербург");
            developerPage.saveButton.click();
            Assert.assertEquals(nameDeveloper,reestrDeveloperPage.developersField.getText());
        }
    }


