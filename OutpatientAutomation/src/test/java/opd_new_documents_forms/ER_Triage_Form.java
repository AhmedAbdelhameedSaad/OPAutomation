package opd_new_documents_forms;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import testBase.*;

public class ER_Triage_Form extends Page_Base {

	public ER_Triage_Form(WebDriver driver) {
		super(driver); 
	}
 
	public void nurse_fill_during_dialysis_form() {

		try {
			
			Thread.sleep(3000);   
		
			By diagnosis_textbox = By
					.xpath("");
			driver.findElement(diagnosis_textbox).click();			
			
			By sessions_number = By
					.xpath("");
			driver.findElement(sessions_number).sendKeys("5");
			
			Thread.sleep(2000);
			
			By duration_txt = By
					.xpath("");
			driver.findElement(duration_txt).sendKeys("2");
			
	
			By date_time_list = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[7]/app-section/div/div/app-dateandtime/input");
			driver.findElement(date_time_list).click();
			
			Thread.sleep(4000);
			By five = By
					.xpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[2]/td[2]/span");
			driver.findElement(five).click();
			
			Thread.sleep(2000);
			By hour = By
					.xpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/owl-date-time-timer/owl-date-time-timer-box[1]/label/input");
			driver.findElement(hour).clear();
			Thread.sleep(2000);
			driver.findElement(hour).sendKeys("9");
			
			Thread.sleep(2000);
			By minute = By
					.xpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/owl-date-time-timer/owl-date-time-timer-box[2]/label/input");
			driver.findElement(minute).clear();
			Thread.sleep(2000);
			driver.findElement(minute).click();
			
		
			Thread.sleep(2000);
			By update = By
					.xpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/div/button[2]/span");
			driver.findElement(update).click();
			
			Thread.sleep(2000);
			By pulseInminute = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[8]/app-section/div/div/app-numericinteger/div/input");
			driver.findElement(pulseInminute).sendKeys("130");
			
			
			Thread.sleep(2000);
			By temp = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[9]/app-section/div/div/app-numericinteger/div/input");
			driver.findElement(temp).sendKeys("37");
			
			JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			 jse2.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div")), 300);
			
			
		Thread.sleep(2000);
			By BFR = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[10]/app-section/div/div/app-numericinteger/div/input");
			driver.findElement(BFR).sendKeys("45");
			
					Thread.sleep(2000);
			By vp = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[11]/app-section/div/div/app-numericinteger/div/input");
			driver.findElement(vp).sendKeys("44");
			
			Thread.sleep(2000);
			By tmp = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[12]/app-section/div/div/app-numericinteger/div/input");
			driver.findElement(tmp).sendKeys("55");
			
			JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			 jse3.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div")), 600);
			
			Thread.sleep(2000);
			By weightBefore = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[13]/app-section/div/div/app-numericinteger/div/input");
			driver.findElement(weightBefore).sendKeys("90"); 
			
			Thread.sleep(2000);
			By weightAfter = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[14]/app-section/div/div/app-numericinteger/div/input");
			driver.findElement(weightAfter).sendKeys("85");
			

			Thread.sleep(2000);
			By firstHour = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[16]/app-section/div/div/app-numericinteger/div/input");
			driver.findElement(firstHour).sendKeys("100");
			
			Thread.sleep(2000);
		By secondHour = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[17]/app-section/div/div/app-numericinteger/div/input");
			driver.findElement(BFR).sendKeys("115");
			
			Thread.sleep(2000);
			By thirdHour = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[18]/app-section/div/div/app-numericinteger/div/input");
			driver.findElement(BFR).sendKeys("125");
			
			Thread.sleep(2000);
			By fourthHour = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[19]/app-section/div/div/app-numericinteger/div/input");
			driver.findElement(BFR).sendKeys("130");
			
			JavascriptExecutor jse4 = (JavascriptExecutor)driver;
			 jse4.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div")), 300);
			
			
			Thread.sleep(2000);
			By session_Efficiency = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[28]/app-section/div/div/app-text/div/div[2]/input");
			driver.findElement(session_Efficiency).sendKeys("Good"); 
			
			Thread.sleep(2000);
			By next_btn = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[2]");
			driver.findElement(next_btn).click(); 
			

			
			
		} catch (InterruptedException ex) {
			Logger.getLogger(ER_Triage_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
	}


   
   public void click_on_Submit_button() 
   {
By submit_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
driver.findElement(submit_btn).click();

   }
   
   
   public void click_on_save_As_draft() 
   {
By submit_Print_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[3]");
driver.findElement(submit_Print_btn).click();

   }
   
   
   
   
}








