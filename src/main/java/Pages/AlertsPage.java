package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerConfirmButton= By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerConfirm2Button= By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton= By.xpath(".//button[text()='Click for JS Prompt']");
    private By results=By.id("result");
    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerConfirm2(){
        driver.findElement(triggerConfirm2Button).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }
    public String alert_getText(){
       return driver.switchTo().alert().getText();
    }
    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(results).getText();
    }
}
