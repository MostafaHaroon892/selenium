package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class AlertTest extends BaseTests {
    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You clicked: Ok", "You clicked: Ok");
    }
        @Test
        public void testGetTextFromAlert(){
            var alertsPage=homePage.clickJavaScriptAlerts();
            alertsPage.triggerConfirm2();
            String text=alertsPage.alert_getText();
            alertsPage.alert_clickToDismiss();
            assertEquals(text,"I am a JS Alert","I am a JS Alert");
        }

        @Test

        public void testSetInputAlert() {
            var alertPage = homePage.clickJavaScriptAlerts();
            alertPage.triggerPrompt();

            String text="Mostafa Haroon Work";
            alertPage.alert_setInput(text);
            alertPage.alert_clickToAccept();
            assertEquals(alertPage.getResult(), "You entered: "+text , "You entered: Mostafa Haroon Work");
        }
    }


