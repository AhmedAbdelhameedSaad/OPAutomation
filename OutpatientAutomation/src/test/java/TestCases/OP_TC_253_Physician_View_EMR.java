package testCases;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import opd_EMR_reports.EMR_Reports;
import opd_authentication.Authentication;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_253_Physician_View_EMR extends HP_Test_Base

{

	@Test
	public void view_emr() {
		Authentication auth = new Authentication(driver);
		auth.login_HP("DOCUAT5", "egy123"); 
		
       try {
			
			Thread.sleep(2000);
			By select_role = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/div[2]/div/div/div/div[1]/input");
			driver.findElement(select_role).click();
			By ct = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/div[3]/button");
			driver.findElement(ct).click();
			
		}catch (InterruptedException ex) {
			Logger.getLogger(OP_TC_230_Submit_OPConsultationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		SelectPatientOP find_patient = new SelectPatientOP(driver);
		find_patient.NUR_DOC_selectpatient();
		
		EMR_Reports EMR = new EMR_Reports(driver);
		EMR.view_reports();
		EMR.recent_order();
		EMR.select_clicnical_profile();
		EMR.select_medications_report();
		EMR.uploaded_documents();
		EMR.select_growth_chart();
		EMR.select_observations_report();
		
		
	}

}
