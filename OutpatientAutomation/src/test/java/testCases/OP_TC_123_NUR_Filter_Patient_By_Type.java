package testCases;


import org.testng.annotations.Test;
import opd_authentication.Authentication;
import opd_patient.NUR_Filter_Patient_list;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_123_NUR_Filter_Patient_By_Type extends HP_Test_Base

{
	
	Authentication auth;
	NUR_Filter_Patient_list type ;

	@Test
	public void search_for_patient() throws InterruptedException {
		
		auth = new Authentication(driver);
		auth.CMO_login_HP("NUROPD02", "egy123");
		
		type = new NUR_Filter_Patient_list (driver);
	
		 type.Nurse_filter_patientlist_ByType();
		

	}

}
