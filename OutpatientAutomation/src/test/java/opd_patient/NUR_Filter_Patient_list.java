package opd_patient;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import testBase.Page_Base;

public class NUR_Filter_Patient_list extends Page_Base {
	
	public NUR_Filter_Patient_list(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void Nurse_filter_patientlist_ByType() throws InterruptedException {

		
		
	/*	Actions act =  new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[1]/app-crm-quick-filters/div/div/div[2]/div[2]/div[5]/input"))).click().perform(); */

		
		try {
			Thread.sleep(4000); 
			
		     driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[1]/app-crm-quick-filters/div/div/div[2]/div[2]/div[5]/input")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[1]/app-crm-quick-filters/div/div/div[2]/div[2]/div[5]/input")));
		  }
	
		
		Thread.sleep(2000); 
		System.out.println("Nurse view Patient list successfully"); 
	}


public void Nurse_filter_patientlist_By_Facility() throws InterruptedException {

	

		
		try {
			
			Thread.sleep(4000); 
			
		     driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[1]/app-crm-quick-filters/div/div/div[2]/div[2]/div[5]/input")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[1]/app-crm-quick-filters/div/div/div[2]/div[2]/div[5]/input")));
		  }
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[1]/app-crm-quick-filters/div/div/div[3]/div[2]/div[3]/input")));
	  
		
    Thread.sleep(4000); 
	
}
}
