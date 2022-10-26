package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Login.Login_EM;
import Login.Select_Form_EM;

public class IP_TC_007 {
	WebDriver driver;

	@BeforeTest
	public void setup() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();
	}

	@Test
	public void CMO_navigate_to_login_EM() {

		Login_EM login = new Login_EM("CMOOPD02","egy123");
		login.login(driver);

		Select_Form_EM form = new Select_Form_EM();
		form.select_form(driver);

	}

	@AfterTest
	public void close_browser() {
//		driver.close();
	}

}
