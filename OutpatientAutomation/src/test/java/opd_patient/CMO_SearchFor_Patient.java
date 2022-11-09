package opd_patient;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import testBase.Page_Base;

public class CMO_SearchFor_Patient extends Page_Base {
	
	public CMO_SearchFor_Patient(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub 
	}

	public void search_by_Identifier(String identifier) {

		try {

			Thread.sleep(3000); 

			By search_bar = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-header/div/div/div[1]/input");
			driver.findElement(search_bar).click();

			Thread.sleep(3000);

			// search by identifier
            
			By identifier_textbox = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[1]/div[2]/input");
			driver.findElement(identifier_textbox).sendKeys(identifier);
		}catch (InterruptedException ex) {
			Logger.getLogger(CMO_SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
	
	public void search_by_ID(String id)
	{
		try {
			Thread.sleep(3000); 
			By search_bar = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-header/div/div/div[1]/input");
			driver.findElement(search_bar).click();
			
			Thread.sleep(3000); 
			By patient_id = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[2]/app-widget/div/div[2]/app-clinical-profile-items/div/div[1]/span/img");
			driver.findElement(patient_id).sendKeys(id);
		}catch (InterruptedException ex) {
			Logger.getLogger(CMO_SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
	
	public void search_by_FN(String First_Name)
	{
		try {
			Thread.sleep(3000); 
			By search_bar = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-header/div/div/div[1]/input");
			driver.findElement(search_bar).click();
			
			Thread.sleep(3000); 
			By first_name = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[3]/input");
			driver.findElement(first_name).sendKeys(First_Name) ;	
			
		}catch (InterruptedException ex) {
			Logger.getLogger(CMO_SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
			
	public void search_by_LN(String Last_Name)
	{
		try {
			Thread.sleep(3000); 
			By search_bar = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-header/div/div/div[1]/input");
			driver.findElement(search_bar).click();
			
			Thread.sleep(3000); 
			By last_name = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[5]/input");
			driver.findElement(last_name).sendKeys(Last_Name) ;	
			
		}catch (InterruptedException ex) {
			Logger.getLogger(CMO_SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
	
	public void search_by_gender_any()
	{
		try {
			Thread.sleep(3000); 
			By search_bar = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-header/div/div/div[1]/input");
			driver.findElement(search_bar).click();
			
			Thread.sleep(3000); 
			By any_gender = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[3]/div[2]/span[1]/label/input");
			driver.findElement(any_gender).click() ;
			
		}catch (InterruptedException ex) {
			Logger.getLogger(CMO_SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
			
	public void search_by_gender_male()
	{
		try {
			Thread.sleep(3000); 
			By search_bar = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-header/div/div/div[1]/input");
			driver.findElement(search_bar).click();
			
			Thread.sleep(3000); 
			By gender_male = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[3]/div[2]/span[2]/label/input");
			driver.findElement(gender_male).click() ;
			
		}catch (InterruptedException ex) {
			Logger.getLogger(CMO_SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}		
	
	public void search_by_gender_female()
	{
		try {
			Thread.sleep(3000); 
			By search_bar = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-header/div/div/div[1]/input");
			driver.findElement(search_bar).click();
			
			Thread.sleep(3000); 
			By gender_female = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[3]/div[2]/span[3]/label/input");
			driver.findElement(gender_female).click() ;
			
		}catch (InterruptedException ex) {
			Logger.getLogger(CMO_SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
			
	public void search_by_date()
	{
		try {
			Thread.sleep(3000); 
			By search_bar = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-header/div/div/div[1]/input");
			driver.findElement(search_bar).click();
			
			Thread.sleep(3000); 
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div\r\n"
					+ "")), 900);
			
			 By select_dob = By.xpath("//*[@id=\"vaadin-dp\"]");        
			 driver.findElement(select_dob).sendKeys("05/11/2020" + Keys.ENTER);
			
			
		}catch (InterruptedException ex) {
			Logger.getLogger(CMO_SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
			
	public void click_find()
	{
		try {
			
			Thread.sleep(3000); 
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div\r\n"
					+ "")), 900);
			
			Thread.sleep(3000); 
			By find_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[5]/button");
			driver.findElement(find_btn).click();
			
		}catch (InterruptedException ex) {
			Logger.getLogger(CMO_SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
		
	public void click_close()
	{
		try {
			Thread.sleep(3000); 
			By search_bar = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-header/div/div/div[1]/input");
			driver.findElement(search_bar).click();
			
			Thread.sleep(3000); 

			By close_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[1]/img");
			driver.findElement(close_btn).click();
			
		}catch (InterruptedException ex) {
			Logger.getLogger(CMO_SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
						
}