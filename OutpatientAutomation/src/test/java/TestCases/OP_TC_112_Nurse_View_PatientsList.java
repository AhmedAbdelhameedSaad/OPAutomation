package TestCases;


import org.testng.annotations.Test;

import opd_authentication.Authentication;
import opd_patient.NUR_View_Patient_list;
import testBase.*;

public class OP_TC_112_Nurse_View_PatientsList extends HP_Test_Base

{

	@Test
	public void Nurse_View_PatientsList() {
		Authentication auth = new Authentication(driver);
		auth.login_HP("NUROPD01", "egy123"); 
	
		NUR_View_Patient_list view_list = new NUR_View_Patient_list(driver);
		view_list.list();

	}

}
