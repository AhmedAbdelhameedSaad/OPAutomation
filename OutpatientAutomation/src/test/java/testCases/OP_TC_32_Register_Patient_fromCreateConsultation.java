package testCases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.Read_Excel_Register_Patient;
import opd_Register_Patient.Register_Patient;
import opd_authentication.Authentication;


public class OP_TC_32_Register_Patient_fromCreateConsultation extends Test_Base {
	
	Register_Patient register_App_object;
	Authentication loginobj;
	   
	   @Test(priority=1)
		public void  user_login_success()
		{
	            
	    	loginobj = new Authentication (driver);
			 loginobj.login_HP("CMOOPD02", "egy123");

		}
	
/*	@DataProvider(name = "Excel Data")
	public Object[][] Register_Data() throws Throwable {
		
		

		// get data from excel register patient class
		
		Read_Excel_Register_Patient ER = new Read_Excel_Register_Patient();
		
		try {
			return ER.getExcelData();
			
		} catch (Throwable e) {	
			
			System.out.println("Error occured");
		}
		return ER.getExcelData();			
	
}
*/

@Test(priority=2  )
public void  User_Register_patient()

{
	 	
	register_App_object = new Register_Patient(driver) ; 
	 
	register_App_object.CMO_Register_FromConsultationForm("waleed", "taher", "01123456789", "11223344556677", "12345678190", "giza,cairo");
	 
}

}


//dataProvider = "Excel Data"




