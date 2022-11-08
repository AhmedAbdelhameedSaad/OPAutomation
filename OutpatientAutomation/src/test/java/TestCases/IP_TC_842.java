package testCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PCY_Dispense_Medication.*;
import PCY_Pages.*;
import Utilities.read_excel_data_HP;

public class IP_TC_842 {
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

	@Test(dataProvider = "test_data")
	public void navigate_to_Pharmacist_Dispense_Medication_Verification_Step(String Patient_ID) {

		Login_EM_IPD_Pharmacist login = new Login_EM_IPD_Pharmacist();
		login.login(driver);

		Verification dispense = new Verification();
		dispense.verification(driver, Patient_ID);

	}

	@AfterTest
	public void close_browser() {
		driver.close();
	}

	@DataProvider
	public String[][] test_data() throws InvalidFormatException, IOException {

		read_excel_data_HP obj = new read_excel_data_HP();
		return obj.read_sheet();
	}

}
