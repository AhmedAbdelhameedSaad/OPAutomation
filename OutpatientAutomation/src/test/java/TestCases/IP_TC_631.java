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
import NUR_Save_as_draft_and_Submit_Order.*;
import Utilities.read_excel_data_HP;

public class IP_TC_631 {

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

	@Test(dataProvider = "test_data")
	public void navigate_to_Nurse_Submit_after_save_as_draft_Order(String Patient_ID) {

		NUR_Login_HP Login = new NUR_Login_HP();
		Login.login_Edge(driver);

		SelectPatientIP select_patient = new SelectPatientIP();
		select_patient.selectpatientIP_Edge(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Save_as_draft_Order save = new Save_as_draft_Order();
		save.Physicians_order_Edge(driver);

		Submit_after_save_as_draft submit = new Submit_after_save_as_draft();
		submit.select_form(driver);

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
