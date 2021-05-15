import generator.Generator;
import generator.PropertyLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.*;

import java.util.concurrent.TimeUnit;

public class PolzovateliTest {
    private WebDriver driver;
    private AutorizationPage autorizationPage;
    private RequestPage requestPage;
    private PolzovateliPage polzovateliPage;
    private DeveloperPage developerPage;
    private MenuPage menuPage;
    private UserPage userPage;
    private ReestrDeveloperPage reestrDeveloperPage;
    private Generator generator;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        requestPage = new RequestPage(driver);
        autorizationPage = new AutorizationPage(driver);
        polzovateliPage = new PolzovateliPage(driver);
        developerPage = new DeveloperPage(driver);
        userPage = new UserPage(driver);
        menuPage = new MenuPage(driver);
        reestrDeveloperPage = new ReestrDeveloperPage(driver);
        generator = new Generator();
    }
//
//    @AfterMethod
//    public void testDown(){
//        driver.quit();
//    }

    @Test(description = "Кликнуть на поле Юридическое лицо")
    public void click(){
        driver.get(new PropertyLoader().getProperty("url.developerTest"));
        developerPage.reestrDeveloper.list();
        driver.get(new PropertyLoader().getProperty("url.usersTest"));
        autorizationPage.emailField.sendKeys(new PropertyLoader().getProperty("login"));
        autorizationPage.passwordField.sendKeys(new PropertyLoader().getProperty("password"));
        autorizationPage.autorizationButton.click();

        String text = polzovateliPage.usersFullNameField.getText();
        polzovateliPage.polzovatReestrDrop.clickList("Всеправный Михаил Иванович");

    }

    @Test(description = "Создание застройщика через пользователя")
        public void create(){
        driver.get(new PropertyLoader().getProperty("url.usersTest"));
        autorizationPage.emailField.sendKeys(new PropertyLoader().getProperty("login"));
        autorizationPage.passwordField.sendKeys(new PropertyLoader().getProperty("password"));
        autorizationPage.autorizationButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='67%'");


        polzovateliPage.polzovatelField.click();
//        polzovateliPage.developersDrop.clickList("АО \"ЦЕМЕНТ\"");
//        polzovateliPage.saveButton.click();
//
//        menuPage.sectionDrop.clickList("Застройщики");
//        developerPage.reestrDeveloper.clickList("АО \"ЦЕМЕНТ\"");
//        String nameDeveloper = developerPage.fullNameField.getValue();
//        menuPage.sectionDrop.clickList("Участники");
//        Assert.assertEquals(nameDeveloper,reestrDeveloperPage.developersField.getText());

    }
}
