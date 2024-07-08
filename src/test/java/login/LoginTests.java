package login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
       LoginPage loginPage =homePage.clickFormAuthentication();
       loginPage.setUserName("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
      SecureAreaPage secureAreaPage= loginPage.clickLoginButton();
      assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"done successfully");
      //BETTER THAN ASSERT EQUAL BECAUSE ASSERT EQUAL MUST BE THE SAME THIS ONE JUST MUST  CONTAIN THE TEXT EVEN ITS DIFFERENT
    }
}
