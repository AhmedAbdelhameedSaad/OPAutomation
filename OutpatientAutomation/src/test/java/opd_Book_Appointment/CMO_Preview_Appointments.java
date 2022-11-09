package opd_Book_Appointment;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import testBase.Page_Base;

public class CMO_Preview_Appointments extends Page_Base {
	
	public WebElement khaled_txt;
	
	public CMO_Preview_Appointments(WebDriver driver) {
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

			
			By khaled_elzend_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[18]/div[4]/input");
			driver.findElement(khaled_elzend_btn).click() ;
	

			

	      By khaled_txt = By.xpath(
	    			"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[2]/app-appointments-calendar-view/div/div/div/div[1]/div[2]/div/span");

	      	driver.findElement(khaled_txt).click();
			
			

		} catch (InterruptedException ex) {
			Logger.getLogger(CMO_Preview_Appointments.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}