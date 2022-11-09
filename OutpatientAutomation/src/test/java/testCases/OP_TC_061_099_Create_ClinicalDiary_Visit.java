package testCases;

import org.testng.annotations.Test;
import opd_HP_Menus.Left_Menu_Items;
import opd_authentication.Authentication;
import opd_consultation_visit.*;
import opd_patient.CMO_SearchFor_Patient;
import testBase.HP_Test_Base;

public class OP_TC_061_099_Create_ClinicalDiary_Visit extends HP_Test_Base {

	@Test
	public void create() {
		
		  Authentication auth = new Authentication(driver);
		  auth.login_HP("CMOOPD02","egy123");
		  
		  Left_Menu_Items menuItem = new Left_Menu_Items(driver);
		  menuItem.select_clinical_diary_item();
		  
		  CMO_SearchFor_Patient pt_search = new CMO_SearchFor_Patient(driver);
		  pt_search.search_by_FN("patient");
		  pt_search.click_find();
		  	  
		 Consultation_Visit consultation_Visit = new Consultation_Visit(driver);
		 consultation_Visit.create_from_clinicalDiary("Family Medicine Clinic","Mohamed saeed hussin abdraboh");
		 
	}

	
}
