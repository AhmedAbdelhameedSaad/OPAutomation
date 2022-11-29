package testCases;


import org.testng.annotations.Test;
import opd_authentication.Authentication;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_190_Physician_Search_For_Patient_Name extends HP_Test_Base

{

	@Test
	public void search_for_patient() {
		Authentication auth = new Authentication(driver);
		auth.login_HP("Akbar", "egy123");
	
		
		SelectPatientOP find_patient = new SelectPatientOP(driver);
		find_patient.NUR_DOC_searchpatient("patient"); 


	}

}
