package testCases;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import opd_HP_Menus.NewDocument_Menu_Items;
import opd_authentication.Authentication;
import opd_new_documents_forms.OPConsultation_Form;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_236_Save_OPConsultationForm extends HP_Test_Base

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
			Logger.getLogger(OP_TC_236_Save_OPConsultationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		
		SelectPatientOP find_patient = new SelectPatientOP(driver);
		find_patient.NUR_DOC_selectpatient();	
		
		NewDocument_Menu_Items select_item = new NewDocument_Menu_Items(driver);
		select_item.select_OP_Consultation_Form();

		OPConsultation_Form form = new OPConsultation_Form(driver);
		form.consultation_diagnosis();
		//form.consultation_internal_external_referral();
		//form.consultaion_prescribe_medications();
		//form.consultaion_place_lab_order();
		//form.consultaion_place_rad_order();
		form.save_draft_consultation_form();
	

	}

}
