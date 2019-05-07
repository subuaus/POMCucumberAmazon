package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AmazonLoginPage;
import pages.SignInPage;

public class StepDefinitions extends BaseClass {
WebDriver driver;
AmazonLoginPage AmazonLoginPage;
SignInPage SignInPage;
pages.HomePage HomePage;

	@Given("^User already opened the browser$")
	public void user_has_already_opened_the_browser() {
	   BaseClass.initialization();
	    
	}

	@When("^Amazon Logo is visible$")
	public void amazon_Logo_is_visible() {
		AmazonLoginPage AmazonLoginPage = new AmazonLoginPage();
		AmazonLoginPage.ValidateSignLogo();
	   
	}

	@Then("^User will hover to signin button and click it$")
	public void user_will_hover_to_signin_button_and_click_it() {
		SignInPage SignInPage = AmazonLoginPage.ClickOnHoverSigninLink();
		
	    
	}

	@Then("^SignIn page will be open$")
	public void signin_page_will_be_open() {
		SignInPage SignInPage = new SignInPage();
		String title = SignInPage.TitleVerify();
		Assert.assertEquals(title, "Amazon Sign In");
		
	    
	}

	@Then("^enter username and password and signin$")
	public void enter_username_and_password_and_signin() {
		HomePage = SignInPage.signin(prop.getProperty("username"), prop.getProperty("password"));
	    
	}

	

	@Then("^validate homepage login$")
	public void validate_homepage_login() {
	   HomePage.HomepageVerify();
	    
	}

}

