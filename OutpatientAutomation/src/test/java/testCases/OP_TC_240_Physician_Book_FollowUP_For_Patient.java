package testCases;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import opd_EMR_reports.EMR_Reports;
import opd_HP_Menus.Action_Menu_Items;
import opd_HP_Menus.Left_Menu_Items;
import opd_HP_Menus.NewDocument_Menu_Items;
import opd_authentication.Authentication;
import opd_new_documents_forms.OPConsultation_Form;
import opd_patient.Physician_SearchFor_Patient;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_240_Physician_Book_FollowUP_For_Patient extends HP_Test_Base 

{

	@Test
	public void physician_submits_student_checkup() throws InterruptedException {
		Authentication auth = new Authentication(driver);  
		Action_Menu_Items action = new Action_Menu_Items(driver);
		Physician_SearchFor_Patient search = new Physician_SearchFor_Patient(driver);
		opd_new_documents_forms.Physician_submit_Checkups submit = new opd_new_documents_forms.Physician_submit_Checkups (driver);
		OPConsultation_Form consult = new OPConsultation_Form (driver);
		
       try {
    	   
    	   auth.physician_login_HP("DOCUAT5", "egy123"); 
    	   Thread.sleep(2000); 
    	  
    	   search.physician_search_by_Name("new patient");  
    	 
    	   Thread.sleep(2000); 
    	 
   		
   		action.op_consultation_form();
   
   		consult.Follow_Up_After_Filling_Diagnosis();
   		
   		consult.preview_form();
			
		}catch (InterruptedException ex) {
			Logger.getLogger(OP_TC_230_Submit_OPConsultationForm.class.getName()).log(Level.SEVERE, null, ex); 
        }
		
		
	}

}
