package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseEx {
    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resourses/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        WebElement inputsLink=driver.findElement(By.linkText("Shifting Content"));
        inputsLink.click();
        WebElement iinputsLink=driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]"));
        iinputsLink.click();
        List<WebElement>menuItems=driver.findElements(By.tagName("Li"));
        // counting the number of items in a menu
        System.out.println("Number of menu items "+menuItems.size());
        driver.quit();

    }
    public static void main(String args[]){
        BaseEx Tests=new BaseEx();
        Tests.setUp();
    }
}




