package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        var hoverPage=homePage.clickHovers();
        var caption=hoverPage.hoverOverFig(1);
       assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
       assertEquals(caption.getTitle(),"name: user1","Caption title correct");
       assertEquals(caption.getLinkText(),"View profile","caption link text is correct");
       assertTrue(caption.getLink().endsWith("/user1/1"),"Link incorrect");
    }
}
