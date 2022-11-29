package testCases;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.annotations.Test;

import OPD_EMR_Reports.EMR_Reports;
import opd_new_documents_forms.Physician_submit_Checkups;
import opd_HP_Menus.Action_Menu_Items;
import opd_authentication.Authentication;
import opd_patient.Physician_SearchFor_Patient;
import testBase.*;

public class OP_TC_363_Physician_Submit_Student_CheckUp_Form extends HP_Test_Base 

{

	@Test
	public void physician_submits_student_checkup() throws InterruptedException {
		Authentication auth = new Authentication(driver);   
		Action_Menu_Items action = new Action_Menu_Items(driver);
		Physician_SearchFor_Patient search = new Physician_SearchFor_Patient(driver);
		Physician_submit_Checkups submit = new Physician_submit_Checkups (driver);
		
		
       try {
    	   
    	   auth.physician_login_HP("DOCUAT5", "egy123"); 
    	   search.physician_search_by_Name("new patient");  
    	   
    	   Thread.sleep(2000); 
    	   
    	   action.student_checkup_option();
    	   submit.physician_submits_student_Checkup_Form();
    	    submit.click_on_Submit_button();
    	   
    	   EMR_Reports report = new EMR_Reports(driver);
   		report.display_last_report() ; 
   	
    	   
			
		}catch (InterruptedException ex) {
			Logger.getLogger(OP_TC_230_Submit_OPConsultationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		
	}

}
