package PCY_Submit_Checkup;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import opd_authentication.Authentication;
import testBase.*;

public class Physician_submit_Checkups extends Page_Base {

	public Physician_submit_Checkups(WebDriver driver) {
		super(driver);
		
		 
	}
 
	public void physician_submits_student_Checkup_Form() {

		try {
			
			Thread.sleep(3000); 
			
			//fill the student check up form

			By patient_vitals_btn = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div/div/div/div/div/div[2]/app-section/div/div/app-directive-linked/div/div[1]");
			driver.findElement(patient_vitals_btn).click();
			
			By next_btn = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
			driver.findElement(next_btn).click();

			// fill Medical history Tab
			Thread.sleep(3000);
			
			
			By next1_btn = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
			driver.findElement(next1_btn).click();
			
			Thread.sleep(2000);
			By next2_btn = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
			driver.findElement(next2_btn).click();
			
			Thread.sleep(2000);
			
			By next3_btn = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
			driver.findElement(next3_btn).click();
			
			Thread.sleep(2000);
			
			
			// fill ICDC Diagnosis
			
			By search_txtbox = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div/input");
			driver.findElement(search_txtbox).sendKeys("Allergic");
			
			Thread.sleep(2000);
			
			By allergic_text = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[1]/div/div/p");
			driver.findElement(allergic_text).click();
			
			Thread.sleep(2000);
			
			By allergic_first_option = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]");
			driver.findElement(allergic_first_option).click();
			
			// Fill Allergic fields
			
			Thread.sleep(2000);
			
			By primary_radiobtn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/app-section/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(primary_radiobtn).click();
			
			By actual_radiobtn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[3]/app-section/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(actual_radiobtn).click();
			
			By certain_radiobtn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[4]/app-section/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(certain_radiobtn).click();
			
			
			By number_list = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[5]/app-section/div/div/app-timeperiod/div/input");
			driver.findElement(number_list).sendKeys("9");
			
			By diagnosis_deatils = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[6]/app-section/div/div/app-text/div/div[1]");
			driver.findElement(diagnosis_deatils).click();
			
			By dropdown_list = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[5]/app-section/div/div/app-timeperiod/div/select");
			driver.findElement(dropdown_list).click();
			
			By days_option = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[5]/app-section/div/div/app-timeperiod/div/select/option[1]");
			driver.findElement( days_option).click();
		
			
			By close_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(close_btn).click();
		
			
			By submit_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(submit_btn).click();
			
			
		} catch (InterruptedException ex) {
			Logger.getLogger(Physician_submit_Checkups.class.getName()).log(Level.SEVERE, null, ex);
		}
	}



public void physician_submits_Dental_Consultation_Form() {

	try {
		
		Thread.sleep(3000); 
		
		//fill the student check up form

		By patient_vitals_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div/div/div/div/div/div[2]/app-section/div/div/app-directive-linked/div/div[1]");
		driver.findElement(patient_vitals_btn).click();
		
		By next_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next_btn).click();

		// fill Medical history Tab
		Thread.sleep(3000);
		
		
		By next1_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next1_btn).click();
		
		Thread.sleep(2000);
		By next2_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next2_btn).click();
		
		Thread.sleep(2000);
		
		By next3_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next3_btn).click();
		
		Thread.sleep(2000);
		
		By next4_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next4_btn).click();
		
      Thread.sleep(2000);
		
		By next5_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next5_btn).click();
		
        Thread.sleep(2000);
		
		By next6_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next6_btn).click();
		
		
		// fill ICDC Diagnosis
		
		Thread.sleep(2000); 
		
		By search_txtbox = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div/input");
		driver.findElement(search_txtbox).sendKeys("rot");
		
		Thread.sleep(2000);
		By rot_text = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[1]/div/div/p");
		driver.findElement(rot_text).click();
		
		Thread.sleep(2000);
		
		By rot_first_option = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]");
		driver.findElement(rot_first_option).click();
		
		// Fill Allergic fields
		
		Thread.sleep(2000);
		
		By primary_radiobtn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/app-section/div/div/app-segment/div/div/div[2]/div[1]/div/input");
		driver.findElement(primary_radiobtn).click();
		
		By actual_radiobtn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[3]/app-section/div/div/app-segment/div/div/div[2]/div[1]/div/input");
		driver.findElement(actual_radiobtn).click();
		
		By certain_radiobtn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[4]/app-section/div/div/app-segment/div/div/div[2]/div[1]/div/input");
		driver.findElement(certain_radiobtn).click();
		
		
		By number_list = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[5]/app-section/div/div/app-timeperiod/div/input");
		driver.findElement(number_list).sendKeys("9");
		
		By diagnosis_deatils = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[6]/app-section/div/div/app-text/div/div[1]");
		driver.findElement(diagnosis_deatils).click();
		
		By dropdown_list = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[5]/app-section/div/div/app-timeperiod/div/select");
		driver.findElement(dropdown_list).click();
		
		Thread.sleep(2000);
		
		By days_option = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[5]/app-section/div/div/app-timeperiod/div/select/option[1]");
		driver.findElement( days_option).click();
	
		
		By close_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
		driver.findElement(close_btn).click();
	
		
		By submit_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
		driver.findElement(submit_btn).click();
		
	
	} catch (InterruptedException ex) {
		Logger.getLogger(Physician_submit_Checkups.class.getName()).log(Level.SEVERE, null, ex);
	}
}

}



