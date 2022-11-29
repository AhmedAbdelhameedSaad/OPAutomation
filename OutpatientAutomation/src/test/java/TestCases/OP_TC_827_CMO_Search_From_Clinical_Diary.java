package testCases;



import org.testng.annotations.Test;

import opd_appointment.Book_appointment;
import opd_appointment.Search_For_Clinic;
import opd_authentication.Authentication;
import testBase.HP_Test_Base;


public class OP_TC_827_CMO_Search_From_Clinical_Diary extends HP_Test_Base {
	
	Search_For_Clinic search ;
	Authentication loginobject2;
	   
	   @Test(priority=1)
		public void  user_login_()
		{
	            
	    	loginobject2 = new Authentication (driver);
			 loginobject2.login_HP("CMOOPD02", "egy123");

		} 
	


@Test(priority=2 )
public void  User_SearchFor_Clinic_From_Action_Menu() throws InterruptedException

{
	 	
	search = new Search_For_Clinic(driver) ;
	  
	  search.Search_ForClinic_Diary_Page( "Family Medicine" );
	 
	
	 
}

}







