package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    WebDriver driver;
    Select select;

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By dropDownList =By.id("dropdown");

    public void selectFromDropdownList(int index){
        select = new Select(driver.findElement(dropDownList));
        select.selectByIndex(index);
    }
}
