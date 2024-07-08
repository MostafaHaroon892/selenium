package alerts;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class FileUploadTests  extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage=homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\EL 7aG\\Desktop\\New folder");


        assertEquals(uploadPage.getUploadedFiles(),"Agile crash course","Up loaded");
    }
}
