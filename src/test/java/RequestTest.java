import generator.Generator;
import generator.PropertyLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.AutorizationPage;
import page.RequestPage;
import page.UserPage;

import java.util.concurrent.TimeUnit;

public class RequestTest {
    private WebDriver driver;
    private AutorizationPage autorizationPage;
    private RequestPage requestPage;
    private Generator generator;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        requestPage = new RequestPage(driver);
        autorizationPage = new AutorizationPage(driver);
        generator = new Generator();
    }
//
//    @AfterMethod
//    public void testDown(){
//        driver.quit();
//    }

    @Test
    public void newRequestDdu(){
        driver.get(new PropertyLoader().getProperty("url.requestTest"));
        autorizationPage.emailField.sendKeys(new PropertyLoader().getProperty("login"));
        autorizationPage.passwordField.sendKeys(new PropertyLoader().getProperty("password"));
        autorizationPage.autorizationButton.click();

        requestPage.newRequestButton.click();
        requestPage.dduButton.click();
        requestPage.registrDduButton.click();
        requestPage.createRequestButton.click();
        requestPage.typeObjectDrop.clickList("Квартира");
        requestPage.complexDrop.clickList("УДороги");
        requestPage.uslovniyNomerField.sendKeys("777");
        requestPage.addSellerButton.click();
        requestPage.searchSellerDrop.sendKeys("Цемент");
        requestPage.searchSellerDrop.clickList3("цемент");
        requestPage.addBuyerButton.click();
        requestPage.searchSellerDrop.sendKeys("пос");
        requestPage.searchSellerDrop.clickList2("Посрор Виктор Физикович без представителя , 235-347-456 45");
        requestPage.addDocOsnovButton.click();
        requestPage.nameDocOsnovFild.sendKeys("Договор участия в долевом строительстве");
        requestPage.numberDocOsnovField.sendKeys("77");
        requestPage.dateDocOsnovField.sendKeys(generator.getDateBirthday());
        String text = "C:/Users/ssardaev.NE0D4E8288246/Desktop/sevrulAuto/ДдуТест.pdf";
        System.out.println(text);
        requestPage.downloadFileOsnovField.sendKeys(text);
        //requestPage.addDocOsnovButton.click();
        requestPage.sformStatmentButton.click();
    }

    @Test(description = "заявка создается")
    public void create(){
        driver.get(new PropertyLoader().getProperty("url.requestTest"));
        autorizationPage.emailField.sendKeys(new PropertyLoader().getProperty("login"));
        autorizationPage.passwordField.sendKeys(new PropertyLoader().getProperty("password"));
        autorizationPage.autorizationButton.click();

        requestPage.newRequestButton.click();
        requestPage.dduButton.click();
        requestPage.registrDduButton.click();
        requestPage.createRequestButton.click();
        Assert.assertTrue(requestPage.statusNovayaField.isDisplayed());
    }
}
