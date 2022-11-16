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

import opd_Book_Appointment.CMO_Preview_Reschedule_Cancel_Appointment;
import opd_authentication.Authentication;
import testBase.HP_Test_Base;
import testBase.Page_Base;


public class OP_TC_70_CMO_Generate_Bill_Practioner_Agenda extends HP_Test_Base {

	Authentication loginobj;
	opd_Generate_Visit_Bill.Cmo_Generate_Visit_Bill GenerateBillPractionerObj;
   Page_Base pageobject;
  
   @Test(priority=1)
	public void  user_login_success()
	{
            
    	loginobj = new Authentication(driver); 
		
		 loginobj.login_HP("CMOOPD02", "egy123"); 		  
	}
	 
   
	
   
@Test(priority=2)
  	public void  CMO_Generate_VisitBill_PractionerAgenda()
  	{
              
	GenerateBillPractionerObj = new  opd_Generate_Visit_Bill.Cmo_Generate_Visit_Bill(driver);
  		
	GenerateBillPractionerObj.CMO_Generate_Bill_Practioner_Agenda("Family Medicine","A100072502","60"); 
      	
      	

  	}
   
   
}

