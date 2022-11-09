package opd_Book_Appointment;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Book_appointment_ByInsuranceID {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(5000);

			By actions_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div/div[2]");
			driver.findElement(actions_btn).click() ;
			
			Thread.sleep(3000);
			
             By book_appointment = By.xpath(
 					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-forms-list/div/div[2]/div[2]/div[2]/div[2]");
             
	     	driver.findElement(book_appointment).click() ;
	     	
	     	
	     // ٍsearch for department
	     			
	     	By search_txt = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[2]/div/input");
			driver.findElement(search_txt).sendKeys("Family Medicine") ;
			driver.findElement(search_txt).sendKeys("General Surgery") ;
			
			By familymedicine_text = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div/p");
			driver.findElement(familymedicine_text).click() ;
			
			By generalsurgery_text = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div[3]/p");
			driver.findElement(generalsurgery_text).click() ;
			
			
			// choose practitioner , visit type
			
			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,1200)");
	     	
			By khaled_zend = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[2]/div[4]/div/div[11]/div[2]/div[1]/span");
			
	     	driver.findElement(khaled_zend).click() ;
	     	
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
	
         // search for identity patient by Insurance ID
			
			By identity_txtbox = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div/input");
			
			driver.findElement(identity_txtbox).sendKeys("a200000406" + Keys.ENTER);
			
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

		} catch (InterruptedException ex) {
			Logger.getLogger(Book_appointment_ByInsuranceID.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
}