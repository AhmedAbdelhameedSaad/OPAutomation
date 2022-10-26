package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_HP {

	private String username;
	private String password;
	public Login_HP(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public void login_Edge(WebDriver driver) {
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");

//	 Login to HP Web
		By username = By.id("user-id");
		driver.findElement(username).sendKeys(this.username);
		By password = By.id("his-password");
		driver.findElement(password).sendKeys(this.password);
		By login_button = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/form/button");
		driver.findElement(login_button).click();

	}

}
