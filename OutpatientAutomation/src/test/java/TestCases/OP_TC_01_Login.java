package TestCases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Login.Login_HP;
import testBase.Page_Base;


public class OP_TC_01_Login extends Test_Base {

 
   Login_HP loginobj;
   Page_Base pageobject;
  
   @Test
	public void  user_login_success()
	{
            
    	loginobj = new Login_HP(driver);
		
		 loginobj.login_Edge("CMOOPD02", "egy123");

	}
	
	
}

