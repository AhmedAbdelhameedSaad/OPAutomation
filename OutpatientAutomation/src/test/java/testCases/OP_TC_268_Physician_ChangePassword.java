package testCases;


import org.testng.annotations.Test;

import opd_authentication.Authentication;
import testBase.*;

public class OP_TC_268_Physician_ChangePassword extends HP_Test_Base

{

	@Test
	public void change_pass() {
		Authentication auth = new Authentication(driver);

		auth.login_HP("DOCOPD01", "egy123");
		auth.change_password_HP("egy123", "egy456");
		auth.logout_HP();
		auth.login_HP("DOCOPD01", "egy456");
		auth.change_password_HP("egy456", "egy123");
		auth.logout_HP();

	}

}
