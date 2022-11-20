package opd_Generate_Visit_Bill;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import opd_HP_Menus.Action_Menu_Items;
import testBase.Page_Base;


public class Cmo_Cancel_and_Unsettle_Visit_Bill extends Page_Base {
	
	


	Action_Menu_Items actionMenuObject;
	
	public Cmo_Cancel_and_Unsettle_Visit_Bill(WebDriver driver) {
		super(driver);    
	} 


   public void Cmo_Cancel_Settled_VisitBill(String patientNationalID ) throws InterruptedException {
		
		Thread.sleep(3000); 
		
		By clinical_diary = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
		 
		driver.findElement(clinical_diary).click(); 
		
		Thread.sleep(2000); 
		
		
		actionMenuObject = new Action_Menu_Items(driver);
		actionMenuObject.select_manage_bills_option();
		
		Thread.sleep(3000); 
		
		By search_txt = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div/input");
		driver.findElement(search_txt).sendKeys(patientNationalID + Keys.ENTER) ;
		
		
		Thread.sleep(2000); 
		
		By patientname_text = By.xpath(
			"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]/p");
		driver.findElement(patientname_text).click();
		
		Thread.sleep(2000);
	
		By bill_tab = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div[2]/table/tbody/tr[1]/td[2]");
		driver.findElement(bill_tab).click(); 
		  		
		Thread.sleep(2000);  
		
		By Setteled_tab = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[1]/div[3]");
		driver.findElement(Setteled_tab).click();
		
	/*		By unbilled_tab = By.xpath(
		 "/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[1]/div[1]");
           driver.findElement(unbilled_tab).click(); */
		
		Thread.sleep(2000); 
		          
		   By cancel_icon = By.xpath(
		    "/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[2]/table/tbody/tr[1]/td[6]/div/img[2]");
		   driver.findElement(cancel_icon).click(); 
		   
		   Thread.sleep(2000);
		  
		By reason_list_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div/img");
		driver.findElement(reason_list_btn).click();
		
		Thread.sleep(3000); 
		
		By NotJustified_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/div/a[1]");
		driver.findElement(NotJustified_btn).click();
		
		 Thread.sleep(2000); 
		
		By continue_btn = By.xpath( 
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[3]/div[2]/button");
		driver.findElement(continue_btn).click();
		
		Thread.sleep(2000); 
		
		By cancel_complete_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[3]/div[2]/button");
		driver.findElement(cancel_complete_btn).click(); 
		
		 Thread.sleep(2000);
		
		By Done_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[3]/div[2]/button");
		driver.findElement(Done_btn).click();   
		
		
	}




public void Cmo_Cancel_Unsettled_VisitBill(String patientNationalID ) throws InterruptedException {
	
	Thread.sleep(3000); 
	
	By clinical_diary = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
	 
	driver.findElement(clinical_diary).click(); 
	
	Thread.sleep(2000); 
	
	
	actionMenuObject = new Action_Menu_Items(driver);
	actionMenuObject.select_manage_bills_option();
	
	Thread.sleep(3000); 
	
	By search_txt = By.xpath(
			"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div/input");
	driver.findElement(search_txt).sendKeys(patientNationalID + Keys.ENTER) ;
	
	
	Thread.sleep(2000); 
	
	By patientname_text = By.xpath(
		"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]/p");
	driver.findElement(patientname_text).click();
	
	Thread.sleep(2000);

	By bill_tab = By.xpath(
			"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div[2]/table/tbody/tr[1]/td[2]");
	driver.findElement(bill_tab).click(); 
	  		
	Thread.sleep(2000);  
	
	By UnSetteled_tab = By.xpath(
			"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[1]/div[2]");
	driver.findElement(UnSetteled_tab).click();
	
/*		By unbilled_tab = By.xpath(
	 "/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[1]/div[1]");
       driver.findElement(unbilled_tab).click(); */
	
	Thread.sleep(2000); 
	          
	   By cancel_icon = By.xpath(
	    "/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[2]/table/tbody/tr/td[7]/div/img[3]");
	   driver.findElement(cancel_icon).click(); 
	   
	   Thread.sleep(2000);
	  
	By reason_list_btn = By.xpath(
			"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div/img");
	driver.findElement(reason_list_btn).click();
	
	Thread.sleep(3000); 
	
	By NotJustified_btn = By.xpath(
			"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/div/a[1]");
	driver.findElement(NotJustified_btn).click();
	
	 Thread.sleep(2000); 
	
	By continue_btn = By.xpath( 
			"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[3]/div[2]/button");
	driver.findElement(continue_btn).click();
	
	Thread.sleep(2000); 
	
	By cancel_complete_btn = By.xpath(
			"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[3]/div[2]/button");
	driver.findElement(cancel_complete_btn).click(); 
	
	 Thread.sleep(2000);
	
	By Done_btn = By.xpath(
			"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[3]/div[2]/button");
	driver.findElement(Done_btn).click();  
	
	
}



}