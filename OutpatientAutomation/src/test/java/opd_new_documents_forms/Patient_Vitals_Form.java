package opd_new_documents_forms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import testBase.Page_Base;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Patient_Vitals_Form extends Page_Base{

	public Patient_Vitals_Form(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void patient_vitals() {

		try {

			// Fill in the form Patient Vitals
			Thread.sleep(3000);
			By enter_Temperature = By.xpath("//*[@id=\"EL000004#0#VB0004\"]/div/div/app-numericinteger/div/input");
			driver.findElement(enter_Temperature).sendKeys("37"); 

			By enter_Heart_Rate = By.xpath("//*[@id=\"EL000004#0#VB0001\"]/div/div/app-numericinteger/div/input");
			driver.findElement(enter_Heart_Rate).sendKeys("88");

			By enter_Respiratory_Rate = By.xpath("//*[@id=\"EL000004#0#VB0005\"]/div/div/app-numericinteger/div/input");
			driver.findElement(enter_Respiratory_Rate).sendKeys("95");

			By enter_Systolic_BP = By.xpath("//*[@id=\"EL000004#0#VB0002\"]/div/div/app-numericinteger/div/input");
			driver.findElement(enter_Systolic_BP).sendKeys("120");

			By enter_Diastolic_BP = By.xpath("//*[@id=\"EL000004#0#VB0003\"]/div/div/app-numericinteger/div/input");
			driver.findElement(enter_Diastolic_BP).sendKeys("90");

			By enter_Saturated_Partial_Pressure = By
					.xpath("//*[@id=\"EL000004#0#CI0000000000013\"]/div/div/app-numericinteger/div/input");
			driver.findElement(enter_Saturated_Partial_Pressure).sendKeys("97");

			By enter_Blood_Glucose = By.xpath("//*[@id=\"EL000004#0#DMSU\"]/div/div/app-text/div/div[2]/input");
			driver.findElement(enter_Blood_Glucose).sendKeys("170");

			By click_Next = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[2]");
			driver.findElement(click_Next).click();

			// Patient Height and Weight

//			By enter_Height = By.xpath("//*[@id=\"EL000004#0#SYSHEIGHT\"]/div/div/app-numericinteger/div/input");
//			driver.findElement(enter_Height).sendKeys("185");
//
//			By enter_Weight = By.xpath("//*[@id=\"EL000004#0#SYSWEIGHT\"]/div/div/app-numericinteger/div/input");
//			driver.findElement(enter_Weight).sendKeys("90");

			Thread.sleep(2000);

			By click_Perview = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[1]/div[1]/div[3]");
			driver.findElement(click_Perview).click();

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");
		} catch (InterruptedException ex) {
			Logger.getLogger(Patient_Vitals_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void preview_vitals()
	{ 
		try {
		Thread.sleep(4000);
		By preview_button = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[1]/div[1]/div[3]");
		driver.findElement(preview_button).click();
	} catch (InterruptedException ex) {
		Logger.getLogger(Patient_Vitals_Form.class.getName()).log(Level.SEVERE, null, ex);
           }	
         }
	
	public void submit_vitals()
	{
		try {
			Thread.sleep(3000);

			By submit_button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(submit_button).click();

		}catch (InterruptedException ex) {
			Logger.getLogger(Patient_Vitals_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}

	public void save_vitals()
	{
		try {
			Thread.sleep(3000);

			By save_button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[3]");
			driver.findElement(save_button).click();

		}catch (InterruptedException ex) {
			Logger.getLogger(Patient_Vitals_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
}