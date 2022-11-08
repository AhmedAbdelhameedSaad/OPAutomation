package opd_order_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import testBase.Page_Base;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Order_Actions extends Page_Base  {

	public Order_Actions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void approve_order() {

		try {

			Thread.sleep(8000);
			// Approve Order
			By Tasks = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[1]/div/img");
			driver.findElement(Tasks).click();

			Thread.sleep(3000);

			By select_patient = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/div/div/div[2]/div/div/div[1]/div[2]/div[2]");
			driver.findElement(select_patient).click();

			Thread.sleep(1000);

			By Approve_Order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[1]/div/div/div[3]/div[2]/button[1]");
			driver.findElement(Approve_Order).click();

			By Remarks = By.xpath("//*[@id=\"REMARKS#0#REMARKS\"]/div/div/app-longtext/div/div[2]/textarea");
			driver.findElement(Remarks).sendKeys("Test");

			Thread.sleep(1000);

			By submit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[2]/div/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(submit).click();

			Thread.sleep(3000);

			By Close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[1]/div/div/div[1]/div/div[2]/div/img");
			driver.findElement(Close_icon).click();

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");

			Thread.sleep(4000);

		} catch (InterruptedException ex) {
			Logger.getLogger(Order_Actions.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void assign_and_approve_order() {

		try {

			Thread.sleep(10000);
			// Approve Order
			By Tasks = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[1]/div/img");
			driver.findElement(Tasks).click();

			Thread.sleep(3000);

			By checkbox_Me = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[3]/div[2]/span/input");
			driver.findElement(checkbox_Me).click();

			By checkbox_Me_Team_Members = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[3]/div[3]/span/input");
			driver.findElement(checkbox_Me_Team_Members).click();

//			By sort_list = By.xpath(
//					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/div/div/div[1]/div[5]/svg");
//			driver.findElement(sort_list).click();

			Thread.sleep(3000);

			By select_patient = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/div/div/div[2]/div/div/div[1]/div[2]/div[2]");
			driver.findElement(select_patient).click();

			Thread.sleep(1000);

			By Assign_to_me = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[1]/div/div/div[3]/div[2]/button");
			driver.findElement(Assign_to_me).click();
			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[1]/div/div/div[1]/div/div[2]/div/img");
			driver.findElement(close_icon).click();
			driver.findElement(select_patient).click();

			By Approve_Order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[1]/div/div/div[3]/div[2]/button[1]");
			driver.findElement(Approve_Order).click();

			By Remarks = By.xpath("//*[@id=\"REMARKS#0#REMARKS\"]/div/div/app-longtext/div/div[2]/textarea");
			driver.findElement(Remarks).sendKeys("Test");

			Thread.sleep(1000);

			By submit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[2]/div/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(submit).click();

			Thread.sleep(3000);

			By Close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[1]/div/div/div[1]/div/div[2]/div/img");
			driver.findElement(Close_icon).click();

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");
		} catch (InterruptedException ex) {
			Logger.getLogger(Order_Actions.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void reject_order()
	{
		try {

			Thread.sleep(8000);
			// Approve Order
			By Tasks = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[1]/div/img");
			driver.findElement(Tasks).click();

			Thread.sleep(3000);
			
			By checkbox_Unassigned = By.xpath("/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[3]/div[4]/span/input");
			driver.findElement(checkbox_Unassigned).click();

			By select_patient = By.xpath("/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/div/div/div[2]/div/div/div[1]/div[2]/div[2]");
			driver.findElement(select_patient).click();

			Thread.sleep(2000);

			By Reject_Order = By.xpath("/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[1]/div/div/div[3]/div[2]/button[2]");
			driver.findElement(Reject_Order).click();

			By Remarks = By.xpath("//*[@id=\"REMARKS#0#REMARKS\"]/div/div/app-longtext/div/div[2]/textarea");
			driver.findElement(Remarks).sendKeys("Test");

			Thread.sleep(2000);

			By Next_Button = By.xpath("/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[2]/div/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[2]");
			driver.findElement(Next_Button).click();

			Thread.sleep(3000);
			
			By submit = By.xpath("/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[2]/div/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(submit).click();

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");
		} catch (InterruptedException ex) {
			Logger.getLogger(Order_Actions.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}