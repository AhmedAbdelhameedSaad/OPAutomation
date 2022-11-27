package testCases;


import static org.testng.Assert.assertEquals;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PCY_Submit_Checkup.Physician_submit_Checkups;
import opd_EMR_reports.EMR_Reports;
import opd_HP_Menus.Action_Menu_Items;
import opd_authentication.Authentication;
import opd_patient.Physician_SearchFor_Patient;
import opd_patient.SelectPatientOP;
import testBase.*;

public class OP_TC_179_Physician_Login_Empty_Username extends HP_Test_Base

{

	@Test
	public void physician_submits_student_checkup() throws InterruptedException {
		Authentication auth = new Authentication(driver);  
		
       try {
    	   
    	   auth.Physician_login_Empty_Username("", "egy123"); 
    	   
    	   Thread.sleep(3000); 
    	   
    	   By login_button = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/form/button");
    	   driver.findElement(login_button);
    	   
    	 //  Assert.assertEquals(false, auth.login_button.isEnabled());
    	   
		}catch (InterruptedException ex) {
			Logger.getLogger(OP_TC_230_Submit_OPConsultationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		
	}

}
