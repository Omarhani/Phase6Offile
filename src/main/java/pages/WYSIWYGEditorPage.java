package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WYSIWYGEditorPage {

    WebDriver driver;
    WebDriverWait wait;

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    private final String frame = "mce_0_ifr";
    private final By textArea = By.id("tinymce");

    private final By increaseIndent = By.cssSelector("[aria-label='Increase indent']");

    public void clearText() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        switchToFrame();
        wait.until(ExpectedConditions.textToBe(textArea,"Your content goes here."));
        driver.findElement(textArea).clear();
        switchToParent();
    }

    public void insertText(String text) {
        switchToFrame();
        driver.findElement(textArea).sendKeys(text);
        switchToParent();
    }

    private void switchToFrame() {
        driver.switchTo().frame(frame);
    }

    private void switchToParent() {
        driver.switchTo().parentFrame();
    }

    public String getTextValue() {
        String text;
        switchToFrame();
        text = driver.findElement(textArea).getText();
        switchToParent();
        return text;
    }

    public void clickOnIncreaseIndentButton(){
        driver.findElement(increaseIndent).click();
    }

}
