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


	public void NUR_DOC_selectpatient ()
	{
		try {
			Thread.sleep(7000); 
			By selectpatient = By.xpath( 
					"/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[2]/div/div/app-crm-patients-list/div/div[2]/div/div[1]/div[1]");
			driver.findElement(selectpatient).click();
			
		}catch (InterruptedException ex) {
			Logger.getLogger(SelectPatientOP.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}


	public void NUR_DOC_searchpatient(String Patient) {

		try {

			// Search for patient

			Thread.sleep(5000);
			By searchText = By
					.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/div/div/div[1]/input");
			driver.findElement(searchText).sendKeys(Patient + Keys.ENTER);

			Thread.sleep(5000);


		} catch (InterruptedException ex) {
			Logger.getLogger(SelectPatientOP.class.getName()).log(Level.SEVERE, null, ex);
		}
	}



}
