package checkbox;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxTests extends BaseTests {

    @Test(priority = 1)
    public void testCheckBox(){
        driver.findElement(By.linkText("Checkboxes")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected());
        assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected());
    }



}
