package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField= By.id("file-upload");
    private By upLoadButton= By.id("file-submit");
    private  By uploadedFiles=By.id("uploaded-files");
    public FileUploadPage(WebDriver driver){this.driver=driver;}
    public void clickUploadButton(){driver.findElement(upLoadButton).click();}
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }
    public String getUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }
}
