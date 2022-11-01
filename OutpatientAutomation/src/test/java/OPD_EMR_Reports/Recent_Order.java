package OPD_EMR_Reports;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Recent_Order {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(6000);
			
            // open icon
			
			By Recent_Order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[3]/app-widget/div/div[1]/app-order/div[1]/div[1]/img[2]");
			driver.findElement(Recent_Order).click();

		
			Thread.sleep(5000);

			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[3]/app-widget/div/div[1]/app-order/div[1]/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Recent_Order.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
