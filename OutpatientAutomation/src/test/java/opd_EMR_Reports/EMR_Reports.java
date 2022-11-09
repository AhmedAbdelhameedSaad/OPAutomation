package opd_EMR_Reports;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import testBase.Page_Base;

public class EMR_Reports extends Page_Base {
	public EMR_Reports(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void select_clicnical_profile() {

		try {

			Thread.sleep(5000);
			By Clinical_Profile = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[2]/app-widget/div/div[1]/app-clinical-profile/div[1]/div[1]/img[2]");
			driver.findElement(Clinical_Profile).click();

			Thread.sleep(3000);

			// patients Vitals and Allergies

		/*	By Allergies = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[2]/app-widget/div/div[1]/app-clinical-profile/div[1]/div[2]/div[1]/p");
			driver.findElement(Allergies).click();

			Thread.sleep(3000);

			By back_arrow = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[2]/app-widget/div/div[2]/app-clinical-profile-items/div/div[1]/span/img");
			driver.findElement(back_arrow).click();

			By Diagnosis = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[2]/app-widget/div/div[1]/app-clinical-profile/div[1]/div[2]/div[2]/p");
			driver.findElement(Diagnosis).click();

			Thread.sleep(3000);*/

			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[2]/app-widget/div/div[1]/app-clinical-profile/div[1]/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(EMR_Reports.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void select_growth_chart() {

		try {

			Thread.sleep(6000);

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,300)");

			Thread.sleep(3000);

			By chart_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[7]/app-widget/div/div[1]/app-special-chart/div/div[1]/img[2]");
			driver.findElement(chart_icon).click();

			Thread.sleep(3000);

			// close icon

			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[7]/app-widget/div/div[1]/app-special-chart/div/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(EMR_Reports.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void select_lab_reports() {

		try {

			Thread.sleep(6000);

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,600)");

			Thread.sleep(3000);

			// open lab report icon

			By labreport_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[9]/app-widget/div/div[1]/app-reports/div/div[1]/img[2]");
			driver.findElement(labreport_icon).click();

			Thread.sleep(3000);

			// close icon

			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[9]/app-widget/div/div[1]/app-reports/div/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(EMR_Reports.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void select_medications_report() {

		try {

			Thread.sleep(6000);
			// open icon

			By Click_medications = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[4]/app-widget/div/div[1]/app-medication/div[1]/div[1]/img[2]");
			driver.findElement(Click_medications).click();

			Thread.sleep(6000);

			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[4]/app-widget/div/div[1]/app-medication/div[1]/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(EMR_Reports.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void select_observations_report() {

		try {

			Thread.sleep(6000);

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,600)");

			Thread.sleep(3000);

			// open observation icon

			By observation_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[10]/app-widget/div/div[1]/app-observation/div[1]/div[1]/img[2]");
			driver.findElement(observation_icon).click();

			Thread.sleep(3000);

			// close icon

			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[10]/app-widget/div/div[1]/app-observation/div[1]/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(EMR_Reports.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void select_rad_reports() {

		try {

			Thread.sleep(6000);

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,600)");

			Thread.sleep(3000);

			// open Radiology report icon

			By radreport_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[8]/app-widget/div/div[1]/app-reports/div/div[1]/img[2]");
			driver.findElement(radreport_icon).click();

			Thread.sleep(3000);

			// close icon

			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[8]/app-widget/div/div[1]/app-reports/div/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(EMR_Reports.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void recent_order() {

		try {

			Thread.sleep(6000);

			// open icon

			By Recent_Order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[3]/app-widget/div/div[1]/app-order/div[1]/div[1]/img[2]");
			driver.findElement(Recent_Order).click();

			Thread.sleep(5000);

			/*
			 * By click_order = By.xpath(
			 * "/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[3]/app-widget/div/div[1]/app-order/div[1]/div[2]/div[2]/div[2]/div[2]/div/p[1]"
			 * ); driver.findElement(click_order).click();
			 * 
			 * Thread.sleep(3000);
			 */

			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[3]/app-widget/div/div[1]/app-order/div[1]/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(EMR_Reports.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void uploaded_documents() {

		try {

			Thread.sleep(6000);

			// open icon

			By Uploaded_documents = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[6]/app-widget/div/div[1]/app-uploaded-docs/div/div[1]/div[2]");
			driver.findElement(Uploaded_documents).click();

			Thread.sleep(4000);

			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[6]/app-widget/div/div[1]/app-uploaded-docs/div/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(EMR_Reports.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void view_reports() {

		try {

			Thread.sleep(5000);

			// Open Reports
			By Reports = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[1]/app-widget/div/div[1]/app-reports/div[1]/div[1]/img[2]");
			driver.findElement(Reports).click();

			Thread.sleep(2000);

			// click report

			// By click_report = By.xpath(
			// "/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[1]/app-widget/div/div[1]/app-reports/div[1]/div[2]/div[1]/div[1]/div[2]/div");
			// driver.findElement(click_report).click();

			// close button
			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[1]/app-widget/div/div[1]/app-reports/div[1]/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(EMR_Reports.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void visit_summary() {

		try {

			Thread.sleep(6000);

			By orders_summary = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[5]/app-widget/div/div[1]/app-visit/div[1]/div[1]/img[2]");
			driver.findElement(orders_summary).click();

			Thread.sleep(3000);

			// By last_visit = By.xpath(
			// "/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[5]/app-widget/div/div[1]/app-visit/div[1]/div[2]/div[2]/div[2]");
			// driver.findElement(last_visit).click();
			// Thread.sleep(3000);

			// close icon

			By Close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[5]/app-widget/div/div[1]/app-visit/div[1]/app-widget-header/div/img");
			driver.findElement(Close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(EMR_Reports.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
