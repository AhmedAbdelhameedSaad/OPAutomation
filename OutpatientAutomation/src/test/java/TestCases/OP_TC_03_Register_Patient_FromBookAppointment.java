package TestCases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Login.Login_HP;
import OPD_OPConsultation.DOC_SelectPatientOP;
import OPD_OPConsultation.SelectForm_OP_Consultation;
import Register_Patient.Register_From_Book_Appointment;
import Register_Patient.Register_Patient;
import Utilities.Read_Excel_Register_Patient;


public class OP_TC_03_Register_Patient_FromBookAppointment extends Test_Base {
	
	Register_From_Book_Appointment register_App_object;
	Login_HP loginobj;
	   
	   @Test(priority=1)
		public void  user_login_success()
		{
	            
	    	loginobj = new Login_HP(driver);
			 loginobj.login_Edge("CMOOPD02", "egy123");

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
	 	
	register_App_object = new Register_From_Book_Appointment(driver) ; 
	 
	register_App_object.UserRegisterFromBookAppintment("waleed", "taher", "01123456789", "11223344556677", "12345678190", "giza,cairo");
	 
}

}


//dataProvider = "Excel Data"




