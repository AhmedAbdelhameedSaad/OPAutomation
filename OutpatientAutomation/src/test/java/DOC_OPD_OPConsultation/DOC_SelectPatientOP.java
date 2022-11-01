package DOC_OPD_OPConsultation;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DOC_SelectPatientOP {

	public void selectpatientOP(WebDriver driver, String Patient_ID) {

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
			Logger.getLogger(DOC_SelectPatientOP.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
