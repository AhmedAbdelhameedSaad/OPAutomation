package testCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import OP_Consultation_Sections.*;

import Utilities.read_excel_data_HP;
import opd_new_documents_forms.DOC_SelectPatientOP;

public class IP_TC_788 {

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
	public void navigate_to_Doctor_Place_Order(String Patient_ID) {

		//DOC_Login_HP Login = new DOC_Login_HP();
	//	Login.login_Edge(driver);

		SelectPatientOP select_patient = new SelectPatientOP();
		select_patient.selectpatientOP(driver, Patient_ID);

		
		Place_Lab_Order order = new Place_Lab_Order();
		order.consultaion_place_panel_order(driver);
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
