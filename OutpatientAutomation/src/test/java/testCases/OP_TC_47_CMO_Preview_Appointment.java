package testCases;

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
import opd_Book_Appointment.CMO_Preview_Appointments;
import opd_authentication.Authentication;
import testBase.HP_Test_Base;
import testBase.Page_Base;


public class OP_TC_47_CMO_Preview_Appointment extends HP_Test_Base {

	Authentication loginobj;
	CMO_Preview_Appointments previewObj;
   Page_Base pageobject;
  
   @Test(priority=1)
	public void  user_login_success()
	{
            
    	loginobj = new Authentication(driver);
		
		 loginobj.login_HP("CMOOPD02", "egy123"); 		  
	}
	 
   
	
   @SuppressWarnings("deprecation")
@Test(priority=2)
  	public void  CMO_Preview_DoctorAppointment()
  	{
              
      	previewObj = new CMO_Preview_Appointments(driver);
  		
      	previewObj.CMO_Preview_Doctor_Appointments("Family Medicine");
      	
      	
      	assertEquals(true, previewObj.khaled_txt.isDisplayed());

  	}
   
   
}
