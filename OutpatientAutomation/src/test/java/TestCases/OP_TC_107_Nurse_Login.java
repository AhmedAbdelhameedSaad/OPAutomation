package testCases;


import org.testng.annotations.Test;

import opd_authentication.Authentication;
import testBase.*;

public class OP_TC_107_Nurse_Login extends HP_Test_Base

{

	@Test
	public void login() {
		Authentication auth = new Authentication(driver);

		auth.login_HP("NUROPD01", "egy123");

	}

}
