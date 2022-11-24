package opd_patient;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testBase.Page_Base;

public class Register_Patient extends Page_Base  {
	

	public Register_Patient(WebDriver driver) { 
		
		super(driver);   
	}

	
	public void CMO_Register_Patient(String firstname, String familyname, String mobileNum, String natioID,  String address ) { 

		try {  

			Thread.sleep(3000);    
			
			//click on clinical diary icon
			
			By clinical_diary = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
			 
			driver.findElement(clinical_diary).click();  
			
			// click on search icon to open register pop up
			
			 By search_icon = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-header/div/div/div[1]/img");
			
			driver.findElement(search_icon).click();
			
			Thread.sleep(2000);
			
			 By register_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[3]/button");
				
				driver.findElement(register_btn).click(); 
			
			
			By first_name = By.name("FName");		
			driver.findElement(first_name).sendKeys(firstname);

			Thread.sleep(3000);
            
			By family_name = By.name("FAName");
			driver.findElement(family_name).sendKeys(familyname); 
	     	
	     // date of birth drop down list
	     	
	     	By dob_txtbox = By.id("vaadin-dp");      	     	 
	     	driver.findElement (dob_txtbox).sendKeys("13-11-2022"+ Keys.ENTER);
	     	
		
			By mobile_number = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[7]/div/input");
			driver.findElement(mobile_number).sendKeys( mobileNum) ;
			
			
	     	By national_id = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[10]/div/input");
			driver.findElement(national_id).sendKeys(natioID);
			
			Thread.sleep(3000); 
				By address1 = By.xpath(
						"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[12]/div/input");
				driver.findElement(address1).sendKeys(address) ;
				
				Thread.sleep(3000);			

			By billing_group = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[5]/div/div[2]/div/div[2]/input"
					);
			driver.findElement(billing_group).sendKeys("Cash Patient");
			
			By cash_text = By.xpath(
	"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[5]/div/div[2]/div/div[3]/div/a");						
			driver.findElement(cash_text).click();
			
			Thread.sleep(2000);
				By reg_btn = By.xpath(
						"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[2]/div[2]/button\r\n");
				driver.findElement(reg_btn).click();
				
			Thread.sleep(3000);
			

		
			By reg_btn2 = By.xpath( 
					"html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[2]/div[2]/div/button[2]");
			driver.findElement(reg_btn2).click();
			
	 	Thread.sleep(3000);
		
		By close = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[2]/div/div[1]/div[1]/img");
		driver.findElement(close).click();
		
		Thread.sleep(3000);
			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,1000)");
			
		} catch (InterruptedException ex) {
			Logger.getLogger(Register_Patient.class.getName()).log(Level.SEVERE, null, ex);			
			
		}
	}

	 
	public void CMO_Register_FromConsultationForm(String firstname, String familyname, String mobileNum, String natioID,  String Pass, String address) {

		try {
			
			Thread.sleep(3000);
			//click on clinical diary icon
			
			By clinical_diary = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
			 
			driver.findElement(clinical_diary).click(); 

			Thread.sleep(3000);

			By actions_btn = By.xpath( 
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div/div[2]");
			driver.findElement(actions_btn).click() ;
			
			Thread.sleep(2000);
			
             By create_consult_btn = By.xpath(
 					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-forms-list/div/div[2]/div[2]/div[2]/div[3]");
             
	     	driver.findElement(create_consult_btn).click() ;
	     	
	    	
						
         // search for identity patient
	     	
	     	Thread.sleep(2000);
			
			By identity_txtbox = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div/input");
			
			driver.findElement(identity_txtbox).sendKeys("ooomb" + Keys.ENTER);
			
	//Register Patient
			
			Thread.sleep(3000);

			By register_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[3]/button");
					
			Thread.sleep(2000);
			driver.findElement(register_btn).click();
			
			Thread.sleep(3000);
	
			By first_name = By.name("FName");
			
			driver.findElement(first_name).clear();
			
			driver.findElement(first_name).sendKeys(firstname);

			
			By family_name = By.name("FAName");
					
			driver.findElement(family_name).sendKeys(familyname);

	    /* 	 By male_gender_checkbox = By.id("SX_M");
					
	     	// driver.findElement(male_gender_checkbox).click() ;
	     	
	     	By female_gender_checkbox = By.id("SX_F");
			
	     	driver.findElement(female_gender_checkbox).click() ; */
	     	
		 	
		     // date of birth drop down list
			Thread.sleep(2000);
		     	By dob_txtbox = By.id("vaadin-dp");      	     	 
		     	driver.findElement (dob_txtbox).sendKeys("13-11-2022"+ Keys.ENTER);
		     	
		     	Thread.sleep(2000);
				By mobile_number = By.xpath(
						"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[7]/div/input");
				driver.findElement(mobile_number).sendKeys( mobileNum) ;
				
				Thread.sleep(2000);
		     	By national_id = By.xpath(
						"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[10]/div/input");
				driver.findElement(national_id).sendKeys(natioID);
				
				Thread.sleep(3000); 
					By address1 = By.xpath(
							"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[12]/div/input");
					driver.findElement(address1).sendKeys(address) ;
					
					Thread.sleep(3000);			

				By billing_group = By.xpath(
						"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[5]/div/div[2]/div/div[2]/input"
						);
				driver.findElement(billing_group).sendKeys("Cash Patient");
				
				By cash_text = By.xpath(
		"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[5]/div/div[2]/div/div[3]/div/a");						
				driver.findElement(cash_text).click();
				
				Thread.sleep(2000);
					By reg_btn = By.xpath(
							"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[2]/div[2]/button\r\n");
					driver.findElement(reg_btn).click();
					
				Thread.sleep(3000);
				

				Thread.sleep(2000); 
				By reg_btn2 = By.xpath(
						"html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[2]/div[2]/div/button[2]");
				driver.findElement(reg_btn2).click();
				
			Thread.sleep(3000);
			
			
			By close = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[1]/div/img");
			Thread.sleep(2000);
			driver.findElement(close).click();
			
			Thread.sleep(3000);
				JavascriptExecutor java = (JavascriptExecutor) driver;
				java.executeScript("scroll(0,1000)");

		} catch (InterruptedException ex) {
			Logger.getLogger(Register_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
	
	
	public void CMO_Register_FromBookAppintment(String clinicName ,String firstname, String familyname, String mobileNum, String natioID,  String Pass, String add) {

		try {
			
			Thread.sleep(3000);

			//click on clinical diary icon
			
			By clinical_diary = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
			 
			driver.findElement(clinical_diary).click(); 
 
			Thread.sleep(3000);

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
			driver.findElement(search_txt).sendKeys(clinicName) ;
			
			Thread.sleep(2000);
			
			
			By familymedicine_text = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div/p");
			driver.findElement(familymedicine_text).click() ;
			
	/*		By generalsurgery_text = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div[3]/p");
			driver.findElement(generalsurgery_text).click() ;  */
			
			
			// choose practitioner , visit type
			
			Thread.sleep(2000);
	     	
			By Amr_Moez = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[2]/div[4]/div/div[3]/div[2]/div[1]/span");
			                      
	     	driver.findElement(Amr_Moez).click() ;
	     	
	     	Thread.sleep(2000);
	     	// In case of new patient 
	     	By new_visit_rb = By.xpath(																																																									
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/div/app-visittype/div/div/div[4]/input");
			driver.findElement(new_visit_rb).click();
			
			
		/*	By new_rad = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/div/app-visittype/div/div/div[2]/label");
			driver.findElement(new_rad).click();
			  		
			
			By student_visit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/div/app-visittype/div/div/div[4]/label");
			driver.findElement(student_visit).click();
			
			By student_follow = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/div/app-visittype/div/div/div[5]/label");
			driver.findElement(student_follow).click(); */
			
						
		// choose visit time 
			
			Thread.sleep(2000);

			By visit_threeandhalf_pm = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-practitioner/div[3]/app-ex-schedule-appointment/div/div[2]/app-practitioner-slot/div/div/div/div/div/div[12]/div");
			driver.findElement(visit_threeandhalf_pm).click();
	
         // search for identity patient
			
			By identity_txtbox = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div/input");
			
			driver.findElement(identity_txtbox).sendKeys("ppcc" + Keys.ENTER);
			
			Thread.sleep(2000);
			
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
	     	
             By Birth_list = By.id("vaadin-dp");			
	     	driver.findElement( Birth_list).sendKeys("13-11-2022" + Keys.ENTER) ;
	     	
	     	// By time_number = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[6]/div/vaadin-date-picker//vaadin-text-field/div[2]");
				
			By mobile_number = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[7]/div/input");
			
			driver.findElement(mobile_number).sendKeys(mobileNum) ;
			
	/*		// citizen checkbox
            By yes_citizen_checkbox = By.id("citizenY");
	     	driver.findElement(yes_citizen_checkbox).click() ;
			By no_citizen_checkbox = By.id("citizenN");
	     	//driver.findElement(no_citizen_checkbox).click() ; */
			
			Thread.sleep(2000);
	     	
	     	By national_id = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[10]/div/input");
			driver.findElement(national_id).sendKeys(natioID);
		
			  		
			Thread.sleep(2000);
			By address1 = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[12]/div/input");
			driver.findElement(address1).sendKeys(add) ;
					
		
         // selecting cash and credit checkboxes
	/*		By cash = By.xpath(
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
			driver.findElement(non_insurance_txtbox).sendKeys("fffdd"); */
			

			Thread.sleep(3000);			

		By billing_group = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[5]/div/div[2]/div/div[2]/input\r\n"
				+ "");
		driver.findElement(billing_group).sendKeys("Cash Patient");
		
		By cash_text = By.xpath(
                "/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[5]/div/div[2]/div/div[3]/div/a");						
		driver.findElement(cash_text).click();
		
		Thread.sleep(2000);
			By reg_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[2]/div[2]/button\r\n");
			driver.findElement(reg_btn).click();
		
			Thread.sleep(2000); 
			By reg_btn2 = By.xpath(
					"html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[2]/div[2]/div/button[2]");
			driver.findElement(reg_btn2).click();
			
		Thread.sleep(3000);
		By confirm_apoointment = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[3]/div[2]/button[1]");
		driver.findElement(confirm_apoointment).click();
		
/*	Thread.sleep(3000);
	By close = By.xpath("");
	driver.findElement(close).click();  */
	
	Thread.sleep(3000);
		JavascriptExecutor java2 = (JavascriptExecutor) driver;
		java2.executeScript("scroll(0,1000)");

		

		} catch (InterruptedException ex) {
			Logger.getLogger(Register_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}


	
	
	
	
	
	
}
