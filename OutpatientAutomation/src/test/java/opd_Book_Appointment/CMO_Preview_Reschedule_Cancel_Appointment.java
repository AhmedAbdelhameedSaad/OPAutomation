package opd_Book_Appointment;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import testBase.Page_Base;

public class CMO_Preview_Reschedule_Cancel_Appointment extends Page_Base {
	
	public WebElement appoint_button ;
	
	public WebElement orderForApproval_txt ;
	
	public CMO_Preview_Reschedule_Cancel_Appointment(WebDriver driver) {
		super(driver);
	}

	public void CMO_Preview_Doctor_Appointments(String clinicName) { 

		try {

			Thread.sleep(3000); 
			 
             //click on clinical diary icon
			
			By clinical_diary = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
			 
			driver.findElement(clinical_diary).click(); 
			
			// search clinic

			By search_button = By.id("clinic-btn");
			
			driver.findElement(search_button).click();

			Thread.sleep(2000);
            
			By search_textbox = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[1]/input");
			driver.findElement(search_textbox).sendKeys(clinicName);
		

				By familymedicine_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[2]/div");
			
			driver.findElement(familymedicine_btn).click();  
			
	/*		By generalSurgery_btn = By.xpath( 
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[2]/div[1]/div[2]");
			driver.findElement(generalSurgery_btn).click();  */

			Thread.sleep(3000);
			
			
			By amr_moez_checkbox = By.xpath( 
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[9]/div[4]/input");
			driver.findElement(amr_moez_checkbox).click() ;
	

	      By amr_text_middleOfthePage = By.xpath(
	    			"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[2]/app-appointments-calendar-view/div/div/div/div[1]/div[2]/div/span");

	      	driver.findElement(amr_text_middleOfthePage);
					

		} catch (InterruptedException ex) {
			Logger.getLogger(CMO_Preview_Reschedule_Cancel_Appointment.class.getName()).log(Level.SEVERE, null, ex);
		}
	}


public void CMO_Reschedule_Doctor_Appointments(String clinicName) {

	try {

		Thread.sleep(3000); 
		
         //click on clinical diary icon
		
		By clinical_diary = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
		 
		driver.findElement(clinical_diary).click(); 
		
		// search clinic

		By search_button = By.id("clinic-btn");
		
		driver.findElement(search_button).click();

		Thread.sleep(2000);
        
		By search_textbox = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[1]/input");
		driver.findElement(search_textbox).sendKeys(clinicName);
	

			By familymedicine_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[2]/div");
		
		driver.findElement(familymedicine_btn).click();  
		
/*		By generalSurgery_btn = By.xpath( 
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[2]/div[1]/div[2]");
		driver.findElement(generalSurgery_btn).click();  */

		
		By amr_moez_checkbox = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[9]/div[4]/input");
		
		driver.findElement(amr_moez_checkbox).click() ;
		
		
        By calender_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div/div[1]/input");
		
		driver.findElement(calender_btn).click() ;
		
		 By nineteen_date_btn = By.xpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[7]/span");
			
		driver.findElement( nineteen_date_btn).click() ;
			

		 By update_btn = By.xpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/div/button[2]/span");
				
		driver.findElement( update_btn).click() ;
		
		By eightAM_date_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[2]/app-appointments-calendar-view/div/div/div/div[2]/div[1]/div[2]/div/div/div/div/span[1]");

		
		driver.findElement(eightAM_date_btn).click() ;
		
        By reschedule_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[2]/app-appointments-calendar-view/div/div/div/div[2]/div[1]/div[2]/app-appointment-info/div/div[3]/div[2]");

		driver.findElement(reschedule_btn).click() ;
			
			
		By nineAM_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/app-practitioner-slot/div/div/div/div/div/div[4]/div");
		
		driver.findElement( nineAM_btn).click() ;
		
         By confirm_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[3]/div[2]/button");
		
		driver.findElement( confirm_btn).click() ;
		
      By close_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[3]/div[2]/button");
		
		driver.findElement( close_btn).click() ;
		
				

	} catch (InterruptedException ex) {
		Logger.getLogger(CMO_Preview_Reschedule_Cancel_Appointment.class.getName()).log(Level.SEVERE, null, ex);
	}
}


public void CMO_Cancel_Doctor_Appointments(String clinicName) {

	try {

		Thread.sleep(3000);  
		
         //click on clinical diary icon
		
		By clinical_diary = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
		 
		driver.findElement(clinical_diary).click(); 
		
		// search clinic

		By search_button = By.id("clinic-btn");
		
		driver.findElement(search_button).click();

		Thread.sleep(2000);
        
		By search_textbox = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[1]/input");
		driver.findElement(search_textbox).sendKeys(clinicName);
	

			By familymedicine_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[2]/div");
		
		driver.findElement(familymedicine_btn).click();  
		
/*		By generalSurgery_btn = By.xpath( 
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[2]/div[1]/div[2]");
		driver.findElement(generalSurgery_btn).click();  */

		Thread.sleep(2000);
		
		By amr_moez_checkbox = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[11]/div[4]/input");
		
		driver.findElement(amr_moez_checkbox).click() ;
		
		Thread.sleep(3000);
		
        By calender_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div/div[1]/input");
		
		driver.findElement(calender_btn).click() ;
		
		Thread.sleep(2000);
		
		 By nineteen_date_btn = By.xpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[7]/span");
			
		driver.findElement( nineteen_date_btn).click() ;
		
		Thread.sleep(2000);

		 By update_btn = By.xpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/div/button[2]/span");
				
		driver.findElement( update_btn).click() ;
		
		Thread.sleep(3000);
		By eightnAM_appoint_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[2]/app-appointments-calendar-view/div/div/div/div[2]/div[1]/div[2]/div/div/div/div/span[1]");

		driver.findElement(eightnAM_appoint_btn).click() ;
		
		Thread.sleep(3000);
        By cancel_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[2]/app-appointments-calendar-view/div/div/div/div[2]/div[1]/div[2]/app-appointment-info/div/div[3]/div[1]");

		driver.findElement(cancel_btn).click() ;
			
		Thread.sleep(3000);
		
		By reason_patientRequest_checkbox = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-cancel-appointment/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/input");
		
		driver.findElement(reason_patientRequest_checkbox).click() ;
		
		Thread.sleep(3000);
         By continue_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-cancel-appointment/div/div[2]/div/div[3]/button");
		
		driver.findElement( continue_btn).click() ;
		
 

	} catch (InterruptedException ex) {
		Logger.getLogger(CMO_Preview_Reschedule_Cancel_Appointment.class.getName()).log(Level.SEVERE, null, ex);
	}
}


public void Physician_Preview_Doctor_Appointments(String clinicName) {

	try {
		

		Thread.sleep(3000);  
		
		By clinician_checkbx = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/div[2]/div/div/div/div[1]/input");
		 
		driver.findElement(clinician_checkbx).click(); 
		
		By continue_btn = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/div[3]/button");
		 
		driver.findElement(continue_btn).click(); 
		
		Thread.sleep(3000);
		
		By tasks_icon = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[1]/div/img");
		 
		driver.findElement(tasks_icon).click();
	
	
		Thread.sleep(3000);
		
		By orderForApproval_txt = By.xpath("/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/app-task-detail-grid/div/div[2]/div[2]/div/div[1]/span");
		
		
		Thread.sleep(2000);
       		

	} catch (InterruptedException ex) {
		Logger.getLogger(CMO_Preview_Reschedule_Cancel_Appointment.class.getName()).log(Level.SEVERE, null, ex);
	}
}
}
