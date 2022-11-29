package opd_new_documents_forms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import testBase.Page_Base;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OPConsultation_Form extends Page_Base {

	public OPConsultation_Form(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void consultation_diagnosis() {

		try {
			
			// ICD11 Diagnosis section
			// Need to check scroll amount ?
			
			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");
			By click_ICD11_Diagnosis = By.xpath("//*[@id=\"OPCONSULT#0#PASTMEDICAL\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(click_ICD11_Diagnosis).click();   

			By searchtext_Diagnosis = By.xpath("//*[@id=\"icd11search\"]");
			driver.findElement(searchtext_Diagnosis).sendKeys("Cough" + Keys.ENTER);
			
			Thread.sleep(2000);
			By select_element = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[1]/div/div[1]/p");
			driver.findElement(select_element).click();
			
			Thread.sleep(2000);
			By select_Diagnosis = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div/div");
			driver.findElement(select_Diagnosis).click();
			
			By select_Diagnosis_Classification = By
					.xpath("//*[@id=\"MD12#0#SYSDIAGCAT\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Diagnosis_Classification).click();

			By select_Nature = By
					.xpath("//*[@id=\"MD12#0#DI00001\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Nature).click();

			By select_Accuracy = By
					.xpath("//*[@id=\"MD12#0#DIAGACCU\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Accuracy).click();
			
			/*Select Onset_Since_dropdown = new Select(
			driver.findElement(By.xpath("//*[@id=\"MD12#0#DIAGONSET\"]/div/div/app-timeperiod/div/select")));
			Onset_Since_dropdown.selectByVisibleText("Days");

			Thread.sleep(2000);	
			Select enter_Onset_Since = new Select(
			driver.findElement(By.xpath("//*[@id=\\\"MD12#0#DIAGONSET\\\"]/div/div/app-timeperiod/div/input")));
			enter_Onset_Since.selectByVisibleText("5");*/
			
			Thread.sleep(2000);
			By Submit_icon = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/div/div/img[1]");
			driver.findElement(Submit_icon).click();
			
			By Close_Button = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button).click();

			Thread.sleep(3000);


		} catch (InterruptedException ex) {
			Logger.getLogger(OPConsultation_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

				
	public void consultation_internal_external_referral() {

		try {
			
			Thread.sleep(3000);
			// Internal / External referral
			
			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");
			
	/*		By select_Internal_External_referral = By.xpath("//*[@id=\"OPCONSULT#0#EXTFER\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(select_Internal_External_referral).click(); */
			
			Thread.sleep(3000);
			By search_Internal_External_referral_Text = By.xpath("//*[@id=\"cns-ref-search\"]");
			driver.findElement(search_Internal_External_referral_Text).sendKeys("General Surgery");

			Thread.sleep(2000);

			By select_Referral = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-referral/div/div[1]/div[2]/div[2]/div");
			driver.findElement(select_Referral).click();

			Thread.sleep(3000);

			By enter_Reason_for_referral = By.xpath("//*[@id=\"EXTREF#0#REASON\"]/div/div/app-longtext/div/div[2]/textarea");
			driver.findElement(enter_Reason_for_referral).sendKeys("For Test");

			By select_Referral_Priority = By.xpath("//*[@id=\"EXTREF#0#REASONR\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Referral_Priority).click();
			
			By Transportation = By.xpath("//*[@id=\"EXTREF#0#TRANSP\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(Transportation).click();

			By General_condition = By.xpath("//*[@id=\"EXTREF#0#GENCONDREF\"]/div/div/app-radio/div/div/div[2]/div[1]/div/input");
			driver.findElement(General_condition).click();
			
			By Level_of_consciousness  = By.xpath("//*[@id=\"EXTREF#0#CONLEVREF\"]/div/div/app-radio/div/div/div[2]/div[1]/div/input");
			driver.findElement(Level_of_consciousness).click();

			By Notes = By.xpath("//*[@id=\"EXTREF#0#REFNOTESNEW\"]/div/div/app-text/div/div[2]/input");
			driver.findElement(Notes).sendKeys("Test");
			
			Thread.sleep(2000);
			
			By Search_button = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-referral/div/div[2]/div/app-external-referral-facility/div/div/div[1]/div/span");
			driver.findElement(Search_button).click();
			
			TimeUnit.MINUTES.sleep(1);
			
			
			JavascriptExecutor java1 = (JavascriptExecutor) driver;
			java1.executeScript("scroll(0,250)");
			
			By Facility_check = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-referral/div/div[2]/div/app-external-referral-facility/div/div/div[1]/div[2]/div/div[23]/div[1]");
			driver.findElement(Facility_check).click();

			
			JavascriptExecutor java2 = (JavascriptExecutor) driver;
			java2.executeScript("scroll(0,250)");
			
			By Availible_date = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-referral/div/div[2]/div/app-external-referral-facility/div/div[2]/div[2]/div/div[14]/div[3]");
			driver.findElement(Availible_date).click();

			//check scroll amount ?
			
			JavascriptExecutor java3 = (JavascriptExecutor) driver;
			java3.executeScript("scroll(0,-250)");
			
			By Time_availible = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-referral/div/div[2]/div/app-external-referral-facility/div/div[2]/div[2]/div[2]/div/div[2]/div[3]/div[1]");
			driver.findElement(Time_availible).click();
			
			Thread.sleep(2000);
			
			By next_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
			driver.findElement(next_btn).click();
			
			

		} catch (InterruptedException ex) {
			Logger.getLogger(OPConsultation_Form.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
	
	public void referral_feedback_form() throws InterruptedException {
		
		Thread.sleep(3000); 
		
		By no_radiobtn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/app-section/div/div/app-segment/div/div/div[2]/div[2]/div/input");
		driver.findElement(no_radiobtn).click();

		
		By next_Button = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next_Button).click();
		
	}
		

	public void consultaion_prescribe_medications() {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		try {

			// Need to check scroll amount ?
			//	JavascriptExecutor java1 = (JavascriptExecutor) driver;
			//	java1.executeScript("scroll(0,250)");
			// Prescription section

			By select_Prescription_section = By.xpath("//*[@id=\"OPCONSULT#0#PRESCRIPTION\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(select_Prescription_section).click();

			Thread.sleep(1000);

			By search_Prescription_Order = By.xpath("//*[@id=\"cns-pres-search\"]");
			driver.findElement(search_Prescription_Order).sendKeys("PARACETAMOL 500MG TABLET ( PARACETAMOL )" + Keys.ENTER);

			Thread.sleep(3000);

			By Select_Prescription_order = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-prescription/div/div/div[1]/div[2]/div[3]/div/div");
			driver.findElement(Select_Prescription_order).click();

			Thread.sleep(4000);

			// Fill Prescription Order
			By Prescription_Route = By.xpath("//*[@id=\"200-00414#0#PRESROUTE\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(Prescription_Route).click();

			Thread.sleep(3000);

			By select_Frequency = By.xpath("//*[@id=\"200-00414#0#PRESFRQ\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Frequency).click();

			By select_Duration = By.xpath("//*[@id=\"200-00414#0#\"]/div/div/app-composite-field/div/div[2]/span[4]/input");
			driver.findElement(select_Duration).click();

			Thread.sleep(2000);
			
			By Submit_icon1 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-prescription/div/div/div[2]/div/div/div/img[1]");
			driver.findElement(Submit_icon1).click();

			By Close_Button1 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button1).click();

			Thread.sleep(4000);
			
		} catch (InterruptedException ex) {
			Logger.getLogger(OPConsultation_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

    public void consultaion_place_lab_order() {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 

		try {
				
			// Place Lab Order
			
			By Investigations = By.xpath("//*[@id=\"OPCONSULT#0#INVESTIGATIONS\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(Investigations).click();
			
			Thread.sleep(3000);
			By search_Lab_order = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Lab_order).sendKeys("cbc" + Keys.ENTER);
			
			Thread.sleep(3000);
			By Select_Lab_order = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div/div");
			driver.findElement(Select_Lab_order).click();
			
			Thread.sleep(3000);
			By Submit_icon1 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/div[1]/div/img[1]");
			driver.findElement(Submit_icon1).click();

			By Close_Button1 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button1).click();

			Thread.sleep(5000);
			JavascriptExecutor java1 = (JavascriptExecutor) driver;
			java1.executeScript("scroll(0,250)");

		} catch (InterruptedException ex) {
			Logger.getLogger(OPConsultation_Form.class.getName()).log(Level.SEVERE, null, ex); 
		}
	}
 
	public void consultaion_place_rad_order() {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		try {

			// Place Rad_Order
			
			Thread.sleep(1000);
			By Investigations = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div/div/div/div/div/div[9]/app-section/div/div/app-directive-linked/div/div[1]");
			driver.findElement(Investigations).click();
			
			Thread.sleep(2000);
			Select Investigations_drobdown = new Select(
			driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/select")));
			Investigations_drobdown.selectByVisibleText("Radiology Orders");

			Thread.sleep(2000);
			By search_Rad_Order = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Rad_Order).sendKeys("Chest x-ray. One view" + Keys.ENTER);

			Thread.sleep(1000);

			By Select_Rad_order = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div[1]/div");
			driver.findElement(Select_Rad_order).click();

			Thread.sleep(1000);

			By Submit_icon1 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div[2]/div[1]/div/img[1]");
			driver.findElement(Submit_icon1).click();

			By Close_Button1 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button1).click();

			Thread.sleep(4000);
			JavascriptExecutor java1 = (JavascriptExecutor) driver;
			java1.executeScript("scroll(0,250)");
			
		} catch (InterruptedException ex) {
			Logger.getLogger(OPConsultation_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void consultaion_place_panel_order() {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		try {
			// Need to check scroll amount ?

			//	JavascriptExecutor java1 = (JavascriptExecutor) driver;
			//	java1.executeScript("scroll(0,250)");

			// Place Lab Order

			By Investigations = By.xpath("//*[@id=\"OPCONSULT#0#INVESTIGATIONS\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(Investigations).click();

			By search_Lab_order = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Lab_order).sendKeys("cbc" + Keys.ENTER);

			By Select_Lab_order = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div/div");
			driver.findElement(Select_Lab_order).click();

			By Submit_icon1 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/div[1]/div[2]/div/img[1]");
			driver.findElement(Submit_icon1).click();

			// Place Rad_Order
			Select Investigations_drobdown = new Select(
					driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/select")));
			Investigations_drobdown.selectByVisibleText("Radiology Orders");

			By search_Rad_Order = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Rad_Order).sendKeys("Chest x-ray. One view" + Keys.ENTER);

			Thread.sleep(1000);

			By Select_Rad_order = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div[1]/div");
			driver.findElement(Select_Rad_order).click();

			Thread.sleep(1000);

			By Submit_icon2 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/div[1]/div/img[1]");
			driver.findElement(Submit_icon2).click();

			// Treatment Orders section

			Select Investigations_drobdown1 = new Select(
					driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/select")));
			Investigations_drobdown.selectByVisibleText("Treatment Orders");

			Thread.sleep(1000);

			By search_Treatment_Order = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Treatment_Order).sendKeys("Full denture upper and lower" + Keys.ENTER);

			Thread.sleep(1000);

			By Select_Treatment_order = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div/div");
			driver.findElement(Select_Treatment_order).click();

			By Submit_icon3 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/div[1]/div/img[1]");
			driver.findElement(Submit_icon3).click();

			// Procedures section
			
			Select Investigations_drobdown2 = new Select(
					driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/select")));
			Investigations_drobdown.selectByVisibleText("Procedures");

			By select_Procedures_order = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div/div[1]");
			driver.findElement(select_Procedures_order).click();

			Thread.sleep(1000);

			By Submit_icon4 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/div[1]/div/img[1]");
			driver.findElement(Submit_icon4).click();
			
			By Close_Button1 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button1).click();
			
			// Prescription section

			By select_Prescription_section = By.xpath("//*[@id=\"OPCONSULT#0#PRESCRIPTION\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(select_Prescription_section).click();

			Thread.sleep(1000);

			By search_Prescription_Order = By.xpath("//*[@id=\"cns-pres-search\"]");
			driver.findElement(search_Prescription_Order).sendKeys("PARACETAMOL 500MG TABLET ( PARACETAMOL )" + Keys.ENTER);

			Thread.sleep(3000);

			By Select_Prescription_order = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-prescription/div/div/div[1]/div[2]/div[3]/div/div");
			driver.findElement(Select_Prescription_order).click();

			Thread.sleep(4000);

			// Fill Prescription Order
			
			By Prescription_Route = By.xpath("//*[@id=\"200-00414#0#PRESROUTE\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(Prescription_Route).click();

			Thread.sleep(3000);

			By select_Frequency = By.xpath("//*[@id=\"200-00414#0#PRESFRQ\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Frequency).click();

			By select_Duration = By.xpath("//*[@id=\"200-00414#0#\"]/div/div/app-composite-field/div/div[2]/span[4]/input");
			driver.findElement(select_Duration).click();

			Thread.sleep(2000);
			
			By Submit_icon5 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-prescription/div/div/div[2]/div/div/div/img[1]");
			driver.findElement(Submit_icon5).click();

			By Close_Button2 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button2).click();

			Thread.sleep(4000);
			
		} catch (InterruptedException ex) {
			Logger.getLogger(OPConsultation_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void submit_consultation_form()
	{
		try {
		Thread.sleep(4000);

		By Submit_Button = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
		driver.findElement(Submit_Button).click();
		
		} catch (InterruptedException ex) {
			Logger.getLogger(OPConsultation_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void save_draft_consultation_form() {
		
		try {
		By Save_as_draft_Button = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[3]");
		driver.findElement(Save_as_draft_Button).click();

	//	JavascriptExecutor java = (JavascriptExecutor) driver;
	//	java.executeScript("scroll(0,250)");

		Thread.sleep(4000);

	} catch (InterruptedException ex) {
		Logger.getLogger(OPConsultation_Form.class.getName()).log(Level.SEVERE, null, ex);
		
	}
}
	
	public void submit_after_save_darft()
	{
		try {

			Thread.sleep(8000);
			// Click on Action
			By Action = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/div/div/div[2]/div/div[2]");
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
			By Submit_Button = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(Submit_Button).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(OPConsultation_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public void verify_submitted_form()

	{
		try {

			Thread.sleep(5000);
			By close_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/div/div[2]/div[1]/div/div/div[2]/img");
			driver.findElement(close_btn).click();

			Thread.sleep(3000);
			
			driver.navigate().refresh();

	
			Thread.sleep(3000);

			By open_form = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[1]/app-widget/div/div[1]/app-reports/div[1]/div[2]/div[1]/div[1]/div[2]/div/p[1]");
			driver.findElement(open_form).click();

			Thread.sleep(5000);

			By close_form = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/app-reports-view-model/div/div[1]/div/div[2]/div[2]/div[2]/img");
			driver.findElement(close_form).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(OPConsultation_Form.class.getName()).log(Level.SEVERE, null, ex);
			
			
		}
	
	}



public void Follow_Up_After_Filling_Diagnosis() {

	try {
		
		// ICD11 Diagnosis section
		

		Thread.sleep(3000); 
		
		//fill the student check up form

		By patient_vitals_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[1]/div/div/div/div/div/div[2]/app-section/div/div/app-directive-linked/div/div[1]");
		driver.findElement(patient_vitals_btn).click();
		
		By next_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next_btn).click();

		// fill Medical history Tab
		Thread.sleep(3000);
		
		
		By next1_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next1_btn).click();
		
		Thread.sleep(2000);
		By next2_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next2_btn).click();
		
		Thread.sleep(2000);
		By next3_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next3_btn).click();
		
		Thread.sleep(2000);
		By next4_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next3_btn).click();
		
		Thread.sleep(2000);
		By next5_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next3_btn).click();

		
		Thread.sleep(2000);
		By searchtext_Diagnosis = By.xpath("//*[@id=\"icd11search\"]");
		driver.findElement(searchtext_Diagnosis).sendKeys("Cough" + Keys.ENTER);
		
		Thread.sleep(2000);
		By select_element = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[1]/div/div[1]/p");
		driver.findElement(select_element).click();
		
		Thread.sleep(2000);
		By select_Diagnosis = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div/div");
		driver.findElement(select_Diagnosis).click();
		
		By select_Diagnosis_Classification = By
				.xpath("//*[@id=\"MD12#0#SYSDIAGCAT\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
		driver.findElement(select_Diagnosis_Classification).click();

		By select_Nature = By
				.xpath("//*[@id=\"MD12#0#DI00001\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
		driver.findElement(select_Nature).click();

		By select_Accuracy = By
				.xpath("//*[@id=\"MD12#0#DIAGACCU\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
		driver.findElement(select_Accuracy).click();
		
		/*Select Onset_Since_dropdown = new Select(
		driver.findElement(By.xpath("//*[@id=\"MD12#0#DIAGONSET\"]/div/div/app-timeperiod/div/select")));
		Onset_Since_dropdown.selectByVisibleText("Days");

		Thread.sleep(2000);	
		Select enter_Onset_Since = new Select(
		driver.findElement(By.xpath("//*[@id=\\\"MD12#0#DIAGONSET\\\"]/div/div/app-timeperiod/div/input")));
		enter_Onset_Since.selectByVisibleText("5");*/
		
		By next7_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next7_btn).click();
		
		Thread.sleep(2000);
		By next8_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next8_btn).click();
		
		Thread.sleep(2000);
		By next9_btn = By
				.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next9_btn).click();
		
		// Fill Follow up section 
		
		By twodays_radiobtn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/app-section/div/div/app-composite-field/div/div[2]/span[2]/input");
		driver.findElement(twodays_radiobtn).click();
		
		Thread.sleep(4000);
		By nineAm_btn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/app-section/div/div/app-composite-field/div/app-appointment-slot/div/div/div[3]/div[2]/span[36]");
		driver.findElement(nineAm_btn).click();
		
		Thread.sleep(2000);
		By confirm_radiobtn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-clinicalform/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/app-section/div/div/app-composite-field/div/app-appointment-slot/div/div[2]/div/div/div/button[2]");
		driver.findElement(confirm_radiobtn).click();
		
		Thread.sleep(2000);
		By next_radiobtn = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[1]");
		driver.findElement(next_radiobtn).click();
		
		


	} catch (InterruptedException ex) {
		Logger.getLogger(OPConsultation_Form.class.getName()).log(Level.SEVERE, null, ex);
	}
}
	

public void preview_form()
{
	try {
	Thread.sleep(4000);

	By close_Button = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
	driver.findElement(close_Button).click();
	
	} catch (InterruptedException ex) {
		Logger.getLogger(OPConsultation_Form.class.getName()).log(Level.SEVERE, null, ex);
	}
}
}





