package TestCases;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.Read_Excel_Register_Patient;
import opd_Register_Patient.Register_Patient;
import opd_authentication.Authentication;
import testBase.HP_Test_Base;


public class TC_OP002_Register_patient extends HP_Test_Base {



	Authentication loginobject; 
	Register_Patient registerobject;
	
	
	
	@Test(priority=1)
	public void  user_login_func()
	{
            
    	loginobject = new Authentication (driver);
		 loginobject.login_HP("CMOOPD02", "egy123");

	}

	
	@Test(priority=2  )
	public void  User_Register_ByNationalID()

	{
		registerobject= new Register_Patient(driver);
		registerobject.CMO_Register_Patient("Ali", "Mourad", "01223456789", "11223344556677" ,  "Giza,Cairo"); 
	}

	 /* 	@DataProvider(name = "Excel Data")
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
	 loginobject = new Authentication(driver);
	 loginobject.login_HP("CMOOPD02", "egy123");
	
	
	  registerobject = new Register_Patient(driver) ;
	 
	 registerobject.Register_Form("omar" , "ayman", "01234567890", "1234567891011", "Giza,cairo");
	 	 
	 
}  */

}








