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
    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");

    private final By dropdownLink = By.linkText("Dropdown");


    public LoginPage clickOnFormAuthenticationLink(){
        clickOnLink(formAuthenticationLink);
        return new LoginPage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        clickOnLink(dynamicLoadingLink);
        return new DynamicLoadingPage(driver);
    }

    public DropdownPage clickOnDropdownLink(){
        clickOnLink(dropdownLink);
        return new DropdownPage(driver);
    }
    private void clickOnLink(By locator){
        driver.findElement(locator).click();
    }

}
