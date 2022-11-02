package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testBase.Page_Base;

public class Login_HP  {
	
	private String username;
    private String password;
    public Login_HP(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void login_Edge(WebDriver driver) {

//     Login to HP Web
        By username = By.id("user-id");
        driver.findElement(username).sendKeys(this.username);
        By password = By.id("his-password");
        driver.findElement(password).sendKeys(this.password);
        By login_button = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/form/button");
        driver.findElement(login_button).click();

    }
	
	
	/*public Login_HP(WebDriver driver) {
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

	}*/

}
