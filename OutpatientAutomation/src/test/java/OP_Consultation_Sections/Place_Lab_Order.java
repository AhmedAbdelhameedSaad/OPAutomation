package OP_Consultation_Sections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Place_Lab_Order {

	public void Physicians_order_Edge(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		try {
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

			By Close_Button1 = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button1).click();

			Thread.sleep(4000);

			By Submit_Button = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(Submit_Button).click();

			Thread.sleep(5000);

		} catch (InterruptedException ex) {
			Logger.getLogger(Place_Lab_Order.class.getName()).log(Level.SEVERE, null, ex); 
		}
	}
}