package opd_patient;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import testBase.Page_Base;

public class NUR_View_Patient_list extends Page_Base {
	
	public NUR_View_Patient_list(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void list() {

		JavascriptExecutor java = (JavascriptExecutor) driver;
		java.executeScript("scroll(0,1500)");

		System.out.println("Nurse view Patient list successfully"); 
	}
}
