package TestCases;

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
import Register_Patient.Register_Patient;
import Utilities.Read_Excel_Register_Patient;


public class TC_OP002_Register_patient extends Test_Base {



	Login_HP loginobject;
	Register_Patient registerobject;


	@DataProvider(name = "Excel Data")
	public Object[][] Register_Data() throws InvalidFormatException, IOException {
		
		

		// get data from excel register patient class
		
		Read_Excel_Register_Patient ER = new Read_Excel_Register_Patient();
		
		try {
			return ER.getExcelData();
			
		} catch (Throwable e) {	
			
			System.out.println("Error occured");
		}
		return null;				
	
}


@Test(dataProvider = "Excel Data")
public void  User_Register_patient(String firstName, String familyName, int mobileNum, int natioID, int Pass, Object address)

{
	 loginobject.login_Edge(driver);
	 loginobject = new Login_HP("CMOOPD02", "egy123");
	
	
	  registerobject = new Register_Patient(driver) ; 
	 
	 registerobject.Register_Form(firstName, familyName, mobileNum, natioID, Pass, address);
	 
	 
	 


}

}








