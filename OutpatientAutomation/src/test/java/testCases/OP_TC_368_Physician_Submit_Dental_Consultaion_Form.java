package testCases;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PCY_Submit_Checkup.Physician_submit_Checkups;
import opd_EMR_reports.EMR_Reports;
import opd_HP_Menus.Action_Menu_Items;
import opd_authentication.Authentication;
import opd_patient.Physician_SearchFor_Patient;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_368_Physician_Submit_Dental_Consultaion_Form extends HP_Test_Base

{

	@Test
	public void physician_submits_student_checkup() throws InterruptedException {
		Authentication auth = new Authentication(driver);  
		Action_Menu_Items action = new Action_Menu_Items(driver);
		Physician_SearchFor_Patient search = new Physician_SearchFor_Patient(driver);
		Physician_submit_Checkups submit = new Physician_submit_Checkups (driver);
		
       try {
    	   

    	   auth.physician_login_HP("DOCUAT5", "egy123"); 
    	   search.search_by_Name("new patient");  
    	   
    	   Thread.sleep(2000);
    	  
    	   
    	   action.dental_consultation_option();
    	   submit.physician_submits_Dental_Consultation_Form();
			
		
			
		}catch (InterruptedException ex) {
			Logger.getLogger(OP_TC_230_Submit_OPConsultationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		
	}

}
