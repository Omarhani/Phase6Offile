package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JSAlertPage;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {

    @Test
    public void testJSAlert() {
        JSAlertPage jsAlertPage = homePage.clickOnJSAlertLink();
        jsAlertPage.clickOnJSAlertButton();
        jsAlertPage.acceptAlert();
        String expectedResult = "You successfully clicked an alert";
        String actualResult = jsAlertPage.getValidationMessage();
        assertEquals(actualResult,expectedResult);
    }
}
