package testCases;


import org.testng.annotations.Test;

import opd_patient.Register_Patient;
import opd_authentication.Authentication;
import testBase.HP_Test_Base;


public class OP_TC_21_CMO_Register_patient_Arabic_Language extends HP_Test_Base {
	
	Register_Patient registerobject;
	Authentication loginobj;
	   
	   @Test(priority=1)
		public void  user_login_success()
		{
	            
	    	loginobj = new Authentication(driver);  
			 loginobj.CMO_login_HP("CMOOPD02", "egy123"); 
	   	 	
	   	  registerobject = new Register_Patient(driver) ; 
	   	 
	   	 registerobject.CMO_Register_Patient("محمد", "علي", "01155456787", "23456339874344", "Manyal,Cairo");
	   	 
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




