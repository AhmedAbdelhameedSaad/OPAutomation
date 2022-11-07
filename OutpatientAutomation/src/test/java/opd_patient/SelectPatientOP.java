package opd_patient;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import testBase.Page_Base;

public class SelectPatientOP extends Page_Base{

	public SelectPatientOP(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void cmo_findpatientOP( String Patient_ID) {

		try {
			By Findpatient = By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[1]/div[2]/div[1]/div[1]");
			driver.findElement(Findpatient).click();
			// Search for patient

			Thread.sleep(6000);

			By searchText = By
					.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[1]/app-crm-quick-filters/div/div/div[2]/div[2]/div/input");
			driver.findElement(searchText).sendKeys(Patient_ID + Keys.ENTER);

			Thread.sleep(8000);

			// Select the patient
			By patientName = By.xpath(
					"//*[@id=\"lead-search\"]/div/div/div[2]/div[1]");
			driver.findElement(patientName).click();
			By patientdoctor = By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[2]/div[2]/div/app-crm-leads-list/div[3]/div[2]/div[2]/div[2]/p[1]");
			driver.findElement(patientdoctor).click();
		} catch (InterruptedException ex) {
			Logger.getLogger(SelectPatientOP.class.getName()).log(Level.SEVERE, null, ex);
		}
	}



	public void NUR_DOC_selectpatient ()
	{
		try {
			Thread.sleep(5000);
			By selectpatient = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[2]/div/div/app-crm-patients-list/div/div[2]/div/div[1]/div[1]");
			driver.findElement(selectpatient).click();
			
		}catch (InterruptedException ex) {
			Logger.getLogger(SelectPatientOP.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
}
