package opd_appointment;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import opd_HP_Menus.Action_Menu_Items;
import testBase.Page_Base;


public class Book_appointment extends Page_Base {
	
	Action_Menu_Items actionMenuObject;
	
	public Book_appointment(WebDriver driver) {
		super(driver);  
	} 


	public void Book_Appoint_ByInsuranceID(String department , String insuranceID) throws InterruptedException {
		
		Thread.sleep(3000);  
		
		//click on clinical diary icon
		
		By clinical_diary = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
		 
		driver.findElement(clinical_diary).click(); 
		
		
		actionMenuObject = new Action_Menu_Items(driver); 
		actionMenuObject.select_book_appointment_item();

		By search_txt = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[2]/div/input");
		driver.findElement(search_txt).sendKeys(department) ;
		//driver.findElement(search_txt).sendKeys("General Surgery" or "Family Medicine") ;
		
		
		By first_option = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div/p");
		driver.findElement(first_option).click() ;
		
	/*	By generalsurgery_text = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div[3]/p");
		driver.findElement(generalsurgery_text).click() ; */
		
		
		// choose practitioner , visit type
		
	/*	JavascriptExecutor java = (JavascriptExecutor) driver;
		java.executeScript("scroll(0,1200)");
		
         By amr_moez = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[2]/div[4]/div/div[3]/div[2]/div[3]/span");
		
		driver.findElement(amr_moez).click() ; */
		
		
         By zohour_doc = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div[1]/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[2]/div[4]/div/div[5]/div[2]/div[1]/span");
		
		driver.findElement(zohour_doc).click() ; 
		
		By new_visit_rb = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/div/app-visittype/div/div/div[4]/input");
		driver.findElement(new_visit_rb).click();
		
					
// choose visit time

		By visit_one_pm = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div[1]/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/app-practitioner-slot/div/div/div/div/div/div[2]/div");
		driver.findElement(visit_one_pm).click();

       // search for identity patient
		
		By identity_txtbox = By.xpath( 
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div/input");
		
		driver.findElement(identity_txtbox).sendKeys(insuranceID + Keys.ENTER);
		
		By patient_name = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]/p");
		driver.findElement(patient_name).click();
		
		// click anywhere and confirm appointment
		
		By confirm_headline = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-book-appoinment-patientdtls/div/div[1]");
		driver.findElement(confirm_headline).click();
		
		 // click on confirmation button then close button
         
		By confirm_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[3]/div[2]/button[1]");
		driver.findElement(confirm_btn).click();
		
		// reschedule and create visit button
		By reschedule_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[3]/div[2]/button[2]");
		driver.findElement(reschedule_btn).click();
		
		By close_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[3]/div[2]/button");
		driver.findElement(close_btn).click();
	}

	
	public void Book_Appoint_ByNationalID(String department , String nationalID) throws InterruptedException {
		

		Thread.sleep(3000);   
		
		//click on clinical diary icon
		
		By clinical_diary = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
		
		driver.findElement(clinical_diary).click();
		
		actionMenuObject = new Action_Menu_Items(driver);
		actionMenuObject.select_book_appointment_item();

		By search_txt = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[2]/div/input");
		driver.findElement(search_txt).sendKeys(department) ;
		//driver.findElement(search_txt).sendKeys("General Surgery" or "Family Medicine") ;
		
		Thread.sleep(3000);
		
		/* By familymedicine_text = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div/p");
				
		driver.findElement(familymedicine_text).click() ;  */
		
		By generalsurgery_text = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div/p");
		driver.findElement(generalsurgery_text).click() ;  
		
		 
		
		// choose practitioner , visit type 
		Thread.sleep(5000); 
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]")), 900);
	                                                                                            			
		By amr_moez = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[2]/div[4]/div/div[3]/div[2]/div[3]/span");
		
		driver.findElement(amr_moez).click() ;
		
		Thread.sleep(3000); 
		
		By new_visit_rb = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/div/app-visittype/div/div/div[4]/input");
		driver.findElement(new_visit_rb).click();
		 
		
		By new_rad = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/div/app-visittype/div/div/div[2]/label");
		driver.findElement(new_rad).click();
		  		
		
		By student_visit = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/div/app-visittype/div/div/div[4]/label");
		driver.findElement(student_visit).click();
		
		By student_follow = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/div/app-visittype/div/div/div[5]/label");
		driver.findElement(student_follow).click();
		
					
// choose visit time

		By visit_three_pm = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/app-practitioner-slot/div/div/div/div/div/div[4]/div");
		driver.findElement(visit_three_pm).click();

       // search for identity patient
		
		By identity_txtbox = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div/input");
		
		driver.findElement(identity_txtbox).sendKeys(nationalID + Keys.ENTER);
		
		Thread.sleep(3000);
		
		By patient_name = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]/p");
		driver.findElement(patient_name).click(); 
		
		Thread.sleep(3000);
		
		// click anywhere and confirm appointment
		
		By confirm_headline = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-book-appoinment-patientdtls/div/div[1]");
		driver.findElement(confirm_headline).click();
		
		
		 // click on confirmation button then close button
         
		By confirm_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[3]/div[2]/button");
		driver.findElement(confirm_btn).click();
		
		Thread.sleep(3000);
		
				
		By close_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[3]/div[2]/button");
		driver.findElement(close_btn).click(); 
	}
	
}

