package testCases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import opd_appointment.Book_appointment;
import opd_appointment.CMO_Preview_Reschedule_Cancel_Appointment;
import opd_authentication.Authentication;
import testBase.HP_Test_Base;
import testBase.Page_Base;


public class OP_TC_53_CMO_Cancel_Rescheduled_Appointment extends HP_Test_Base {

	Authentication loginobj;
	CMO_Preview_Reschedule_Cancel_Appointment cancel;
	 CMO_Preview_Reschedule_Cancel_Appointment reschedule;
	 Book_appointment bookapp;
   Page_Base pageobject;
  
   @Test(priority=1)
	public void  user_login_success()
	{
            
    	loginobj = new Authentication(driver);  

		 loginobj.login_HP("CMOOPD02", "egy123");  		  
	}
	 
   
	
   @Test(priority=2)
  	public void  CMO_Preview_DoctorAppointment() throws Throwable
  	{
	   bookapp = new Book_appointment (driver);
	   bookapp.Book_Appoint_ByInsuranceID("General surgery", "A100037520");
	   
            reschedule = new CMO_Preview_Reschedule_Cancel_Appointment(driver);
            cancel = new CMO_Preview_Reschedule_Cancel_Appointment(driver);
      	
      	reschedule.CMO_Reschedule2__Doctor_Appointments("General Surgery");
      	 
      	cancel.CMO_Cancel_Doctor_Appointments("General Surgery");
      	
  	}
   
   
}

