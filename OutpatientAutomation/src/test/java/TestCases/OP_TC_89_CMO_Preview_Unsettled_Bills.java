package TestCases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.Read_Excel_Register_Patient;
import opd_Generate_Visit_Bill.Cmo_Generate_and_Preview_Visit_Bill;
import opd_authentication.Authentication;
import testBase.HP_Test_Base;


public class OP_TC_89_CMO_Preview_Unsettled_Bills extends HP_Test_Base {
	
	Cmo_Generate_and_Preview_Visit_Bill bookAppointByNaionalID;
	Authentication loginobject2;
	   
	   @Test(priority=1)
		public void  user_login_()
		{
	            
	    	loginobject2 = new Authentication (driver);
			 loginobject2.login_HP("CMOOPD02", "egy123");

		}
	

	

@Test(priority=2 )
public void  User_Generate_Visit_Bill() throws InterruptedException 

{
	 	
	bookAppointByNaionalID = new Cmo_Generate_and_Preview_Visit_Bill(driver) ; 
	 
	bookAppointByNaionalID.Cmo_Preview_Unsettled_Bills("مريض MOH" );  
	 
} 

}






