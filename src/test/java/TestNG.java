import org.testng.annotations.*;

public class TestNG {

   @BeforeMethod
   public void beforeMethod(){
       System.out.println("sign in");
   }
   @AfterMethod
   public void AfterMethod(){
       System.out.println("sign out");
   }
    @BeforeClass
    public void beforeClass(){
        System.out.println("open test application");
    }
    @Test
    public void searchCustomer(){
        System.out.println("searchCustomer");
    }
    @Test
    public void searchItem(){
        System.out.println("searchItem");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("close test application");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("open chrome");}
    @AfterTest
    public void AfterTest(){
        System.out.println("close chrome");}

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("set up system");}
    @AfterSuite
    public void AfterSuite(){
        System.out.println("clean all cookies");}

}
