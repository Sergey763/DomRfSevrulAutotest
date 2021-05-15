import generator.Generator;
import generator.PropertyLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.*;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class ComplexTest {

    private WebDriver driver;
    private AutorizationPage autorizationPage;
    private DeveloperPage developerPage;
    private ReestrDeveloperPage reestrDeveloperPage;
    private Generator generator;
    private ComplexPage complexPage;
    private ReestrComplexPage reestrComplexPage;


    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        developerPage = new DeveloperPage(driver);
        autorizationPage = new AutorizationPage(driver);
        generator = new Generator();
        reestrDeveloperPage = new ReestrDeveloperPage(driver);
        complexPage = new ComplexPage(driver);
        reestrComplexPage = new ReestrComplexPage(driver);
        driver.get(new PropertyLoader().getProperty("url.complexTest"));
        autorizationPage.emailField.sendKeys(new PropertyLoader().getProperty("login"));
        autorizationPage.passwordField.sendKeys(new PropertyLoader().getProperty("password"));
        autorizationPage.autorizationButton.click();
    }

    //    @After
//    public void testDown(){
//        driver.quit();
//    }

    @Test(description = "test стенд Создание Комплекса")
    public void createComplex(){
        complexPage.newComplexButton.click();
        complexPage.nameComplexField.sendKeys("Рандом");
        String nameComplex = complexPage.nameComplexField.getValue();
        complexPage.developerDrop.clickList("ПАО СБЕРБАНК");
        complexPage.plotNumberField.sendKeys("777");
        complexPage.kadastNumberField.sendKeys("77:77:7777777:7");
        complexPage.adressDrop.sendKeys("г Москва");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        complexPage.adressDrop.clickList2("г москва");
        complexPage.areaField.sendKeys("77");
        complexPage.saveButton.click();
        complexPage.controlHomeButton.click();
        complexPage.numberHomeField.sendKeys("7");
        complexPage.addButton.click();
        complexPage.saveButton.click();
        driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
        Assert.assertEquals(nameComplex,reestrComplexPage.complexField.getText());
    }
}
