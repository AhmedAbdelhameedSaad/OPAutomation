package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testBase.Page_Base;

public class Login_HP extends Page_Base {
	
	
	
	public Login_HP(WebDriver driver) {
		super(driver);   
	}

	

	public void login_Edge(String userN , String pass ) {
		
//	 Login to HP Web
		By username = By.id("user-id");
		driver.findElement(username).sendKeys(userN);
		By password = By.id("his-password");
		driver.findElement(password).sendKeys(pass);
		By login_button = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/form/button");
		driver.findElement(login_button).click(); 		

	}



	

}
