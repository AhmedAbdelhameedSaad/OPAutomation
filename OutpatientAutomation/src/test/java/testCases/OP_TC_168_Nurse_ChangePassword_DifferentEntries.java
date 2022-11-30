package testCases;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import opd_authentication.Authentication;
import testBase.*;

public class OP_TC_168_Nurse_ChangePassword_DifferentEntries extends HP_Test_Base

{
	

	@Test
	public void invalid_change_pass() {
		
		
		Authentication auth = new Authentication(driver);
		try {

		auth.login_HP("NUROPD02", "egy123");
		auth.change_invalidPassword_HP("egy123", "egy456", "egy678");
		
		Thread.sleep(3000); 
		
		WebElement update_btn = driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[4]"));

  	    Assert.assertEquals(true, update_btn.getAttribute("class").contains("disable-btn"));
  	    
  		
  	   
		}catch (InterruptedException ex) {
			Logger.getLogger(OP_TC_168_Nurse_ChangePassword_DifferentEntries.class.getName()).log(Level.SEVERE, null, ex);
      }

	}

}
