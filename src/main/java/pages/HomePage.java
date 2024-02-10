package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private final By formAuthenticationLink = By.linkText("Form Authentication");

    private final By checkboxLink = By.linkText("Checkboxes");


    public LoginPage clickOnFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}
