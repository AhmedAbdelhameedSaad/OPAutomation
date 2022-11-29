package testCases;


import org.testng.annotations.Test;

import opd_patient.Register_Patient;
import opd_authentication.Authentication;
import testBase.HP_Test_Base;


public class OP_TC_29_CMO_Register_patient extends HP_Test_Base {
	
	Register_Patient registerobject;
	Authentication loginobj;
	   
	   @Test(priority=1)
		public void  user_login_success()
		{
	            
	    	loginobj = new Authentication(driver);  
			 loginobj.login_HP("CMOOPD02", "egy123"); 
	   	 	
	   	  registerobject = new Register_Patient(driver) ; 
	   	 
	   	 registerobject.CMO_Register_Patient("waleed", "tarek2", "01155456789", "23456339871234", "Giza,Cairo");
	   	 
	   }

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



//dataProvider = "Excel Data"




