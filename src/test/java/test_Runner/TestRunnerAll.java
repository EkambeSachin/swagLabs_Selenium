package test_Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import swaglabs_seleniumPOM.*;

public class TestRunnerAll extends BaseClass {
	
	 @Test
	 public void RunAllTestCases() {
//       WebDriverManager.edgedriver().setup();
//      driver=new EdgeDriver();
      
      
      //open Url
      driver.get(Url);
      //maximise window
      driver.manage().window().maximize();
      
      //create object for logipage
      Login_page Lp =new Login_page(driver);
      //called methods loginpage using object
      Lp.EnterUsername("standard_user");
      Lp.EnterPassword("secret_sauce");
      Lp.ClickOnLogin();
      
      Product_page pg=new Product_page(driver);
      pg.addProduct();
      pg.clickOnCart();
      
      Add_to_Cart ac = new Add_to_Cart(driver);
      ac.clickOnCheckOut();
      
      Info in=new Info(driver);
      in.EnterFname("Sachin");
      in.EnterLastName("Ekambe");
      in.EnterPostalCode("102030");
      in.ClickOnContinue();
      
      
	 }
 
}
