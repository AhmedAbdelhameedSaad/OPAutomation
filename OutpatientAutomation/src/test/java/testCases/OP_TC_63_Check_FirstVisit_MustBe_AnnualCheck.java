package testCases;


import org.testng.annotations.Test;

import opd_appointment.Book_appointment;
import opd_authentication.Authentication;
import testBase.HP_Test_Base;


public class OP_TC_63_Check_FirstVisit_MustBe_AnnualCheck extends HP_Test_Base {
	
	Book_appointment bookAppointByNaionalID;
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
	 	
	bookAppointByNaionalID = new Book_appointment(driver) ; 
	 
	bookAppointByNaionalID.Book_Appoint_ByNationalID( "General Surgery",  "76753243200989");
	 
}

}


//dataProvider = "Excel Data"




