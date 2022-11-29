package opd_rad_technician_orders;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testBase.Page_Base;

public class Select_Form_Rad extends Page_Base {

	public Select_Form_Rad(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void select_form() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
		String homePage = it.next();
		String systemEM = it.next();

		driver.switchTo().window(systemEM);

		driver.close();

		driver.switchTo().window(homePage);

		driver.get("http://10.209.1.5:7777/HIS/eCommon/jsp/eHIS.jsp");

		driver.switchTo().frame(1);
		driver.switchTo().frame("menuFr");

		By Dispense = By.id("sd1");
		driver.findElement(Dispense).click();

	}
}