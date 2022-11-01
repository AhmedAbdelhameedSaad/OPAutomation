package OP_Consultation_Sections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Internal_External_Referral {

	public void Physicians_referral_Edge(WebDriver driver) {

		try {
			
			// Internal / External referral
			// Need to check scroll amount ?
			
			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");
			
			By select_Internal_External_referral = By.xpath("//*[@id=\"OPCONSULT#0#EXTFER\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(select_Internal_External_referral).click();

			By search_Internal_External_referral_Text = By.xpath("//*[@id=\"cns-ref-search\"]");
			driver.findElement(search_Internal_External_referral_Text).sendKeys("General Surgery");

			Thread.sleep(2000);

			By select_Referral = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-referral/div/div[1]/div[2]/div[2]/div");
			driver.findElement(select_Referral).click();

			Thread.sleep(3000);

			By enter_Reason_for_referral = By.xpath("//*[@id=\"EXTREF#0#REASON\"]/div/div/app-longtext/div/div[2]/textarea");
			driver.findElement(enter_Reason_for_referral).sendKeys("For Test");

			By select_Referral_Priority = By.xpath("//*[@id=\"EXTREF#0#REASONR\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Referral_Priority).click();
			
			By Transportation = By.xpath("//*[@id=\"EXTREF#0#TRANSP\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(Transportation).click();

			By General_condition = By.xpath("//*[@id=\"EXTREF#0#GENCONDREF\"]/div/div/app-radio/div/div/div[2]/div[1]/div/input");
			driver.findElement(General_condition).click();
			
			By Level_of_consciousness  = By.xpath("//*[@id=\"EXTREF#0#CONLEVREF\"]/div/div/app-radio/div/div/div[2]/div[1]/div/input");
			driver.findElement(Level_of_consciousness).click();

			By Notes = By.xpath("//*[@id=\"EXTREF#0#REFNOTESNEW\"]/div/div/app-text/div/div[2]/input");
			driver.findElement(Notes).sendKeys("Test");

			By Search_button = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-referral/div/div[2]/div/app-external-referral-facility/div/div/div[1]/div/span");
			driver.findElement(Search_button).click();
			
			TimeUnit.MINUTES.sleep(1);
			
			//check scroll amount ?
			
			JavascriptExecutor java1 = (JavascriptExecutor) driver;
			java1.executeScript("scroll(0,250)");
			
			By Facility_check = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-referral/div/div[2]/div/app-external-referral-facility/div/div/div[1]/div[2]/div/div[23]/div[1]");
			driver.findElement(Facility_check).click();

			//check scroll amount ?
			
			JavascriptExecutor java2 = (JavascriptExecutor) driver;
			java2.executeScript("scroll(0,250)");
			
			By Availible_date = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-referral/div/div[2]/div/app-external-referral-facility/div/div[2]/div[2]/div/div[14]/div[3]");
			driver.findElement(Availible_date).click();

			//check scroll amount ?
			
			JavascriptExecutor java3 = (JavascriptExecutor) driver;
			java3.executeScript("scroll(0,-250)");
			
			By Time_availible = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-referral/div/div[2]/div/app-external-referral-facility/div/div[2]/div[2]/div[2]/div/div[2]/div[3]/div[11]");
			driver.findElement(Time_availible).click();
			
			By Submit_icon = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-referral/div/div[2]/div/div/div/img[1]");
			driver.findElement(Submit_icon).click();
			
			By Close_Button = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button).click();

			Thread.sleep(3000);

			By Submit_Button = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(Submit_Button).click();
			
			Thread.sleep(7000);

		} catch (InterruptedException ex) {
			Logger.getLogger(Internal_External_Referral.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}