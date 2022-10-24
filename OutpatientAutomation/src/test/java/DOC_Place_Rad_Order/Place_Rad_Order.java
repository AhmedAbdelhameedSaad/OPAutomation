package DOC_Place_Rad_Order;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Place_Rad_Order {

	public void Physicians_order_Edge(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		try {

			Thread.sleep(3000);
			// Fill in the form
			By click_ICD11_Diagnosis = By
					.xpath("//*[@id=\"IPORDERS#0#PASTMEDICAL\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(click_ICD11_Diagnosis).click();

			By select_Diagnosis = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div[1]/div");
			driver.findElement(select_Diagnosis).click();

			Thread.sleep(2000);

			By select_Diagnosis_Classification = By
					.xpath("//*[@id=\"1E70#0#SYSDIAGCAT\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Diagnosis_Classification).click();

			By select_Nature = By
					.xpath("//*[@id=\"1E70#0#DI00001\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Nature).click();

			By select_Accuracy = By
					.xpath("//*[@id=\"1E70#0#DIAGACCU\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Accuracy).click();

			Select Onset_Since_dropdown = new Select(
					driver.findElement(By.xpath("//*[@id=\"1E70#0#DIAGONSET\"]/div/div/app-timeperiod/div/select")));
			Onset_Since_dropdown.selectByVisibleText("Days");

			By enter_Onset_Since = By.xpath("//*[@id=\"1E70#0#DIAGONSET\"]/div/div/app-timeperiod/div/input");
			driver.findElement(enter_Onset_Since).sendKeys("5");

			Thread.sleep(3000);

			// Place Rad_Order
			By Rad_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[3]/div/span[2]");
			driver.findElement(Rad_order).click();

			Thread.sleep(1000);

			By search_Rad_Order = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Rad_Order).sendKeys("Abdominal ultrasound NOS" + Keys.ENTER);

			Thread.sleep(1000);

			By Select_Rad_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div[1]/div");
			driver.findElement(Select_Rad_order).click();

			Thread.sleep(1000);

			driver.findElement(search_Rad_Order).clear();

			Thread.sleep(1000);

			driver.findElement(search_Rad_Order).sendKeys("Knee ultrasound" + Keys.ENTER);

			Thread.sleep(1000);

			driver.findElement(Select_Rad_order).click();

			Thread.sleep(2000);

			By Close_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button).click();

			Thread.sleep(4000);

			By Submit_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(Submit_Button).click();

			Thread.sleep(5000);

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");
		} catch (InterruptedException ex) {
			Logger.getLogger(Place_Rad_Order.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}