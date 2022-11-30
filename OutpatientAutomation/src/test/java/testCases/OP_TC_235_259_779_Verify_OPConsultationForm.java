package testCases;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import opd_HP_Menus.NewDocument_Menu_Items;
import opd_authentication.Authentication;
import opd_new_documents_forms.OPConsultation_Form;
import opd_patient.Physician_Nurse_SearchFor_Patient;
import testBase.*;

public class OP_TC_235_259_779_Verify_OPConsultationForm extends HP_Test_Base

{

	@Test
	public void OPConsultationForm() {
		Authentication auth = new Authentication(driver);
		
		auth.login_HP("DOCUAT5", "egy123");
		try {
			
			Thread.sleep(2000);
			By select_role = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/div[2]/div/div/div/div[1]/input");
			driver.findElement(select_role).click();
			By ct = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/div[3]/button");
			driver.findElement(ct).click();
			
		}catch (InterruptedException ex) {
			Logger.getLogger(OP_TC_235_259_779_Verify_OPConsultationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		Physician_Nurse_SearchFor_Patient find_patient = new Physician_Nurse_SearchFor_Patient(driver);
		find_patient.search_by_Name("Tarek");
		

		
		NewDocument_Menu_Items select_item = new NewDocument_Menu_Items(driver);
		select_item.select_OP_Consultation_Form();

		OPConsultation_Form form = new OPConsultation_Form(driver);
		form.consultation_diagnosis();
		//form.consultation_internal_external_referral();
		form.consultaion_prescribe_medications();
		form.consultaion_place_lab_order();
		form.consultaion_place_rad_order();
		form.submit_consultation_form();
		form.verify_submitted_form();
	   
	}

}
