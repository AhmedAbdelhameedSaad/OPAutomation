package opd_appointment;

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


public class Search_For_Clinic extends Page_Base {
	
	Action_Menu_Items actionMenuObject;
	
	public Search_For_Clinic(WebDriver driver) {
		super(driver);  
	} 


	public void Search_ForClinic_Diary_Page(String department ) throws InterruptedException {
		
		Thread.sleep(3000); 
		
		//click on clinical diary icon
		
		By clinical_diary = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
		 
		driver.findElement(clinical_diary).click(); 
		
		Thread.sleep(2000); 
		By select_clinic = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[1]");
		driver.findElement(select_clinic).click();
		
		Thread.sleep(3000);
		//family medicine clinic
		By search_clinic = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[1]/input");
		driver.findElement(search_clinic).sendKeys("family medicine clinic");
		
		Thread.sleep(2000);
		By select_clinic_element = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div[2]/div");
		driver.findElement(select_clinic_element).click();

		
	}

	
	public void Search_ForClinic_Actions_Menu(String department ) throws InterruptedException {
		

		Thread.sleep(3000);   
		
		//click on clinical diary icon
		
		By clinical_diary = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
		
		driver.findElement(clinical_diary).click();
		
		actionMenuObject = new Action_Menu_Items(driver);
		actionMenuObject.select_book_appointment_item();

		By search_txt = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[2]/div/input");
		driver.findElement(search_txt).sendKeys(department) ;
		//driver.findElement(search_txt).sendKeys("General Surgery" or "Family Medicine") ;
		
		Thread.sleep(3000);
		
		/* By familymedicine_text = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div/p");
				
		driver.findElement(familymedicine_text).click() ;  */
		
		By generalsurgery_text = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-book-appointment/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div/p");
		driver.findElement(generalsurgery_text).click() ;  
				
		
	}
	
}

