package testCases;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import OP_Consultation_Sections.Place_Lab_Order;
import OP_Consultation_Sections.Place_Rad_Order;

import Utilities.*;
import opd_lab_technician_orders.*;
import opd_new_documents_forms.DOC_SelectPatientOP;
import opd_rad_technician_orders.*;

public class GroupL {
	WebDriver driver;

	// IP_TC_693

	@Test(dataProvider = "test_data", priority = 1)
	public void navigate_to_Place_Lab_Order(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

	//	DOC_Login_HP Login = new DOC_Login_HP();
		//Login.login_Edge(driver);

		SelectPatientOP select_patient = new SelectPatientOP();
		select_patient.selectpatientOP(driver, Patient_ID);

		
		Place_Lab_Order order = new Place_Lab_Order();
		order.consultaion_place_panel_order(driver);

//		driver.quit();
	}

	// IP_TC_520

	@Test(dataProvider = "test_data", priority = 2)
	public void navigate_to_Register_Lab_Order(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_Lab login = new Login_EM_Lab();
		login.login(driver);

		Select_Form_Lab form = new Select_Form_Lab();
		form.select_form(driver);

		Register_Lab_Order Order = new Register_Lab_Order();
		Order.register(driver, Patient_ID);

		driver.quit();
	}

	// IP_TC_694

	@Test(dataProvider = "test_data", priority = 3)
	public void navigate_to_Place_Rad_Order(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		//DOC_Login_HP Login = new DOC_Login_HP();
	//	Login.login_Edge(driver);

		SelectPatientOP select_patient = new SelectPatientOP();
		select_patient.selectpatientOP(driver, Patient_ID);

		

		Place_Rad_Order order = new Place_Rad_Order();
		order.consultaion_place_panel_order(driver);

//		driver.quit();
	}

	// IP_TC_522

	@Test(dataProvider = "test_data", priority = 3)
	public void navigate_to_Register_Rad_Order(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_Rad login = new Login_EM_Rad();
		login.login(driver);

		Select_Form_Rad form = new Select_Form_Rad();
		form.select_form(driver);

		Register_Rad_Order Order = new Register_Rad_Order();
		Order.register(driver, Patient_ID);

//		driver.quit();
	}

	@AfterTest
	public void close_browser() {
//		driver.close();
	}

	@DataProvider
	public String[][] test_data() throws InvalidFormatException, IOException {

		read_excel_data_HP obj = new read_excel_data_HP();
		return obj.read_sheet();
	}

}
