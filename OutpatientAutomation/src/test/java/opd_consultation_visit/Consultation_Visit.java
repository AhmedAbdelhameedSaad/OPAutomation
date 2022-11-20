package opd_consultation_visit;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import testBase.Page_Base;

public class Consultation_Visit extends Page_Base {
	public Consultation_Visit(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void create(String patient_id, String clinic_name, String doctor_name) {

		try {
 
			Thread.sleep(4000);
			// ٍsearch for patient
			By search_Text = By.xpath( 
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div/input");
			driver.findElement(search_Text).sendKeys(patient_id + Keys.ENTER);

			Thread.sleep(2000); 

			// Select patient
			By Select_patient = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]");
			driver.findElement(Select_patient).click();

			Thread.sleep(2000);

			// Choose a lost
			By Choose_a_lost = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div[2]/div/div[2]/div");
			driver.findElement(Choose_a_lost).click();

			Thread.sleep(2000);

			// ٍChoose Clinic
			By search_Text_Clinic = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[2]/div/input");
			driver.findElement(search_Text_Clinic).sendKeys(clinic_name);

			// Select Clinic
			By Select_Clinic = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div/p");
			driver.findElement(Select_Clinic).click();

			Thread.sleep(2000);

			// ٍChoose practitioner
			By search_Text_practitioner = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-choose-practitioner/div/div[2]/div/input");
			driver.findElement(search_Text_practitioner).sendKeys(doctor_name);

			Thread.sleep(2000);

			// Select practitioner
			By Select_practitioner = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-choose-practitioner/div/div[3]/div/div/div/div[1]");
			driver.findElement(Select_practitioner).click();

			Thread.sleep(2000);

			// Select a slot time
			By Select_time = By.xpath("//*[@id=\"slotcontainer\"]/div/div/div[4]");
			driver.findElement(Select_time).click(); 
			

			Thread.sleep(2000);
			
			By newVisit_checkbox = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-schedule-appointment/div/div[2]/app-visittype/div/div/div[1]/input");
			driver.findElement(newVisit_checkbox).click();

			By click_Continue = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button");
			driver.findElement(click_Continue).click();
			
			Thread.sleep(2000);

			By click_Create_Visit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button");
			driver.findElement(click_Create_Visit).click();
			
			Thread.sleep(2000);
			By click_Done = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button[3]");
			driver.findElement(click_Done).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Consultation_Visit.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void create_dialysis_visit(String patient_id, String clinic_name, String doctor_name) {

		try {

			Thread.sleep(4000);
			// ٍsearch for patient
			By search_Text = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div/input");
			driver.findElement(search_Text).sendKeys(patient_id + Keys.ENTER);

			Thread.sleep(2000);

			// Select patient
			By Select_patient = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]");
			driver.findElement(Select_patient).click();

			Thread.sleep(2000);

			// Choose a lost
			By Choose_a_lost = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div[2]/div/div[2]/div");
			driver.findElement(Choose_a_lost).click();

			Thread.sleep(2000);

			// ٍChoose Clinic
			By search_Text_Clinic = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[2]/div/input");
			driver.findElement(search_Text_Clinic).sendKeys(clinic_name);

			// Select Clinic
			By Select_Clinic = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div/p");
			driver.findElement(Select_Clinic).click();

			Thread.sleep(2000);

			// ٍChoose practitioner
			By search_Text_practitioner = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-choose-practitioner/div/div[2]/div/input");
			driver.findElement(search_Text_practitioner).sendKeys(doctor_name);

			Thread.sleep(2000);

			// Select practitioner
			By Select_practitioner = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-choose-practitioner/div/div[3]/div/div/div/div[1]");
			driver.findElement(Select_practitioner).click();

			Thread.sleep(2000);

			// Select a slot time
			By Select_time = By.xpath("//*[@id=\"slotcontainer\"]/div/div/div[1]");
			driver.findElement(Select_time).click();

			Thread.sleep(2000);
			
			By select_doc = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-schedule-appointment/div/div[2]/div[1]/div/input");
			driver.findElement(select_doc).sendKeys("Nephrology consultant");
			driver.findElement(select_doc).click();
		
			By select_doc_ddl = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-schedule-appointment/div/div[2]/div[1]/div[2]/div/a[1]");
			driver.findElement(select_doc_ddl).click();
			
			Thread.sleep(2000);	

			By select_visit = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-schedule-appointment/div/div[2]/app-visittype/div/div/div[1]/input");
			driver.findElement(select_visit).click();		
			
			Thread.sleep(2000);	
			By click_Continue = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button");
			driver.findElement(click_Continue).click();
			
			Thread.sleep(2000);

			By click_Create_Visit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button");
			driver.findElement(click_Create_Visit).click();
			
			Thread.sleep(2000);
			By click_Done = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button[2]");
			driver.findElement(click_Done).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Consultation_Visit.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void create_from_clinicalDiary(String clinic_name, String doctor_name)
	{
		try {
			Thread.sleep(3000);
			By select_patient = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div[1]/div");
							
			driver.findElement(select_patient).click();
			
			Thread.sleep(3000);
			By click_visit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[2]/div/div/div[2]/div/div[3]/p[2]");
			driver.findElement(click_visit).click();
			
			By Choose_a_lost = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div[2]/div/div[2]/div");
			driver.findElement(Choose_a_lost).click();

			Thread.sleep(2000);

			// ٍChoose Clinic
			By search_Text_Clinic = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[2]/div/input");
			driver.findElement(search_Text_Clinic).sendKeys(clinic_name);

			// Select Clinic
			By Select_Clinic = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div/p");
			driver.findElement(Select_Clinic).click();

			Thread.sleep(2000);

			// ٍChoose practitioner
			By search_Text_practitioner = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-choose-practitioner/div/div[2]/div/input");
			driver.findElement(search_Text_practitioner).sendKeys(doctor_name);

			Thread.sleep(2000);

			// Select practitioner
			By Select_practitioner = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-choose-practitioner/div/div[3]/div/div/div/div[1]");
			driver.findElement(Select_practitioner).click();

			Thread.sleep(2000);

			// Select a slot time
			By Select_time = By.xpath("//*[@id=\"slotcontainer\"]/div/div/div[1]");
			driver.findElement(Select_time).click();

			Thread.sleep(3000);
			By select_service = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-schedule-appointment/div/div[2]/div[1]/div/input");
            driver.findElement(select_service).click();
			
			Thread.sleep(5000);
			By click_Continue = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button");
			driver.findElement(click_Continue).click();
			
			Thread.sleep(3000);

			By click_Create_Visit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button");
			driver.findElement(click_Create_Visit).click();
			
			Thread.sleep(2000);
			By click_Done = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button[3]");
			driver.findElement(click_Done).click();
			
		}catch (InterruptedException ex) {
			Logger.getLogger(Consultation_Visit.class.getName()).log(Level.SEVERE, null, ex);
		}
	}



}
