package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import NUR_Pages.*;
import opd_authentication.Authentication;
import opd_patient.*;

public class IP_TC_546 {

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
	public void navigate_to_login() {

		Authentication Login = new Authentication("NURIPD01","egy123");
		Login.login_Edge(driver);

		NUR_View_Patient_list li = new NUR_View_Patient_list();
		li.list(driver);
	}

	@AfterTest
	public void close() {
//		driver.close();
	}
}
