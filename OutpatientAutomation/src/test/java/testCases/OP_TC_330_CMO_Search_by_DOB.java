package testCases;

import org.testng.annotations.Test;

import opd_HP_Menus.Left_Menu_Items;
import opd_authentication.Authentication;
import opd_patient.CMO_SearchFor_Patient;
import testBase.*;

public class OP_TC_330_CMO_Search_by_DOB extends HP_Test_Base

{

	@Test
	public void search_for_patient() {
		Authentication auth = new Authentication(driver);
		auth.login_HP("CMOOPD02", "egy123");
		
		 Left_Menu_Items menuItem = new Left_Menu_Items(driver);
		  menuItem.select_clinical_diary_item(); 
		  
		
		CMO_SearchFor_Patient find_patient = new CMO_SearchFor_Patient(driver);
		find_patient.search_bar();
		find_patient.search_by_LN("patient");
		find_patient.search_by_date();
		find_patient.click_find();

	}

}
