package TestCases;


import org.testng.annotations.Test;

import opd_authentication.Authentication;
import testBase.*;

public class OP_TC_103_CMO_ChangePassword extends HP_Test_Base

{

	@Test
	public void change_pass() {
		Authentication auth = new Authentication(driver);

		auth.login_HP("CMOOPD02", "egy123");
		auth.cmo_change_password_HP("egy123", "egy456");
		auth.logout_HP();
		auth.login_HP("CMOOPD02", "egy456");
		auth.cmo_change_password_HP("egy456", "egy123");
		auth.logout_HP();

	}

}
