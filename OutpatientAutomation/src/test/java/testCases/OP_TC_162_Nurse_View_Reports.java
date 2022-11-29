package testCases;


import org.testng.annotations.Test;

import OPD_EMR_Reports.EMR_Reports;
import opd_authentication.Authentication;
import opd_patient.NUR_View_Patient_list;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_162_Nurse_View_Reports extends HP_Test_Base

{

	@Test
	public void view_reports() {
		Authentication auth = new Authentication(driver);
		auth.login_HP("NUROPD02", "egy123");
	
		NUR_View_Patient_list view_list = new NUR_View_Patient_list(driver);
		view_list.list();
		
		SelectPatientOP find_patient = new SelectPatientOP(driver);
		find_patient.NUR_DOC_selectpatient();
		
		EMR_Reports EMR = new EMR_Reports(driver);
		EMR.view_reports();
		
		
	}

}
