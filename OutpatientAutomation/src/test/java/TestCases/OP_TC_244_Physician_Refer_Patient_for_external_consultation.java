package TestCases;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import OPD_EMR_Reports.EMR_Reports;
import opd_HP_Menus.NewDocument_Menu_Items;
import opd_authentication.Authentication;
import opd_new_documents_forms.OPConsultation_Form;
import opd_patient.Physician_SearchFor_Patient;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_244_Physician_Refer_Patient_for_external_consultation extends HP_Test_Base

{

	@Test
	public void OPConsultationForm() throws InterruptedException {
		Authentication auth = new Authentication(driver);
		auth.login_HP("DOCUAT5", "egy123"); 
		
		try {
			
			Thread.sleep(2000);
			By select_role = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/div[2]/div/div/div/div[1]/input");
			driver.findElement(select_role).click();
			By ct = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/div[3]/button");
			driver.findElement(ct).click();
			
		}catch (InterruptedException ex) {
			Logger.getLogger(OP_TC_244_Physician_Refer_Patient_for_external_consultation.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		
		
		
		Physician_SearchFor_Patient search = new Physician_SearchFor_Patient(driver);
		
		search.physician_search_by_Name("tarek test");
		
		NewDocument_Menu_Items select_item = new NewDocument_Menu_Items(driver);
		
		select_item.select_OP_Consultation_Form();

		OPConsultation_Form form = new OPConsultation_Form(driver);
		form.consultation_diagnosis();
		
		form.consultation_internal_external_referral();
		form. referral_feedback_form();
		form.preview_form();
		form.submit_consultation_form();
		
		EMR_Reports report = new EMR_Reports(driver);
		report.display_last_report() ;
	

	}

}
