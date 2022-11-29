package testCases;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import opd_authentication.Authentication;
import testBase.*;

public class OP_TC_180_Login_Empty_Password extends HP_Test_Base

{

	@Test
	public void login_empty_password() {
		Authentication auth = new Authentication(driver);  
		
       try {
    	   
    	   auth.login_HP("DOCUAT5", ""); 
    	   
    	   Thread.sleep(3000); 
    	   Assert.assertEquals(false, auth.login_button.isEnabled());
    	    
    	   
		}catch (InterruptedException ex) {
			Logger.getLogger(OP_TC_180_Login_Empty_Password.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		
	}

}
