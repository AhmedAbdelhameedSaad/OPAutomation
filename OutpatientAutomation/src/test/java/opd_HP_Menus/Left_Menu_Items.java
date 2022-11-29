package opd_HP_Menus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testBase.Page_Base;

public class Left_Menu_Items extends Page_Base{
	
	public Left_Menu_Items(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void select_clinical_diary_item() {
		
		try {
			Thread.sleep(4000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By menu_item = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[2]/div/img");
		driver.findElement(menu_item).click();
	}


}
