package page;

import factory.Button;
import factory.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutorizationPage {

    public Field emailField;
    public Field passwordField;
    public Button autorizationButton;

    public AutorizationPage(WebDriver driver){
        this.emailField = new Field(driver,By.xpath("//*[@id='username']"));
        this.passwordField = new Field(driver,By.xpath("//*[@id='password']"));
        this.autorizationButton = new Button(driver,By.xpath("//*[@id='kc-login']"));
    }


}
