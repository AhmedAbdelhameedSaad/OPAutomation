package OPD_EMR_Reports;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Rad_Reports {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(6000);

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,600)");

			Thread.sleep(3000);
			
			// open Rad report icon     
			
			By radreport_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[8]/app-widget/div/div[1]/app-reports/div/div[1]/img[2]");
			driver.findElement(radreport_icon).click();

			Thread.sleep(3000);
			
			// close icon
			
			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[8]/app-widget/div/div[1]/app-reports/div/app-widget-header/div/img");
			driver.findElement(close_icon).click();
			
			

		} catch (InterruptedException ex) {
			Logger.getLogger(Rad_Reports.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
