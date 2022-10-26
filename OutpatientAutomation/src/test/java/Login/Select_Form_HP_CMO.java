package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Select_Form_HP_CMO {
	
	public void login_Edge(WebDriver driver) {
		
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
