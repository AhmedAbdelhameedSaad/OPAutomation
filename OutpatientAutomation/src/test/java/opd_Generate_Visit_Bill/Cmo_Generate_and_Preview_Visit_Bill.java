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


public class Cmo_Generate_and_Preview_Visit_Bill extends Page_Base {
	
	Action_Menu_Items actionMenuObject;
	
	public Cmo_Generate_and_Preview_Visit_Bill(WebDriver driver) {
		super(driver);    
	} 


   public void Cmo_Generate_VisitBill(String patientNationalID, String bill_value ) throws InterruptedException {
		
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
		
		By unSetteled_tab = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[1]/div[2]");
		
		          driver.findElement(unSetteled_tab).click();
		
	/*		By unbilled_tab = By.xpath(
		 "/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[1]/div[1]");
           driver.findElement(unbilled_tab).click(); */
		          
		   By bill_tab1 = By.xpath(
		    "/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[2]/table/tbody/tr/td[2]");
		   driver.findElement(bill_tab1).click(); 
		   
		   Thread.sleep(2000); 
		
		By payment_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[3]/div[2]/button");
		driver.findElement(payment_btn).click();
		
		
		By money_txtbox = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-payment-details/div/div[2]/div[1]/div/div/input");
		driver.findElement(money_txtbox).sendKeys(bill_value);
		
		 Thread.sleep(2000); 
		
		By continue_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[3]/div[2]/button");
		driver.findElement(continue_btn).click();
		
		Thread.sleep(2000); 
		
		By done_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[3]/div[2]/button[2]");
		driver.findElement(done_btn).click(); 
		
	
	}


public void CMO_Generate_Bill_Practioner_Agenda(String clinicName, String NationalID, String bill_value) { 

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
	
		Thread.sleep(3000);
		
		/*		By Dialysis_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[2]/div[5]");
		
		driver.findElement(Dialysis_btn).click();  
		
		By generalSurgery_btn = By.xpath( 
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[2]/div[1]/div[2]");
		driver.findElement(generalSurgery_btn).click();  */

		
		
	/*	By OHC_Testing_checkbox = By.xpath( "/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[2]/div[4]/input"
				);
		driver.findElement(OHC_Testing_checkbox).click() ; */
		
		By familyMedicine_btn = By.xpath( 
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[2]/div[1]");
		driver.findElement(familyMedicine_btn).click();
		
		Thread.sleep(3000);
		
		By AmrMoez_btn = By.xpath( 
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[12]/div[4]/input");
		driver.findElement(AmrMoez_btn).click();
		

     /*    By calender_btn = By.xpath("");
		
		driver.findElement(calender_btn).click() ;
		
		Thread.sleep(2000);
		
		 By fifteen_date_btn = By.xpath("");
			
		driver.findElement( fifteen_date_btn).click() ;
		
		Thread.sleep(2000);

		 By update_btn = By.xpath("");
				
		driver.findElement( update_btn).click() ; */
		
		Thread.sleep(3000); 
		By tenAM_appoint_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[2]/app-appointments-calendar-view/div/div/div/div[2]/div[1]/div[2]/div/div/div/div/span[1]");

		driver.findElement(tenAM_appoint_btn).click() ;
		
		Thread.sleep(3000);
		
	/*	//Scroll down
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)"); */
		
        By manageBills_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[2]/div[2]/app-appointments-calendar-view/div/div/div/div[2]/div[1]/div[2]/app-appointment-info/div/div[3]/div[3]");

		driver.findElement(manageBills_btn).click() ;  
	
		Thread.sleep(2000); 
		
      	By bill_tab = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div[2]/table/tbody/tr[1]/td[2]");
		driver.findElement(bill_tab).click(); 
		  		
		  
		
	/*	By unSetteled_tab = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[1]/div[2]");
		
		          driver.findElement(unSetteled_tab).click();  
		          
		
			By unbilled_tab = By.xpath(
		 "/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[1]/div[1]");
           driver.findElement(unbilled_tab).click(); 
		          
		   By bill_tab1 = By.xpath(
		    "/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[2]/table/tbody/tr/td[2]");
		   driver.findElement(bill_tab1).click(); 
		   
		   Thread.sleep(2000);   */
		Thread.sleep(2000);
		
		By payment_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[3]/div[2]/button");
		driver.findElement(payment_btn).click();
		
		Thread.sleep(2000); 
		
		By done_btn = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[3]/div[2]/button[2]");
		driver.findElement(done_btn).click(); 
		
				

	} catch (InterruptedException ex) {
		Logger.getLogger(Cmo_Generate_and_Preview_Visit_Bill.class.getName()).log(Level.SEVERE, null, ex);
	}
}


public void Cmo_Preview_Unsettled_Bills(String patientName ) throws InterruptedException {
	
	Thread.sleep(3000); 
	
	By clinical_diary = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
	 
	driver.findElement(clinical_diary).click(); 
	
	Thread.sleep(2000); 
	
	
	actionMenuObject = new Action_Menu_Items(driver);
	actionMenuObject.select_manage_bills_option();
	
	Thread.sleep(3000); 
	
	By search_txt = By.xpath(
			"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div/input");
	driver.findElement(search_txt).sendKeys(patientName+ Keys.ENTER) ;
	
	
	Thread.sleep(2000);
	
	By patientname_text = By.xpath(
		"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]/p");
	driver.findElement(patientname_text).click();
	
	Thread.sleep(2000);

	By bill_tab = By.xpath(
			"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div[2]/table/tbody/tr[1]/td[2]");
	driver.findElement(bill_tab).click(); 
	  		
	Thread.sleep(2000);  
	
	By unSetteled_tab = By.xpath(
			"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-manage-bills/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-visit-charges/div[1]/div[2]/div[1]/div[2]");
	
	          driver.findElement(unSetteled_tab).click();
	
	
	Thread.sleep(2000); 
	

}
}