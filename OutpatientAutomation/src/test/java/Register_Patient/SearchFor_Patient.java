package Register_Patient;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchFor_Patient {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(5000);

			By search_bar = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-header/div/div/div[1]/input");
			driver.findElement(search_bar).click();

			Thread.sleep(3000);

			// search by identifier
            
			By identifier_textbox = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[1]/div[2]/input");
			driver.findElement(identifier_textbox).sendKeys("123456789");

			Thread.sleep(3000);

			By patient_id = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[2]/app-widget/div/div[2]/app-clinical-profile-items/div/div[1]/span/img");
			driver.findElement(patient_id).sendKeys("123456789");

			By first_name = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[3]/input");
			driver.findElement(first_name).sendKeys("123456789") ;	

			By last_name = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[2]/div[5]/input");
			driver.findElement(last_name).sendKeys("123456789") ;
			
			By any_gender = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[3]/div[2]/span[1]/label/input");
			driver.findElement(any_gender).click() ;
			
		// drop down list
			
			By date_birth_list = By.xpath(
					"");
			By date_of_birth;
			driver.findElement(date_birth_list).click() ;
	

			By find_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[5]/button");
			driver.findElement(find_btn).click();
			

			By close_btn = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[1]/img");
			driver.findElement(close_btn).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(SearchFor_Patient.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
