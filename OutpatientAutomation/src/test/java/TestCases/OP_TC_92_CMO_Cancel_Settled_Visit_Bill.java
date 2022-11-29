package TestCases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.Read_Excel_Register_Patient;
import opd_Generate_Visit_Bill.Cmo_Cancel_and_Unsettle_Visit_Bill;
import opd_Generate_Visit_Bill.Cmo_Generate_and_Preview_Visit_Bill;
import opd_authentication.Authentication;
import testBase.HP_Test_Base;


public class OP_TC_92_CMO_Cancel_Settled_Visit_Bill extends HP_Test_Base {
	
	
	Authentication loginobject2;
	Cmo_Cancel_and_Unsettle_Visit_Bill cancelObj;
	   
	   @Test(priority=1)
		public void  user_login_()
		{
	            
	    	loginobject2 = new Authentication (driver); 
			 loginobject2.login_HP("CMOOPD02", "egy123"); 

		}
	

@Test(priority=2 )
public void  CMO_Cancel_Settled_Bill() throws InterruptedException 

{
	cancelObj = new Cmo_Cancel_and_Unsettle_Visit_Bill(driver);
	
	cancelObj.Cmo_Cancel_Settled_VisitBill("A100072502");
	
} 

}






