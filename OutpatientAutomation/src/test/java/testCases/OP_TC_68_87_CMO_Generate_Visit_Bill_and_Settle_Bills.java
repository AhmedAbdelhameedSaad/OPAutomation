package testCases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.Read_Excel_Register_Patient;
import opd_Book_Appointment.Book_appointment;
import opd_Generate_Visit_Bill.Cmo_Generate_Visit_Bill;
import opd_Register_Patient.Register_Patient;
import opd_authentication.Authentication;
import testBase.HP_Test_Base;


public class OP_TC_68_87_CMO_Generate_Visit_Bill_and_Settle_Bills extends HP_Test_Base {
	
	Cmo_Generate_Visit_Bill bookAppointByNaionalID;
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
public void  UserBookAppointmentByNationalID() throws InterruptedException 

{
	 	
	bookAppointByNaionalID = new Cmo_Generate_Visit_Bill(driver) ; 
	 
	bookAppointByNaionalID.Cmo_Generate_VisitBill("A100072502" , "166.25");  
	 
} 

}


//dataProvider = "Excel Data"




