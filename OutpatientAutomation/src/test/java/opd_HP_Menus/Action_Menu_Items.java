package opd_HP_Menus;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testBase.*;

public class Action_Menu_Items extends Page_Base {

	public Action_Menu_Items(WebDriver driver) {
		super(driver);
		
		 
	}
 
	public void select_book_appointment_item() {
		try {

			Thread.sleep(5000); 

			By actions_btn = By
					.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div/div[2]");
			driver.findElement(actions_btn).click();

			Thread.sleep(3000);

			By book_appointment = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-forms-list/div/div[2]/div[2]/div[2]/div[2]");

			driver.findElement(book_appointment).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Action_Menu_Items.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void select_consultation_visit_item() {

		try {

			Thread.sleep(4000);
			// Click on Action
			By Action = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div/div[2]");
			driver.findElement(Action).click();

			Thread.sleep(4000);

			// Select "Create Consultation Visit"
			By Consultation_Visit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-forms-list/div/div[2]/div[2]/div[2]/div[3]");
			driver.findElement(Consultation_Visit).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Action_Menu_Items.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public void select_manage_bills_option() { 

		try {

			Thread.sleep(4000);
			// Click on Action
			By Action = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div/div[2]");
			driver.findElement(Action).click();

			Thread.sleep(4000);

			//click on generate bills icon
			
			By generate_bill_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-forms-list/div/div[2]/div[2]/div[1]/div[2]");
				 
			driver.findElement(generate_bill_btn).click(); 

		} catch (InterruptedException ex) {
			Logger.getLogger(Action_Menu_Items.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
