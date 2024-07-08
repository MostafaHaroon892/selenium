package base;

import Pages.HomePage;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.WindowManager;
import java.io.File;
import java.io.IOException;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resourses/chromedriver.exe");

        driver =new ChromeDriver();
        driver.manage().window().maximize();
        //maximize the window
        homePage = new HomePage(driver);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        goHome();
        setCookie();

        /*driver.manage().window().setSize(new Dimension(375,812));
        /set the window to specific size for mobile
        System.out.println(driver.getTitle());
        /WebElement inputsLink=driver.findElement(By.linkText("Inputs"));
       / inputsLink.click();
        List<WebElement> Links=driver.findElements(By.tagName("a"));
        / find all the elements that contain a letter
        System.out.println(Links.size());*/

    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown()  {driver.quit();}

    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE==result.getStatus()){
            var camera=(TakesScreenshot)driver;
            File screenshot =camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resourses/screenShots/tests.png"));
            }catch (IOException e){
                e.printStackTrace();
            }//only take screenshot if fail
        }

    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable-infobars");
        return options;
    }
    private void setCookie(){
        Cookie cookie=new Cookie.Builder("tau","123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }
    public  WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}


