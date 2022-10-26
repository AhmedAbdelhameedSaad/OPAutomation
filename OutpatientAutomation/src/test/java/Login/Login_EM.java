package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_EM {

		private String username;
		private String password;
		public Login_EM(String username, String password) {
			this.username = username;
			this.password = password;
	}

		public void login(WebDriver driver) {
			
			driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
			driver.manage().window().maximize();
			
			By username = By.name("name");
			driver.findElement(username).sendKeys(this.username);

			By password = By.name("password");
			driver.findElement(password).sendKeys(this.password);

			By loginButton = By.id("loginID");
			driver.findElement(loginButton).click();

			By OKButton = By.id("loginID");
			driver.findElement(OKButton).click();

		}
}
