package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class frames extends BaseTests {
    @Test
    public void testWysiwyg(){
        var editorPage=homePage.clickWysiwygEditorPage();
        editorPage.clearTextArea();
        String text1="hello";
        String text2="world";
        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFormEditor(),text1+text2,"text from editor is incorrect");
    }
}
