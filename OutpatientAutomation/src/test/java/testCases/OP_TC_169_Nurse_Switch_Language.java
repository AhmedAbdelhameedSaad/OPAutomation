package testCases;

import org.testng.annotations.Test;

import opd_Change_Language.Change_Language;
import opd_authentication.Authentication;
import testBase.*;

public class OP_TC_169_Nurse_Switch_Language extends HP_Test_Base

{

	@Test
	public void login() {
		Authentication auth = new Authentication(driver);
		auth.login_HP("NUROPD01", "egy123");
		
		Change_Language switch_lang = new Change_Language(driver);
		switch_lang.change_lang_homePage();

	}

}
