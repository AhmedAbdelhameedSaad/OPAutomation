package testCases;

import Utilities.read_excel_data_HP;
import opd_authentication.Authentication;
import opd_new_documents_forms.DOC_SelectPatientOP;
import opd_new_documents_forms.SelectForm_OP_Consultation;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IP_TC_001 {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver2.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "test_data")
	public void navigate_to_OP_consultation_form(String Patient_ID) {

		Authentication Login = new Authentication("DOCOPD01","egy123");
        Login.login_Edge(driver);

		SelectPatientOP select_patient = new SelectPatientOP();
		select_patient.selectpatientOP(driver, Patient_ID);

		SelectForm_OP_Consultation Form = new SelectForm_OP_Consultation();
		Form.select_form(driver);

		SelectForm_OP_Consultation form = new SelectForm_OP_Consultation();
		form.select_form(driver);
		
	

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
