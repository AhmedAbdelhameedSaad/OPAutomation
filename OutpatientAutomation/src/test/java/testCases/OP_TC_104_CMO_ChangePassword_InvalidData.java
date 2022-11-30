package testCases;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import opd_authentication.Authentication;
import testBase.*;

public class OP_TC_104_CMO_ChangePassword_InvalidData extends HP_Test_Base

{

	@Test
	public void change_pass() {
		Authentication auth = new Authentication(driver);
   try {
		auth.login_HP("CMOOPD02", "egy123");
		auth.cmo_change_invalidPassword_HP("egy123","egy123","egy123");
		
		Thread.sleep(3000); 
		
		String error_msg = driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-teams/div/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/span\r\n"
				+ "")).getText();
         System.out.println("\n------------\n"+ error_msg +"\n------------");
		 
		WebElement update_btn = driver.findElement(By.xpath("/html/body/app-root/app-crm/div/div/app-teams/div/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[4]\r\n"
				+ ""));

  	    Assert.assertEquals(true, update_btn.getAttribute("class").contains("disable-btn"));
  	    
  		
  	   
		}catch (InterruptedException ex) {
			Logger.getLogger(OP_TC_167_Nurse_ChangePassword_InvalidData.class.getName()).log(Level.SEVERE, null, ex);


	}
	}
}
