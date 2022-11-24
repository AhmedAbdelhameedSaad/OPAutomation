package opd_Change_Language;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testBase.Page_Base;

public class Change_Language extends Page_Base{

	public Change_Language(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void change_lang_Login()
	{
		By change_lang = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[1]/div[1]/div/div[1]");
		driver.findElement(change_lang).click();
		By select_lang = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div");
		driver.findElement(select_lang).click();
	}
}
