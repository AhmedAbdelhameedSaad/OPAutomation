package TestCases;


import org.testng.annotations.Test;

import OPD_EMR_Reports.EMR_Reports;
import opd_authentication.Authentication;
import opd_patient.NUR_View_Patient_list;
import opd_patient.Physician_SearchFor_Patient;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_256_Physician_View_Medications extends HP_Test_Base

{

	@Test
	public void view_medications() throws InterruptedException {
		Authentication auth = new Authentication(driver);
		auth.physician_login_HP("DOCUAT5", "egy123");
	
		NUR_View_Patient_list view_list = new NUR_View_Patient_list(driver);
		view_list.list();
		
		Physician_SearchFor_Patient find_patient = new Physician_SearchFor_Patient(driver);
		find_patient.physician_search_by_Name("tarek");
		
		EMR_Reports EMR = new EMR_Reports(driver);
		EMR.select_medications_report();
	
		
	}

}
