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

import opd_Generate_Visit_Bill.Cmo_Generate_and_Preview_Visit_Bill;
import opd_HP_Menus.Action_Menu_Items;
import opd_HP_Menus.Left_Menu_Items;
import opd_authentication.Authentication;
import opd_consultation_visit.Consultation_Visit;
import testBase.HP_Test_Base;
import testBase.Page_Base;


public class OP_TC_70_CMO_Generate_Bill_Practioner_Agenda extends HP_Test_Base {  

	Authentication loginobj;
	Cmo_Generate_and_Preview_Visit_Bill GenerateBillPractionerObj;
   Page_Base pageobject;
   Consultation_Visit consultObj; 
  
   @Test(priority=1)
	public void  user_login_success()
	{
            
    	loginobj = new Authentication(driver);  
		
		 loginobj.login_HP("CMOOPD02", "egy123");  		  
	
		 /* Left_Menu_Items menuItem = new Left_Menu_Items(driver);
		  menuItem.select_clinical_diary_item();
	 
		 Action_Menu_Items menu = new Action_Menu_Items(driver);
		  menu.select_consultation_visit_item(); 
		  
		  Consultation_Visit consultation_Visit = new Consultation_Visit(driver);
		  consultation_Visit.create("A200000277" , "Family Medicine Clinic" , "Amr Moez"); */
   
	
	}
   
   
@Test(priority=2)
  	public void  CMO_Generate_VisitBill_PractionerAgenda()
  	{
              
	GenerateBillPractionerObj = new  Cmo_Generate_and_Preview_Visit_Bill(driver);
  		
	GenerateBillPractionerObj.CMO_Generate_Bill_Practioner_Agenda("Family Medicine","A200000277","60"); 
      	
      	

  	}
   
   
}

