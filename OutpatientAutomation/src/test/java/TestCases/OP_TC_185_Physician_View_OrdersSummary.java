package TestCases;


import org.testng.annotations.Test;

import opd_EMR_Reports.EMR_Reports;
import opd_authentication.Authentication;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_185_Physician_View_OrdersSummary extends HP_Test_Base

{

	@Test
	public void physician_view_ordersSummary() {
		Authentication auth = new Authentication(driver);
		auth.login_HP("DOCOPD02", "egy123");
	
		
		SelectPatientOP find_patient = new SelectPatientOP(driver);
		find_patient.NUR_DOC_searchpatient("A200000403");
		find_patient.NUR_DOC_selectpatient();
		
		EMR_Reports EMR = new EMR_Reports(driver);
		EMR.recent_order();

	}

}
