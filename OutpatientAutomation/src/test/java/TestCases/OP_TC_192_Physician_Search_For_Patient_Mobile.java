package TestCases;


import org.testng.annotations.Test;
import opd_authentication.Authentication;
import opd_patient.Physician_SearchFor_Patient;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_192_Physician_Search_For_Patient_Mobile extends HP_Test_Base

{
	
	Physician_SearchFor_Patient search;

	@Test
	public void search_for_patient() throws InterruptedException {
		Authentication auth = new Authentication(driver);
		auth.physician_login_HP("DOCUAT5", "egy123");
	
		
		search = new Physician_SearchFor_Patient(driver);
		
		search.physician_search_by_Mobile("1223434");  

	}

}
