package testCases;

import OPD_Change_Password.*;
import opd_authentication.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IP_TC_707_742 {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();
	}

	@Test
	public void navigate_to_Nurse_Change_Password() {

		Authentication Login1 = new Authentication("","");
		Login1.login_Edge(driver);

		Change_Password Change = new Change_Password();
		Change.Change_Edge(driver);

		Logout_HP Logout = new Logout_HP();
		Logout.logout_Edge(driver);

		Login2_HP Login2 = new Login2_HP();
		Login2.login_Edge(driver);

		Rechange_Password rechange = new Rechange_Password();
		rechange.Change_Edge(driver);

	}

	@AfterTest
	public void close() {
		driver.close();
	}
}
