package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    WebDriver driver;
    public SecureAreaPage(WebDriver driver) {
        this.driver =driver;
    }

    //  locators

    private final By validationMessage = By.id("flash");

    public String getValidationMessage(){
        String text = null;
        text = driver.findElement(validationMessage).getText();
        return text;
    }
}
