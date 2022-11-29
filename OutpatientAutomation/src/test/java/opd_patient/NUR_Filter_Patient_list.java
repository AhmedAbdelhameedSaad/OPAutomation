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
		                                                                                   
		Thread.sleep(4000); 
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[1]/app-crm-quick-filters/div/div/div[3]/div[2]/div[3]/input")));
	  
		
    Thread.sleep(4000);  
	 
}


public void Nurse_filter_patientlist_By_CriticalCondition() throws InterruptedException {
	
	
		
		Thread.sleep(4000); 
		
		// select out patient check box
	     JavascriptExecutor executor = (JavascriptExecutor) driver; 
	     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[1]/app-crm-quick-filters/div/div/div[2]/div[2]/div[5]/input")));
	     
	     //scroll down
	     Thread.sleep(2000);
	     JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,7000)");
	Thread.sleep(4000);  
	     
	     
	// select critical condition check box
	Thread.sleep(2000); 
	JavascriptExecutor executor1 = (JavascriptExecutor) driver;
     executor1.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[1]/app-crm-quick-filters/div/div/div[5]/div[4]/div[5]/input")));
  
  
		

}
}

