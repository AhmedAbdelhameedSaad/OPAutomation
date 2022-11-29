package TestCases;


import org.testng.annotations.Test;

import opd_EMR_Reports.EMR_Reports;
import opd_authentication.Authentication;
import opd_patient.Physician_SearchFor_Patient;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_260_Physician_View_EMR extends HP_Test_Base

{

	@Test
	public void view_emr() throws InterruptedException {
		Authentication auth = new Authentication(driver);
		auth.physician_login_HP("DOCUAT5", "egy123");
	
		
		//SelectPatientOP find_patient = new SelectPatientOP(driver);
		//find_patient.NUR_DOC_selectpatient();
		Physician_SearchFor_Patient patient = new Physician_SearchFor_Patient(driver);
		patient.physician_search_by_Name("tarek");
		
		EMR_Reports EMR = new EMR_Reports(driver);
		EMR.view_reports();
		EMR.recent_order();
		EMR.select_clicnical_profile();
		EMR.select_medications_report();
		//EMR.uploaded_documents();
		EMR.select_observations_report();
		
	}

}
