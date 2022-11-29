package opd_patient;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import testBase.Page_Base;

public class Physician_SearchFor_Patient extends Page_Base {
	
	public Physician_SearchFor_Patient(WebDriver driver) {
		super(driver); 
		// TODO Auto-generated constructor stub 
	}

	public void physician_search_by_Name(String First_Name) 
	{
		try {
			Thread.sleep(4000);  
			By find_patient_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/div[1]/div[2]/div[1]/div[1]");
			driver.findElement(find_patient_btn).click();
			
			Thread.sleep(2000); 
			By search_bar = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/div/div/div[1]/input");
			driver.findElement(search_bar).sendKeys(First_Name + Keys.ENTER);
			
			Thread.sleep(2000); 
			
	  	By patient_name_btn =  By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[2]/div[2]/div/app-crm-leads-list/div[2]/div[1]/div/div[1]/div[1]/div[1]/p");
		
			driver.findElement(patient_name_btn).click();
			
			
			Thread.sleep(3000);  
			
			By encounter_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[2]/div[2]/div/app-crm-leads-list/div[3]/div[2]/div[2]/div[3]"); 
			
			driver.findElement(encounter_btn).click();
			
			Thread.sleep(3000);  
			
			
		}catch (InterruptedException ex) {
			Logger.getLogger(Physician_SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	
	
	}
						


public void physician_search_by_Mobile(String Mobile) 
{
	try {
		Thread.sleep(4000); 
		By find_patient_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-crm-leads/div[1]/div[2]/div[1]/div[1]");
		driver.findElement(find_patient_btn).click();
		
		Thread.sleep(2000); 
		By search_bar = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/div/div/div[1]/input");
		driver.findElement(search_bar).sendKeys(Mobile + Keys.ENTER);
		
		Thread.sleep(2000); 
		
  	By patient_name_btn =  By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[2]/div[2]/div/app-crm-leads-list/div[2]/div[1]/div/div[1]/div[1]/div[1]/p");
	
		driver.findElement(patient_name_btn).click();
		
		
		Thread.sleep(3000);  
		
		By encounter_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[2]/div[2]/div/app-crm-leads-list/div[3]/div[2]/div[2]/div[2]/p[1]"); 
		
		driver.findElement(encounter_btn).click();
		
		Thread.sleep(3000);  
		
		
	}catch (InterruptedException ex) {
		Logger.getLogger(Physician_SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
		
	}


}
					


public void physician_search_by_ID(String ID) 
{
	try {
		Thread.sleep(4000); 
		By find_patient_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-crm-leads/div[1]/div[2]/div[1]/div[1]");
		driver.findElement(find_patient_btn).click();
		
		Thread.sleep(2000); 
		By search_bar = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/div/div/div[1]/input");
		driver.findElement(search_bar).sendKeys(ID + Keys.ENTER);
		
		Thread.sleep(2000); 
		
  	By patient_name_btn =  By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[2]/div[2]/div/app-crm-leads-list/div[2]/div[1]/div/div[1]/div[1]/div[1]/p");
	
		driver.findElement(patient_name_btn).click();
		
		
		Thread.sleep(3000);  
		
		By encounter_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[2]/div[2]/div/app-crm-leads-list/div[3]/div[2]/div[2]/div[2]/p[1]"); 
		
		driver.findElement(encounter_btn).click();
		
		Thread.sleep(3000);  
		
		
	}catch (InterruptedException ex) {
		Logger.getLogger(Physician_SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
		
	}


}
					
}