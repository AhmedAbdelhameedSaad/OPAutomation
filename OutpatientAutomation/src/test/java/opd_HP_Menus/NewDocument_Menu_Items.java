package opd_HP_Menus;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import testBase.Page_Base;

public class NewDocument_Menu_Items extends Page_Base{

	public NewDocument_Menu_Items(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void select_pain_assessment() {

		try {

			Thread.sleep(7000); 
			// Click on Action
			By Action = By.xpath("//div[text()='Actions ']");
			driver.findElement(Action).click();

			// Select New Document
			By newDocument = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-lead-actions-popover/div/div/div[3]/div");
			driver.findElement(newDocument).click();

			Thread.sleep(5000);

			// Search for Form
			By searchFormText = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[1]/input");
			driver.findElement(searchFormText).sendKeys("Pain Assessment" + Keys.ENTER);

			// Select The Form
			By selectform = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[2]/div[2]");
			driver.findElement(selectform).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(NewDocument_Menu_Items.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void select_patient_vitals() {

		try {

			Thread.sleep(7000);
			// Click on Action
			By Action = By.xpath("//div[text()='Actions ']");
			driver.findElement(Action).click();

			// Select New Document
			By newDocument = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-lead-actions-popover/div/div/div[3]/div");
			driver.findElement(newDocument).click();

			Thread.sleep(5000);

			// Search for Form
			By searchFormText = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[1]/input");
			driver.findElement(searchFormText).sendKeys("Patient Vitals" + Keys.ENTER);

			// Select The Form
			By selectform = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[2]/div[2]");
			driver.findElement(selectform).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(NewDocument_Menu_Items.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void select_OP_Consultation_Form() {

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		try {

			Thread.sleep(9000);
			// Click on Action
			By Action = By.xpath("//div[text()='Actions ']");
			driver.findElement(Action).click();

			// Select New Document
			By newDocument = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-lead-actions-popover/div/div/div[3]/div");
			driver.findElement(newDocument).click();

			Thread.sleep(5000);

			// Search for Form
			By searchFormText = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[1]/input");
			driver.findElement(searchFormText).sendKeys("OP Consultation" + Keys.ENTER);

			// Select The Form
			By selectform = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[2]/div[2]");
			driver.findElement(selectform).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(NewDocument_Menu_Items.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void select_upload_document() {

		try {

			Thread.sleep(7000);

			// Click on Action
			By Action = By.xpath("//div[text()='Actions ']");
			driver.findElement(Action).click();

			Thread.sleep(10000);

			// Select Upload_Document
			By Upload_Document = By.xpath("//*[@id=\"popover-content\"]/div/p");
			driver.findElement(Upload_Document).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(NewDocument_Menu_Items.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void select_nurse_order_form() {

		try {

			Thread.sleep(7000);
			// Click on Action
			By Action = By.xpath("//div[text()='Actions ']");
			driver.findElement(Action).click();

			// Select New Document
			By newDocument = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-lead-actions-popover/div/div/div[3]/div");
			driver.findElement(newDocument).click();

			Thread.sleep(4000);

			// Search for Form
			By searchFormText = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[1]/input");
			driver.findElement(searchFormText).sendKeys("Nurse order form" + Keys.ENTER);

			Thread.sleep(3000);

			// Select The Form
			By selectform = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[2]/div[2]");
			driver.findElement(selectform).click();
		} catch (InterruptedException ex) {
			Logger.getLogger(NewDocument_Menu_Items.class.getName()).log(Level.SEVERE, null, ex);
		}
	}



public void select_Allergy_Form() {

	try {

		Thread.sleep(4000);
		// Click on Action
		By Action = By.xpath("//div[text()='Actions ']");
		driver.findElement(Action).click();

		// Select New Document
		By newDocument = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-patient-view/app-lead-actions-popover/div/div/div[3]/div");
		driver.findElement(newDocument).click();

		Thread.sleep(3000);

		// Search for Form
		By searchFormText = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[1]/input");
		driver.findElement(searchFormText).sendKeys("Allergy" + Keys.ENTER);

		// Select The Form
		By selectform = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[2]/div[2]");
		driver.findElement(selectform).click();

	} catch (InterruptedException ex) {
		Logger.getLogger(NewDocument_Menu_Items.class.getName()).log(Level.SEVERE, null, ex);
	}
}


public void select_During_Dialysis() {

	try {

		Thread.sleep(4000);
		// Click on Action
		By Action = By.xpath("//div[text()='Actions ']");
		driver.findElement(Action).click();

		// Select New Document
		By newDocument = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-patient-view/app-lead-actions-popover/div/div/div[3]/div");
		driver.findElement(newDocument).click();

		Thread.sleep(3000);

		// Search for Form
		By searchFormText = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[1]/input");
		driver.findElement(searchFormText).sendKeys("during dialysis" + Keys.ENTER);

		// Select The Form
		By selectform = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[2]/div[2]");
		driver.findElement(selectform).click();

	} catch (InterruptedException ex) {
		Logger.getLogger(NewDocument_Menu_Items.class.getName()).log(Level.SEVERE, null, ex);
	}
}

public void select_ER_Triage() {

	try {

		Thread.sleep(4000);
		// Click on Action
		By Action = By.xpath("//div[text()='Actions ']");
		driver.findElement(Action).click();

		// Select New Document
		By newDocument = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-patient-view/app-lead-actions-popover/div/div/div[3]/div");
		driver.findElement(newDocument).click();

		Thread.sleep(3000);

		// Search for Form
		By searchFormText = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[1]/input");
		driver.findElement(searchFormText).sendKeys("Triage" + Keys.ENTER);

		// Select The Form
		By selectform = By.xpath(
				"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[2]/div[2]/div[2]");
		driver.findElement(selectform).click();

	} catch (InterruptedException ex) {
		Logger.getLogger(NewDocument_Menu_Items.class.getName()).log(Level.SEVERE, null, ex);
	}
}
}
