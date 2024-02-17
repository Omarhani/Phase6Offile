package wait;

import base.BaseTests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.OnePage;

public class DynamicLoadingTests extends BaseTests {
    @Test
    public void testDynamicLoading() {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        OnePage onePage = dynamicLoadingPage.clickOnExampleOneLink();
        onePage.clickOnStartButton();
        String actualResult = onePage.getValidationMessage();
        String expectedResult = "Hello World!";
        assertEquals(actualResult, expectedResult);


    }
}
