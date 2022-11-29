package TestCases;

import static org.testng.Assert.assertEquals;

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
import opd_HP_Menus.Action_Menu_Items;
import opd_HP_Menus.Left_Menu_Items;
import opd_appointment.CMO_Preview_Reschedule_Cancel_Appointment;
import opd_authentication.Authentication;
import opd_consultation_visit.Consultation_Visit;
import testBase.HP_Test_Base;
import testBase.Page_Base;


public class OP_TC_354_CMO_CheckOut_Patient extends HP_Test_Base {

	Authentication loginobj;
	CMO_Preview_Reschedule_Cancel_Appointment checkout;
   Page_Base pageobject;
   Consultation_Visit visit ;
   
  
   @Test(priority=1)
	public void  user_login_success()
	{
            
    	loginobj = new Authentication(driver);
		
		 loginobj.login_HP("CMOOPD02", "egy123"); 	 	  
	}
	 
   
	
   @Test(priority=2)
  	public void  CMO_book_Visit_Then_Checkout()
  	{
	  Left_Menu_Items menuItem = new Left_Menu_Items(driver);
		  menuItem.select_clinical_diary_item();  
		  
		  	  Action_Menu_Items menu = new Action_Menu_Items(driver);
		  menu.select_consultation_visit_item(); 
		  
	   checkout = new CMO_Preview_Reschedule_Cancel_Appointment (driver);
	   checkout.CMO_Book_visit_and_Check_Out("A200000277","Family Medicine", "Amr Moez");   
      	
      
  	}
   
   
}

