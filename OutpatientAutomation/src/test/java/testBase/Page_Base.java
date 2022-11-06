package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;


public class Page_Base {
	
	public  WebDriver driver ;
	
	// create constructor

		public Page_Base (WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
	
}
