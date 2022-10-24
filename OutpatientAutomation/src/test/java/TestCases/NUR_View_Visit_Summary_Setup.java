package TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import NUR_Pages.*;
import NUR_View_Visit_Summary.*;
import Utilities.read_excel_data_HP;

public class NUR_View_Visit_Summary_Setup {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		// System Property for Edge Driver
		System.setProperty("webdriver.edge.driver", "D:\\Automation testing tools\\Edgedriver\\msedgedriver.exe");
		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "test_data")
	public void navigate_to_login(String Patient_ID) {

		NUR_Login_HP Login = new NUR_Login_HP();
		Login.login_Edge(driver);

		SelectPatientIP select_patient = new SelectPatientIP();
		select_patient.selectpatientIP_Edge(driver, Patient_ID);

		Visit_Summary view = new Visit_Summary();
		view.select_form(driver);
	}

	@AfterTest
	public void close() {
//		driver.close();
	}

	@DataProvider
	public String[][] test_data() throws InvalidFormatException, IOException {

		read_excel_data_HP obj = new read_excel_data_HP();
		return obj.read_sheet();
	}
}
