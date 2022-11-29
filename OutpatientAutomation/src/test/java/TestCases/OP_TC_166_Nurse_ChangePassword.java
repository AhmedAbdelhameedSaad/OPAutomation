package TestCases;


import org.testng.annotations.Test;

import opd_authentication.Authentication;
import testBase.*;

public class OP_TC_166_Nurse_ChangePassword extends HP_Test_Base

{

	@Test
	public void change_pass() {
		Authentication auth = new Authentication(driver);

		auth.login_HP("NUROPD02", "egy123");
		auth.change_password_HP("egy123", "egy456");
		auth.logout_HP();
		auth.login_HP("NUROPD02", "egy456");
		auth.change_password_HP("egy456", "egy123");
		auth.logout_HP();

	}

}
