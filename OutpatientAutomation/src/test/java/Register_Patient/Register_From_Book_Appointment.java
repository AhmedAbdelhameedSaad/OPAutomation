package Register_Patient;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import testBase.Page_Base;

public class Register_From_Book_Appointment extends Page_Base {
	public Register_From_Book_Appointment(WebDriver driver) {
		super(driver);
	}

	public void User_Register_FromBookAppintment(String firstname, String familyname, String mobileNum, String natioID,  String Pass, String add) {

		try {
 
			Thread.sleep(3000);

			By actions_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div/div[2]");
			driver.findElement(actions_btn).click() ;
			
			Thread.sleep(2000);
			
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
	
         // search for identity patient
			
			By identity_txtbox = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div/input");
			
			driver.findElement(identity_txtbox).sendKeys("aqqq" + Keys.ENTER);
			
	//Register Patient
			
			By register_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[3]/button");
			driver.findElement(register_btn).click();
			
			By first_name = By.name("FName");
			
			driver.findElement(first_name).sendKeys(firstname);

			Thread.sleep(3000);
            
			By family_name = By.name("FAName");
					
			driver.findElement(family_name).sendKeys(familyname);

	     	//By male_gender_checkbox = By.id("SX_M");
					
	     	// driver.findElement(male_gender_checkbox).click() ;
	     	
	     	By female_gender_checkbox = By.id("SX_F");
			
	     	driver.findElement(female_gender_checkbox).click() ;
	     	
	     // date of birth drop down list
	     	
             By Birth_list = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[6]/div/vaadin-date-picker//vaadin-text-field/div[2]");
			
	     	driver.findElement( Birth_list).click() ;
	     	
	     	// By time_number = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[6]/div/vaadin-date-picker//vaadin-text-field/div[2]");
				
		     //driver.findElement(time_number).click() ;
		     	

	     	Select date_birth = new Select (driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[6]/div/vaadin-date-picker//vaadin-text-field//div/div[1]/slot[2]/input")));
	                  
	     	date_birth.selectByVisibleText("5");
	     	

			By mobile_number = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[7]/div/input");
			
			
			driver.findElement(mobile_number).sendKeys( mobileNum) ;
			
			JavascriptExecutor java1 = (JavascriptExecutor) driver;
			java1.executeScript("scroll(0,1400)");
			
			// citizen checkbox
			
            By yes_citizen_checkbox = By.id("citizenY");
			
	     	driver.findElement(yes_citizen_checkbox).click() ;
			
			
			By no_citizen_checkbox = By.id("citizenN");
			
	     	//driver.findElement(no_citizen_checkbox).click() ;
	     	
	     	By national_id = By.xpath(
					"]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[10]/div/input");
			driver.findElement(national_id).sendKeys(natioID);
			
			
						
			By passport = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[11]/div/input");
			driver.findElement(passport).sendKeys (Pass);
			  		

			By address1 = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[12]/div/input");
			driver.findElement(address1).sendKeys(add) ;
			
			JavascriptExecutor java11 = (JavascriptExecutor) driver;
			java11.executeScript("scroll(0,1200)");
					
		
         // selecting cash and credit checkboxes
			By cash = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[5]/div/div[1]/div/div[2]/div[1]/input");
			driver.findElement(cash).click();
			
			By credit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[5]/div/div[1]/div/div[2]/div[3]/input");
			driver.findElement(credit).click();
			
			// insurance
			
			By insurance = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[5]/div/div[1]/div/div[2]/div[3]/input");
			driver.findElement(insurance).click();
			
			By non_insurance_txtbox = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[5]/div/div[3]/div/div[2]/input");
			driver.findElement(non_insurance_txtbox).sendKeys("fffdd");
			
			By billing_group_txtbox = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[5]/div/div[4]/div/div[2]/div/div/div/input");
			driver.findElement(billing_group_txtbox).sendKeys("fffdd");
			

			By billing_group = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[2]/div[2]/button");
			driver.findElement(billing_group).sendKeys("fffdd");
			
			
			By close_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[1]/div/div[2]/div/img");
			driver.findElement(close_btn).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Register_From_Book_Appointment.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
}