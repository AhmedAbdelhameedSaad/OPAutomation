package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import opd_HP_Menus.Action_Menu_Items;
import opd_HP_Menus.Left_Menu_Items;
import opd_authentication.Authentication;
import opd_consultation_visit.*;
import testBase.HP_Test_Base;

public class OP_TC_054_097_Create_Consultation_Visit extends HP_Test_Base {

	@Test
	public void create() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  Authentication auth = new Authentication(driver);
		  auth.login_HP("CMOOPD02","egy123");
		  
		  Left_Menu_Items menuItem = new Left_Menu_Items(driver);
		  menuItem.select_clinical_diary_item(); 
		  
		  Action_Menu_Items menu = new Action_Menu_Items(driver);
		  menu.select_consultation_visit_item(); 
		  
		  Consultation_Visit consultation_Visit = new Consultation_Visit(driver);
		  consultation_Visit.create("A200000468", "Family Medicine Clinic",
		  "Mohamed saeed hussin abdraboh");
		 
	}
}
