package DOC_OPD_OPConsultation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Doc_OPConsultation_Diagnosis {

	public void Physicians_consultation_diagnosis_Edge(WebDriver driver) {

		try {
			
			// ICD11 Diagnosis section
			// Need to check scroll amount ?
			
			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");
			By click_ICD11_Diagnosis = By.xpath("//*[@id=\"OPCONSULT#0#PASTMEDICAL\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(click_ICD11_Diagnosis).click();

			By searchtext_Diagnosis = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(searchtext_Diagnosis).sendKeys("MD12 Cough" + Keys.ENTER);
			
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

			Select Onset_Since_dropdown = new Select(
					driver.findElement(By.xpath("//*[@id=\"MD12#0#DIAGONSET\"]/div/div/app-timeperiod/div/select")));
			Onset_Since_dropdown.selectByVisibleText("Days");

			Select enter_Onset_Since = new Select(
					driver.findElement(By.xpath("//*[@id=\"MD12#0#DIAGONSET\"]/div/div/app-timeperiod/div/input")));
			enter_Onset_Since.selectByVisibleText("5");
			
			By Submit_icon = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[2]/div/div/div/img[1]");
			driver.findElement(Submit_icon).click();
			
			By Close_Button = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button).click();

			Thread.sleep(3000);

			By Submit_Button = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(Submit_Button).click();
			
			Thread.sleep(7000);

		} catch (InterruptedException ex) {
			Logger.getLogger(Doc_OPConsultation_Diagnosis.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}