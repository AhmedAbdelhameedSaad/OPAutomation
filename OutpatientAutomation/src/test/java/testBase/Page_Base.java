package testBase;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;


public class Page_Base {
	
	public static WebDriver driver ;
	
	// create constructor

		public Page_Base (WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}

	

		
	

	
	

	



	
}
