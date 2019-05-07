package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(id="nav-logo")
	WebElement title;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean HomepageVerify(){
		return title.isDisplayed();
		
	}
}
