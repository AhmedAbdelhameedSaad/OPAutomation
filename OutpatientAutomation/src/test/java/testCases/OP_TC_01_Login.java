package testCases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import opd_authentication.Authentication;
import testBase.HP_Test_Base;
import testBase.Page_Base;


public class OP_TC_01_Login extends HP_Test_Base {

 
	Authentication loginobj;
   
  
   @Test
	public void  user_login_success()
	{
            
    	loginobj = new Authentication(driver); 
		
		 loginobj.CMO_login_HP("CMOOPD02", "egy123");

	}
	
	
}

