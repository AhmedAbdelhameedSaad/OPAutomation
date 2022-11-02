package TestCases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Login.Login_HP;


public class TC_OP001_login_valid extends Test_Base

{
	 
   Login_HP loginobj;
  

   @Test
	public void  user_login_success()
	{
            
    	loginobj = new Login_HP("CMOOPD02", "egy123");
		
		 loginobj.login_Edge(driver);

	}
	

	
}

