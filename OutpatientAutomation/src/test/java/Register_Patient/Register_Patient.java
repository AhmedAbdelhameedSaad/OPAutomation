package Register_Patient;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import testBase.Page_Base;

public class Register_Patient extends Page_Base  {
	

	public Register_Patient(WebDriver driver) { 
		super(driver);
	}

	public void Register_Form(String firstname, String familyname, String mobileNum, String natioID,  String address ) { 

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

	     	//By male_gender_checkbox = By.id("SX_M");
					
	     	// driver.findElement(male_gender_checkbox).click() ;
	     	
	     	By female_gender_checkbox = By.id("SX_F");
			
	     	driver.findElement(female_gender_checkbox).click() ;
	     	
	     // date of birth drop down list
	     	
	     	By dob_txtbox = By.id("vaadin-dp");      
	     	
	     	driver.findElement (dob_txtbox).sendKeys("6-11-2022");
	     	

             By time_day_text = By.xpath("/html/body/vaadin-date-picker-overlay//div[2]/div//vaadin-date-picker-overlay-content//div[3]/vaadin-infinite-scroller[1]/div[4]/vaadin-month-calendar//div[2]/div[2]/div[2]/div[8]");
			
	     	driver.findElement(time_day_text).click() ;     
	     	
	     	
	     	JavascriptExecutor java = (JavascriptExecutor) driver;
	     	
			java.executeScript("scroll(0,5000)");
			
	     	
             //By Birth_list = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[6]/div/vaadin-date-picker//vaadin-text-field/div[2]");
			
	     	//driver.findElement( Birth_list).click();
	     	
	     	// By time_number = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[6]/div/vaadin-date-picker//vaadin-text-field/div[2]");
				
		     //driver.findElement(time_number).click() ;
		     	

	     	//Select date_birth = new Select (driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[6]/div/vaadin-date-picker//vaadin-text-field//div/div[1]/slot[2]/input")));
	                  
	     	//date_birth.selectByVisibleText("5");
	     	

			By mobile_number = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[7]/div/input");
			driver.findElement(mobile_number).sendKeys( mobileNum) ;
			

	     	JavascriptExecutor java1 = (JavascriptExecutor) driver;
			java1.executeScript("scroll(0,10000)");
			
			
			// citizen checkbox
			
          /* By no_citizen_checkbox = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[9]/div/div[2]/div[2]/input");
           
           Thread.sleep(2000);
			
	     	driver.findElement(no_citizen_checkbox).click();
	     	
			
            By yes_citizen_checkbox = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[9]/div/div[2]/div[1]/input");
			
	     	driver.findElement(yes_citizen_checkbox).click() ;  */
			
			
	     	By national_id = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[10]/div/input");
			driver.findElement(national_id).sendKeys(natioID);
			
		//Disable passport
			//By passport = By.xpath(
			//		"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[11]/div/input");
			//driver.findElement(passport).sendKeys (pass);
			  		

			By address1 = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[12]/div/input");
			driver.findElement(address1).sendKeys(address) ;
			
			JavascriptExecutor java2 = (JavascriptExecutor) driver;
			java2.executeScript("scroll(0,80000)");
			
					
		
      /*   // selecting cash and credit checkboxes
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
			driver.findElement(non_insurance_txtbox).sendKeys("fffdd"); */
			
			By billing_group_txtbox = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[5]/div/div[4]/div/div[2]/div/div/div/input");
			driver.findElement(billing_group_txtbox).sendKeys("fffdd");
			

			By billing_group = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[2]/div[2]/button");
			driver.findElement(billing_group).sendKeys("Cash Patient");
			
			By cash_text = By.xpath(
					"/div");
			driver.findElement(cash_text).click();
			
			
			
			/*By close_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[1]/img");
			driver.findElement(close_btn).click();*/

		} catch (InterruptedException ex) {
			Logger.getLogger(Register_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
			
		}
	}

	 }
