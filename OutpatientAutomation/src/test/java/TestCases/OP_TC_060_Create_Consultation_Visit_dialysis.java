package TestCases;

import org.testng.annotations.Test;

import opd_HP_Menus.Action_Menu_Items;
import opd_authentication.Authentication;
import opd_consultation_visit.*;
import testBase.HP_Test_Base;

public class OP_TC_060_Create_Consultation_Visit_dialysis extends HP_Test_Base {

	@Test
	public void create() {
		
		  Authentication auth = new Authentication(driver);
		  auth.login_HP("S00382","egy123");
		  		  
		  Action_Menu_Items menu = new Action_Menu_Items(driver);
		  menu.select_consultation_visit_item();
		  
		  Consultation_Visit consultation_Visit_dialysis = new Consultation_Visit(driver);
		  consultation_Visit_dialysis.create_dialysis_visit("A200000468", "El Nasr Dialysis unit",
		  "Nephrology consultant");
		 
	}

	}
