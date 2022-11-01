package Register_Patient;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Register_Patient {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(5000);
			
			//click on clinical diary icon
			
			By clinical_diary = By.name("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
			
			driver.findElement(clinical_diary).click();
			
			// click on search icon to open register pop up
			
			By search_icon = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-header/div/div/div[1]/img");
			
			driver.findElement(search_icon).click();
			
			Thread.sleep(5000);

			By first_name = By.name("FName");
				
			driver.findElement(first_name).sendKeys("waleed");

			Thread.sleep(3000);
            
			By family_name = By.name("FAName");
					
			driver.findElement(family_name).sendKeys("youssef");

	     	By male_gender_checkbox = By.id("SX_M");
					
	     	// driver.findElement(male_gender_checkbox).click() ;
	     	
	     	By female_gender_checkbox = By.id("SX_F");
			
	     	driver.findElement(female_gender_checkbox).click() ;
	     	

			By mobile_number = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[7]/div/input");
			driver.findElement(mobile_number).sendKeys("123456789") ;
			
			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,1200)");
			
			// citizen checkbox
			
             By yes_citizen_checkbox = By.id("citizenY");
			
	     	driver.findElement(yes_citizen_checkbox).click() ;
			
			
			By no_citizen_checkbox = By.id("citizenN");
			
	     	//driver.findElement(no_citizen_checkbox).click() ;
	     	
	     	By national_id = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[10]/div/input");
			driver.findElement(national_id).sendKeys("123456789");
			
			
			By passport = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[11]/div/input");
			driver.findElement(passport).sendKeys("123456789");
			  		

			By address = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[12]/div/input");
			driver.findElement(address).sendKeys("123456789") ;
			
			JavascriptExecutor java1 = (JavascriptExecutor) driver;
			java1.executeScript("scroll(0,1200)");
			
					
		// date of birth drop down list

			Select date_birth = new Select (driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-activity-modal/div[1]/div[2]/div/div[2]/div/app-ex-register-pat/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div[6]/div/vaadin-date-picker//vaadin-text-field//div/div[1]/slot[2]/input")));
             
			date_birth.selectByIndex(1);
	
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
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[1]/img");
			driver.findElement(close_btn).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Register_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
}
