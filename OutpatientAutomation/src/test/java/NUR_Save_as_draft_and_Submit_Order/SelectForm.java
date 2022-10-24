package NUR_Save_as_draft_and_Submit_Order;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SelectForm {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(6000);
			// Click on Action
			By Action = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/div/div/div[2]/div/div[6]");
			driver.findElement(Action).click();

			// Select New Document
			By newDocument = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-lead-actions-popover/div/div/div[3]/div");
			driver.findElement(newDocument).click();

			Thread.sleep(5000);

			// Search for Form
			By searchFormText = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[1]/input");
			driver.findElement(searchFormText).sendKeys("Nurse order form" + Keys.ENTER);

			// Select The Form
			By selectform = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[2]/div[2]");
			driver.findElement(selectform).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(SelectForm.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
