package TestCases;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import opd_authentication.Authentication;
import testBase.*;

public class OP_TC_179_Login_Empty_Username extends HP_Test_Base

{

	@Test
	public void login_empty_username() {
		Authentication auth = new Authentication(driver);  
		
       try {
    	   
    	   auth.login_HP("", "egy123"); 
    	   
    	   Thread.sleep(3000); 
    	   Assert.assertEquals(false, auth.login_button.isEnabled());
    	    
    	   
		}catch (InterruptedException ex) {
			Logger.getLogger(OP_TC_179_Login_Empty_Username.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		
	}

}
