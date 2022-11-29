package TestCases;

import org.testng.annotations.Test;
import opd_HP_Menus.Left_Menu_Items;
import opd_appointment.CMO_Preview_Reschedule_Cancel_Appointment;
import opd_authentication.Authentication;
import testBase.HP_Test_Base;
import testBase.Page_Base;


public class OP_TC_47_CMO_Preview_Appointment extends HP_Test_Base {

	Authentication loginobj;
	CMO_Preview_Reschedule_Cancel_Appointment previewObj;
   Page_Base pageobject;
  
   @Test
	public void  CMO_Preview_DoctorAppointment()
	{
            
    	loginobj = new Authentication(driver); 
		
		 loginobj.login_HP("CMOOPD02", "egy123"); 
		  Left_Menu_Items menuItem = new Left_Menu_Items(driver);
		  menuItem.select_clinical_diary_item();
              
      	previewObj = new CMO_Preview_Reschedule_Cancel_Appointment(driver);
  		
      	previewObj.CMO_Preview_Doctor_Appointments(); 
      	
     
  	}
   
   
}

