package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.BaseClass;


public class SignInPage extends BaseClass{

	@FindBy(name="email")
	WebElement username;

	@FindBy(name="password")
	WebElement password;
		
	@FindBy(id="signInSubmit")
	WebElement submit;
	
	public SignInPage(){
		PageFactory.initElements(driver, this);
	
}
	
public String  TitleVerify(){
	return driver.getTitle();

	
			
}

public HomePage signin(String user, String pass) {
	
	username.sendKeys(user);
	password.sendKeys(pass);
	submit.click();

	return new HomePage();
}
}
