package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utils.BaseClass;
import Utils.TestUtil;

public class AmazonLoginPage extends BaseClass{
WebDriver driver;

	//Page Factory
	
@FindBy(xpath = "//*[@id='nav-link-yourAccount']")
WebElement hover;

@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[text()='Sign in']")
WebElement signin;


@FindBy(id="nav-logo")
WebElement logo;
	
//Initialize PO 
public AmazonLoginPage(){
	PageFactory.initElements(driver, this);
}

//Actions:

public String ValidateSignIn(){
	return driver.getTitle();
}
	public boolean ValidateSignLogo(){
		return logo.isDisplayed();
	}

	
	public SignInPage ClickOnHoverSigninLink(){
			Actions action = new Actions(driver);
			action.moveToElement(hover).build().perform();
			signin.click();
		return new SignInPage();
	}

	
	
	
		
		
		
//		File srcFile = (TakeScreenshot)driver).getScreenshotAs(Output.FILE);
//		String folder = System.setProperty("user.dir");
//		FileUtils.copyFile(srcFile, new File(folder+"Screenshot"+System.currentTimeMillis()+".png"));
		
				
	}


