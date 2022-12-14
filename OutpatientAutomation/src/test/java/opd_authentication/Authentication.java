package opd_authentication;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.Page_Base;

public class Authentication extends Page_Base {
	
	public WebElement login_button = driver.findElement(By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/form/button"));

	
	public Authentication(WebDriver driver) {
		super(driver);
	}
	

	public void login_HP(String username, String password) { 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		By username_element = By.id("user-id");
		driver.findElement(username_element).sendKeys(username);
		By password_element = By.id("his-password");
		driver.findElement(password_element).sendKeys(password);
		
	By login_button = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/form/button"); 
		driver.findElement(login_button).click();

	}

	public void change_password_HP(String Old_password, String New_password) {

		try {

			Thread.sleep(15000); 

			// User_Profile
			By User_Profile_icon = By.xpath("//*[@id=\"user-profile-icon\"]/div/div");
			driver.findElement(User_Profile_icon).click();

			Thread.sleep(2000);

			By My_Profile = By.xpath("//*[@id=\"user-profile-actions\"]/div[2]/div[2]/p");
			driver.findElement(My_Profile).click();

			Thread.sleep(2000);

			// select Change password
			By Change_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[1]/div[2]/div/p");
			driver.findElement(Change_password).click();

			Thread.sleep(2000);

			By Enter_old_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/input");
			driver.findElement(Enter_old_password).sendKeys(Old_password);

			Thread.sleep(2000);

			By Enter_new_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/input");
			driver.findElement(Enter_new_password).sendKeys(New_password);

			Thread.sleep(2000);

			By Reenter_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[3]/input");
			driver.findElement(Reenter_password).sendKeys(New_password);

			Thread.sleep(2000);

			// Update icon
			By Update_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[4]");
			driver.findElement(Update_icon).click();

			Thread.sleep(2000);

			// Close icon
			By Close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[1]/div/img");
			driver.findElement(Close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Authentication.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public void cmo_change_password_HP(String Old_password, String New_password) {

		try {

			Thread.sleep(15000); 

			// User_Profile
			By User_Profile_icon = By.xpath("//*[@id=\"user-profile-icon\"]/div/div");
			driver.findElement(User_Profile_icon).click();

			Thread.sleep(2000);

			By My_Profile = By.xpath("//*[@id=\"user-profile-actions\"]/div[2]/div[2]/p");
			driver.findElement(My_Profile).click();

			Thread.sleep(2000);

			// select Change password
			By Change_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-teams/div/app-crm-header/app-profile/div/div[2]/div/div[2]/div[1]/div[2]/div/p");
			
			driver.findElement(Change_password).click();

			Thread.sleep(2000);

			By Enter_old_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-teams/div/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/input");
			driver.findElement(Enter_old_password).sendKeys(Old_password);

			Thread.sleep(2000);

			By Enter_new_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-teams/div/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/input");
			driver.findElement(Enter_new_password).sendKeys(New_password);

			Thread.sleep(2000);

			By Reenter_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-teams/div/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[3]/input");
			driver.findElement(Reenter_password).sendKeys(New_password);

			Thread.sleep(2000);

			// Update icon
			By Update_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-teams/div/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[4]");
			driver.findElement(Update_icon).click();

			Thread.sleep(2000);

			// Close icon
			By Close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-teams/div/app-crm-header/app-profile/div/div[2]/div/div[1]/div/img");
			driver.findElement(Close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Authentication.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public void logout_HP() {

		try {

			Thread.sleep(4000);

			// Logout to HP Web
			By User_Profile_icon = By.xpath("//*[@id=\"user-profile-icon\"]/div/div");
			driver.findElement(User_Profile_icon).click();

			Thread.sleep(2000);

			By logout_button = By.xpath("//*[@id=\"user-profile-actions\"]/div[2]/div[3]");
			driver.findElement(logout_button).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Authentication.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void login_EM(String username, String password) {

		
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();
		
		By username_element = By.name("name");
		driver.findElement(username_element).sendKeys(username);

		By password_element = By.name("password");
		driver.findElement(password_element).sendKeys(password);

		By loginButton = By.id("loginID");
		driver.findElement(loginButton).click();

		By OKButton = By.id("loginID");
		driver.findElement(OKButton).click();

	}


    public void physician_login_HP(String username, String password) throws InterruptedException {
	
	By username_element = By.id("user-id");
	driver.findElement(username_element).sendKeys(username);
	By password_element = By.id("his-password");
	driver.findElement(password_element).sendKeys(password);
	By login_button = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/form/button");
	driver.findElement(login_button).click();
	
	Thread.sleep(2000);
	
	By clinician_radiobtn = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/div[2]/div/div/div/div[1]/input");
	driver.findElement(clinician_radiobtn).click();
	
	By continue_button = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/div[3]/button");
	driver.findElement(continue_button).click();

	
}
	

    public void change_invalidPassword_HP(String Old_password, String New_password, String reenter_password) {

		try {

			Thread.sleep(15000); 

			// User_Profile
			By User_Profile_icon = By.xpath("//*[@id=\"user-profile-icon\"]/div/div");
			driver.findElement(User_Profile_icon).click();

			Thread.sleep(2000);

			By My_Profile = By.xpath("//*[@id=\"user-profile-actions\"]/div[2]/div[2]/p");
			driver.findElement(My_Profile).click();

			Thread.sleep(2000);

			// select Change password
			By Change_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[1]/div[2]/div/p");
			driver.findElement(Change_password).click();

			Thread.sleep(2000);

			By Enter_old_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/input");
			driver.findElement(Enter_old_password).sendKeys(Old_password);

			Thread.sleep(2000);

			By Enter_new_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/input");
			driver.findElement(Enter_new_password).sendKeys(New_password);

			Thread.sleep(2000);

			By Reenter_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[3]/input");
			driver.findElement(Reenter_password).sendKeys(reenter_password);

			Thread.sleep(2000);

			// Update icon
			By Update_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[4]");
			driver.findElement(Update_icon).click();

			Thread.sleep(2000);


		} catch (InterruptedException ex) {
			Logger.getLogger(Authentication.class.getName()).log(Level.SEVERE, null, ex);
		}
	}


    public void cmo_change_invalidPassword_HP(String Old_password, String New_password, String reenter_password) {

		try {

			Thread.sleep(15000); 

			// User_Profile
			By User_Profile_icon = By.xpath("//*[@id=\"user-profile-icon\"]/div/div");
			driver.findElement(User_Profile_icon).click();

			Thread.sleep(2000);

			By My_Profile = By.xpath("//*[@id=\"user-profile-actions\"]/div[2]/div[2]/p");
			driver.findElement(My_Profile).click();

			Thread.sleep(2000);

			// select Change password
			By Change_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-teams/div/app-crm-header/app-profile/div/div[2]/div/div[2]/div[1]/div[2]/div/p");
			
			driver.findElement(Change_password).click();

			Thread.sleep(2000);

			By Enter_old_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-teams/div/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/input");
			driver.findElement(Enter_old_password).sendKeys(Old_password);

			Thread.sleep(2000);

			By Enter_new_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-teams/div/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/input");
			driver.findElement(Enter_new_password).sendKeys(New_password);

			Thread.sleep(2000);

			By Reenter_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-teams/div/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[3]/input");
			driver.findElement(Reenter_password).sendKeys(reenter_password);

			Thread.sleep(2000);

			// Update icon
			By Update_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-teams/div/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[4]");
			driver.findElement(Update_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Authentication.class.getName()).log(Level.SEVERE, null, ex);
		}
	}


} 