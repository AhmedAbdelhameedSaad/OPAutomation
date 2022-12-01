package opd_appointment;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

	public void CMO_Preview_Doctor_Appointments() { 

		try {

			Thread.sleep(2000); 
			By select_clinic = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[1]");
			driver.findElement(select_clinic).click();
			
			Thread.sleep(3000); 
			//family medicine clinic
			By search_clinic = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[1]/input");
			driver.findElement(search_clinic).sendKeys("family medicine clinic");
			
			Thread.sleep(2000);
			By select_clinic_element = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[2]/div");
			driver.findElement(select_clinic_element).click();
			
			Thread.sleep(2000);
			By select_doctor = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[12]/div[4]/input");
			driver.findElement(select_doctor).click();
			

			Thread.sleep(3000);
			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,1000)");
					

		} catch (InterruptedException ex) {
			Logger.getLogger(CMO_Preview_Reschedule_Cancel_Appointment.class.getName()).log(Level.SEVERE, null, ex);
		}
	}


public void CMO_Reschedule_Doctor_Appointments(String clinicName) {

	try {

		Thread.sleep(4000); 
		
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
		
	By doctor_zohour_checkbox = By.xpath( 
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[7]/div[4]/input");
		driver.findElement(doctor_zohour_checkbox).click();  

		
		/*			By amr_moez_checkbox = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[9]/div[4]/input");
		
		driver.findElement(amr_moez_checkbox).click() ; 
		
		
        By calender_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div/div[1]/input");
		
		driver.findElement(calender_btn).click() ;
		
		 By nineteen_date_btn = By.xpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[7]/span");
			
		driver.findElement( nineteen_date_btn).click() ;
			

		 By update_btn = By.xpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/div/button[2]/span");
				
		driver.findElement( update_btn).click() ;  */
		
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



public void CMO_Book_visit_and_Check_Out(String patient_id, String clinic_name, String doctor_name ) { 

	try {
		
	Thread.sleep(4000);   
		// ٍsearch for patient
		By search_Text = By.xpath( 
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div/input");
		driver.findElement(search_Text).sendKeys(patient_id + Keys.ENTER);

		Thread.sleep(2000); 

		// Select patient
		By Select_patient = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]");
		driver.findElement(Select_patient).click();

		Thread.sleep(2000);

		// Choose a lost
		By Choose_a_lost = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div[2]/div/div[2]/div");
		driver.findElement(Choose_a_lost).click();

		Thread.sleep(2000);

		// ٍChoose Clinic
		By search_Text_Clinic = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[2]/div/input");
		driver.findElement(search_Text_Clinic).sendKeys(clinic_name);

		// Select Clinic
		By Select_Clinic = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div/p");
		driver.findElement(Select_Clinic).click();

		Thread.sleep(2000);

		// ٍChoose practitioner
		By search_Text_practitioner = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-choose-practitioner/div/div[2]/div/input");
		driver.findElement(search_Text_practitioner).sendKeys(doctor_name);

		Thread.sleep(2000);

		// Select practitioner
		By Select_practitioner = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-choose-practitioner/div/div[3]/div/div/div/div[1]");
		driver.findElement(Select_practitioner).click();

		Thread.sleep(2000);

		// Select a slot time 8 AM 
		By Select_time = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-choose-practitioner/div[2]/app-practitioner-slot/div/div[2]/div/div/div/div[1]/div");
		driver.findElement(Select_time).click(); 
		

		Thread.sleep(2000);
		
		By newVisit_checkbox = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-schedule-appointment/div/div[2]/app-visittype/div/div/div[1]/input");
		driver.findElement(newVisit_checkbox).click();

		By click_Continue = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button");
		driver.findElement(click_Continue).click();
		
		Thread.sleep(2000);

		By click_Create_Visit = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button");
		driver.findElement(click_Create_Visit).click();
		
		Thread.sleep(2000);
		By click_Done = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button[3]");
		driver.findElement(click_Done).click();
		
		Thread.sleep(2000); 
		
		
		driver.navigate().refresh();
		
		
			Thread.sleep(3000); 
		
		By select_clinic = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[1]");
		driver.findElement(select_clinic).click();
		
		Thread.sleep(3000); 
		//family medicine clinic
		By search_clinic = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[1]/input");
		driver.findElement(search_clinic).sendKeys(clinic_name);
		
		Thread.sleep(2000);
		By select_clinic_element = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[2]/div");
		driver.findElement(select_clinic_element).click();
		
		// choose Amr Moez
		
		Thread.sleep(2000); 
		
		By select_doctor = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[9]/div[4]/input");
		driver.findElement(select_doctor).click();
		
			
		Thread.sleep(3000);
		By appoint_icon = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[2]/app-appointments-calendar-view/div/div/div/div[2]/div[1]/div[2]/div/div/div/div/span[1]");
		driver.findElement(appoint_icon).click();
		
		Thread.sleep(2000);
		By check_out = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[2]/app-appointments-calendar-view/div/div/div/div[2]/div[1]/div[2]/app-appointment-info/div/div[3]/div[1]");
		driver.findElement(check_out).click();
		
 
		

	} catch (InterruptedException ex) {
		Logger.getLogger(CMO_Preview_Reschedule_Cancel_Appointment.class.getName()).log(Level.SEVERE, null, ex);
	}
}



public void CMO_Reschedule2__Doctor_Appointments(String clinicName) {

	try {

		Thread.sleep(4000); 
		
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
	
		Thread.sleep(2000);
			By first_option = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[2]/div");
		
		driver.findElement(first_option).click();  
		
		Thread.sleep(3000);
	By doctor_zohour_checkbox = By.xpath( 
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[7]/div[4]/input");
		driver.findElement(doctor_zohour_checkbox).click();  

		
		/*			By amr_moez_checkbox = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[9]/div[4]/input");
		
		driver.findElement(amr_moez_checkbox).click() ; 
		
		
        By calender_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div/div[1]/input");
		
		driver.findElement(calender_btn).click() ;
		
		 By nineteen_date_btn = By.xpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[7]/span");
			
		driver.findElement( nineteen_date_btn).click() ;
			

		 By update_btn = By.xpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/div/button[2]/span");
				
		driver.findElement( update_btn).click() ;  */
		
		Thread.sleep(3000);
		By two_date_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[2]/app-appointments-calendar-view/div/div/div/div[2]/div[1]/div[2]/div/div/div/div/span[1]");

		driver.findElement(two_date_btn).click() ;
		
	/*	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)"); */
		
		Thread.sleep(2000);
        By reschedule_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[2]/app-appointments-calendar-view/div/div/div/div[2]/div[1]/div[2]/app-appointment-info/div/div[3]/div[3]");

		driver.findElement(reschedule_btn).click() ;
		
			
		Thread.sleep(3000);
		By onepm_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div[1]/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/app-practitioner-slot/div/div/div/div/div/div[3]/div");
		
		driver.findElement( onepm_btn).click() ;
		
		Thread.sleep(2000);
         By confirm_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[3]/div[2]/button");
		
		driver.findElement( confirm_btn).click() ;
		
		Thread.sleep(2000);
		
      By close_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div[1]/div[2]/div/div[3]/div[2]/button");
		
		driver.findElement( close_btn).click() ;
		
				

	} catch (InterruptedException ex) {
		Logger.getLogger(CMO_Preview_Reschedule_Cancel_Appointment.class.getName()).log(Level.SEVERE, null, ex);
	}
}
}



