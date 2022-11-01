package TestCases;

import Utilities.read_excel_data_HP;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Login.Login_HP;
import OPD_OPConsultation.DOC_SelectPatientOP;
import OPD_OPConsultation.SelectForm_OP_Consultation;


public class TC_OP001_login_valid extends Test_Base {

	
	Login_HP loginobject;


	@Test(dataProvider = "test_data")
	public void  User_Login_ValidCred()
	{

		 loginobject = new Login_HP("CMOOPD02", "egy123");
		 
		 loginobject.login_Edge(driver);

	}
	

	/* @DataProvider
	 public String[][] test_data() throws InvalidFormatException, IOException {

		read_excel_data_HP obj = new read_excel_data_HP();
		return obj.read_sheet();
	}*/
}
