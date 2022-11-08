package opd_new_documents_forms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import testBase.Page_Base;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NUR_Place_Order extends Page_Base {

	public NUR_Place_Order(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void nurse_order() {

		try {

			// Fill in the form

			// Place Lab Order
			By Lab_order = By.xpath("//*[@id=\"NURORDER#0#LABORD\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(Lab_order).click();

			By search_Lab_order = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Lab_order).sendKeys("Annual Check Up LAB Tests");

			By Select_Lab_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div");
			driver.findElement(Select_Lab_order).click();

			Thread.sleep(3000);

			// Place Rad Order
			By Rad_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[2]/div/span[2]");
			driver.findElement(Rad_order).click();

			By search_Rad_order = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Rad_order).sendKeys("Gastro intestinal bleeding scan");

			By Select_Rad_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div");
			driver.findElement(Select_Rad_order).click();

			Thread.sleep(4000);

			By click_ICD11_Diagnosis = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[4]/div/span[2]");
			driver.findElement(click_ICD11_Diagnosis).click();

			By search_ICD11_Diagnosis = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_ICD11_Diagnosis).sendKeys("1A31 Giardiasis");

			Thread.sleep(3000);

			By select_Diagnosis = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div[1]/div");
			driver.findElement(select_Diagnosis).click();

			Thread.sleep(3000);

			By select_Diagnosis_Classification = By
					.xpath("//*[@id=\"1A31#0#SYSDIAGCAT\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Diagnosis_Classification).click();

			By select_Nature = By
					.xpath("//*[@id=\"1A31#0#DI00001\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Nature).click();

			By select_Accuracy = By
					.xpath("//*[@id=\"1A31#0#DIAGACCU\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Accuracy).click();

			Select Onset_Since_dropdown = new Select(
					driver.findElement(By.xpath("//*[@id=\"1A31#0#DIAGONSET\"]/div/div/app-timeperiod/div/select")));
			Onset_Since_dropdown.selectByVisibleText("Days");

			By enter_Onset_Since = By.xpath("//*[@id=\"1A31#0#DIAGONSET\"]/div/div/app-timeperiod/div/input");
			driver.findElement(enter_Onset_Since).sendKeys("6");

			Thread.sleep(2000);

			By Close_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button).click();

			Thread.sleep(1000);
			

		} catch (InterruptedException ex) {
			Logger.getLogger(NUR_Place_Order.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void submit_nurse_order()
	{
		try {
		By Submit_Button = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
		driver.findElement(Submit_Button).click();

		Thread.sleep(3000);
		
		/*By Close_Icon = By.xpath(
		"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[1]/div/div/div[2]/img");
        driver.findElement(Close_Icon).click();

        JavascriptExecutor java = (JavascriptExecutor) driver;
        java.executeScript("scroll(0,250)");

        Thread.sleep(4000);*/
		} catch (InterruptedException ex) {
			Logger.getLogger(NUR_Place_Order.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void save_darft_nurse_order()
	{
		try {
		By Save_as_draft_Button = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[3]");
		driver.findElement(Save_as_draft_Button).click();

		JavascriptExecutor java = (JavascriptExecutor) driver;
		java.executeScript("scroll(0,250)");
	
		Thread.sleep(3000);
	
		} catch (InterruptedException ex) {
		Logger.getLogger(NUR_Place_Order.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void submit_after_save_draft()
	{
		try {
		Thread.sleep(7000);
		// Click on Action
		By Action = By.xpath("//div[text()='Actions ']");
		driver.findElement(Action).click();

		Thread.sleep(4000);

		// Mouse Hover action
		Actions action = new Actions(driver);
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"popover-content\"]/div/div[2]/div[1]"));
		action.moveToElement(edit).build().perform();

		Thread.sleep(3000);

		// Select Saved drafts
		By Saved_drafts = By.xpath("//*[@id=\"popover-content\"]/div/div[2]/div[3]/img[1]");
		driver.findElement(Saved_drafts).click();

		Thread.sleep(4000);

		// Submit the Form
		By Submit_Button = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-patient-view/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
		driver.findElement(Submit_Button).click();

	} catch (InterruptedException ex) {
		Logger.getLogger(NUR_Place_Order.class.getName()).log(Level.SEVERE, null, ex);
	}
}
	
}

