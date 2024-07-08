package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {
    @Test
    public void testSelectOption(){
       var dropDownPage=homePage.ClickDropDown();
       String Option="Option 1";
       dropDownPage.selectFromDropDown(Option);
       var SelectedOptions=dropDownPage.getSelectedOptions();
       assertEquals(SelectedOptions.size(), 1, "incorrect number");
       assertTrue(SelectedOptions.contains(Option),"option not selected");
    }
}
