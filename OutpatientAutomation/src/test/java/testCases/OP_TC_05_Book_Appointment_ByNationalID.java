package testCases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Register_Patient.Book_appointment_ByNationalID;
import Register_Patient.Register_From_Book_Appointment;
import Register_Patient.Register_Patient;
import Utilities.Read_Excel_Register_Patient;
import opd_authentication.Authentication;


public class OP_TC_05_Book_Appointment_ByNationalID extends Test_Base {
	
	Book_appointment_ByNationalID bookAppointByNaionalID;
	Authentication loginobject2;
	   
	   @Test(priority=1)
		public void  user_login_()
		{
	            
	    	loginobject2 = new Authentication (driver);
			 loginobject2.login_HP("CMOOPD02", "egy123");

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

@Test(priority=2 )
public void  UserBookAppointmentByNationalID()

{
	 	
	bookAppointByNaionalID = new Book_appointment_ByNationalID(driver) ; 
	 
	bookAppointByNaionalID.UserBookAppintmentByNationalID( "Family Medicine",  "76753243200989");
	 
}

}


//dataProvider = "Excel Data"




