package TestCases;


import org.testng.annotations.Test;

import opd_authentication.Authentication;
import testBase.*;

public class OP_TC_001_login_valid extends HP_Test_Base

{

	@Test
	public void user_login_success() {
		
		Authentication loginobj = new Authentication(driver); 

		loginobj.login_HP("CMOOPD02", "egy123");

	}

}
