package opd_new_documents_forms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import testBase.Page_Base;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Nurse_Submit_Allergy_Form extends Page_Base{

	public Nurse_Submit_Allergy_Form(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void nurse_fill_allergy_form() {

		try {

			// Choose Allergy Type
			
			Thread.sleep(3000);
			By general_radiobtn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[3]/app-section/div/div/app-segment/div/div/div[2]/div[2]/div/input");
			driver.findElement(general_radiobtn).click(); 
			
			//Enter Allergy cause
			
			Thread.sleep(3000);
			By search_txtbox  = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[4]/app-section/div/div/app-masterlinked/div/div/div[1]/input");
			driver.findElement(search_txtbox).sendKeys("Cheese");
			
			Thread.sleep(3000);
			By cheese_option = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[4]/app-section/div/div/app-masterlinked/div/div/div[2]/div/p[1]");
			driver.findElement(cheese_option).click();

			By substance_txtbox = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[5]/app-section/div/div/app-text/div/div[2]/input");
			driver.findElement( substance_txtbox).sendKeys("lactose");

			By reaction1_txtbox = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[6]/app-section/div/div/app-masterlinked/div/div/div/input");
			driver.findElement(reaction1_txtbox).sendKeys("Itching");
			
			Thread.sleep(2000);
			
			By itching_option = By
					.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[6]/app-section/div/div/app-masterlinked/div/div/div[2]/div/p");
			driver.findElement(itching_option).click();
			
		/*	JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,500)"); */
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			 jse.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div")), 600);
			

			
			Thread.sleep(2000);
			By reaction2_txtbox = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[7]/app-section/div/div/app-masterlinked/div/div/div/input");
			driver.findElement(reaction2_txtbox).sendKeys("Abdominal pain");
			
			Thread.sleep(2000);
			By abdominal_pain_option = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[7]/app-section/div/div/app-masterlinked/div/div/div[2]/div/p[1]");
			driver.findElement(abdominal_pain_option).click();

			Thread.sleep(2000);
			By reaction3_txtbox = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[8]/app-section/div/div/app-masterlinked/div/div/div/input"); 
			driver.findElement(reaction3_txtbox).sendKeys("Headache");
			
			Thread.sleep(2000);
			By headache_option = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[8]/app-section/div/div/app-masterlinked/div/div/div[2]/div/p");
			driver.findElement(headache_option).click();
			
			Thread.sleep(2000);
			By moderate_radiobtn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[9]/app-section/div/div/app-check/div/div/div[2]/div[2]/div/input");
			driver.findElement(moderate_radiobtn).click();
			
			Thread.sleep(2000);
			By onset_txtbox = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[10]/app-section/div/div/app-timeperiod/div/input");
			driver.findElement(onset_txtbox).sendKeys("1" + Keys.ENTER);
			
			Thread.sleep(2000);

			/*	Select objSelect =new Select(driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[10]/app-section/div/div/app-timeperiod/div/datalist")));
			objSelect.selectByVisibleText("1");  
			
				By choose_num_from_list = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[10]/app-section/div/div/app-timeperiod/div/datalist/option[1]");
			driver.findElement(choose_num_from_list).click();   */
			
			Thread.sleep(3000);
			By dropdown_list = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[10]/app-section/div/div/app-timeperiod/div/select");
			driver.findElement(dropdown_list).click();
			
			Select objSelect2 =new Select(driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[10]/app-section/div/div/app-timeperiod/div/select"))); 
			objSelect2.selectByIndex(1);
			
			
			
			Thread.sleep(2000);
	/*		By weeks_option = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[10]/app-section/div/div/app-timeperiod/div/select/option[2]");
			driver.findElement(weeks_option).click();  */
			
			
			Thread.sleep(2000);
			By remarks_txtbox = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[11]/app-section/div/div/app-text/div/div[2]/input");
			driver.findElement(remarks_txtbox).sendKeys("inconsistent symptoms");
			
			Thread.sleep(2000);
			By next_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[2]");
			driver.findElement(next_btn).click();
			


			
		} catch (InterruptedException ex) {
			Logger.getLogger(Nurse_Submit_Allergy_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	
	
	public void submit_allergy()
	{
		try {
			Thread.sleep(3000); 

			By submit_button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(submit_button).click();
			
			Thread.sleep(3000);

		}catch (InterruptedException ex) {
			Logger.getLogger(Nurse_Submit_Allergy_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}

	public void save_allergy()
	{
		try {
			Thread.sleep(3000);

			By save_as_drift_button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[3]");
			driver.findElement(save_as_drift_button).click();

		}catch (InterruptedException ex) {
			Logger.getLogger(Nurse_Submit_Allergy_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
}