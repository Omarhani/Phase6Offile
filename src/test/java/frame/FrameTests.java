package frame;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testFrame() {
        String text = "Hello";
        WYSIWYGEditorPage wysiwygEditorPage = homePage.clickOnWYSIWYGEditorLink();
        wysiwygEditorPage.clearText();
        wysiwygEditorPage.insertText(text);
        wysiwygEditorPage.clickOnIncreaseIndentButton();
        assertEquals(wysiwygEditorPage.getTextValue(),text);
    }
}
