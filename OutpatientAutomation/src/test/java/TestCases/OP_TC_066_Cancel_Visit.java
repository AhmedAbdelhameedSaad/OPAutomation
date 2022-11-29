package TestCases;

import org.testng.annotations.Test;

import opd_HP_Menus.Action_Menu_Items;
import opd_HP_Menus.Left_Menu_Items;
import opd_appointment.CMO_Preview_Reschedule_Cancel_Appointment;
import opd_authentication.Authentication;
import opd_consultation_visit.Consultation_Visit;
import testBase.HP_Test_Base;


public class OP_TC_066_Cancel_Visit extends HP_Test_Base {

 
   @Test
	public void  cancel_visit()
	{
		Authentication auth = new Authentication(driver);
		auth.login_HP("CMOOPD02", "egy123");
		
	     Left_Menu_Items menuItem = new Left_Menu_Items(driver);
		 menuItem.select_clinical_diary_item();
		 
		  Action_Menu_Items menu = new Action_Menu_Items(driver);
		  menu.select_consultation_visit_item();
		 
		Consultation_Visit visit = new Consultation_Visit(driver);
		visit.create("A200000468","Family Medicine Clinic","Mohamed saeed hussin abdraboh");
		
		 CMO_Preview_Reschedule_Cancel_Appointment preview_appointment = new CMO_Preview_Reschedule_Cancel_Appointment(driver);
		 preview_appointment.CMO_Preview_Doctor_Appointments();
		 
		visit.cancel_visit_from_clinicalDiary("A200000468");

	}
	
	
}

