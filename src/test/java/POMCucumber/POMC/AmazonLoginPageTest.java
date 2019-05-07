package POMCucumber.POMC;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.BaseClass;

import pages.AmazonLoginPage;
import pages.HomePage;
import pages.SignInPage;


public class AmazonLoginPageTest extends BaseClass{
	AmazonLoginPage AmazonLoginPage;
	HomePage homePage;
	SignInPage signinPage;
	
	public AmazonLoginPageTest(){
		super();
	}
	@BeforeMethod
	public void SettingUp(){
		initialization();
		
		
	}
	@Test
	public void AmazonloginPageTitleTest(){
		AmazonLoginPage = new AmazonLoginPage();
		String LoginTitle = AmazonLoginPage.ValidateSignIn();
		Assert.assertEquals(LoginTitle, "Amazon.com.au: Shop online for Electronics, Apparel, Toys, Books, DVDs & more", "Sorry, the title is not matching");
		}
	@Test
	public void ValidateSignLogoTest(){
		Boolean logo = AmazonLoginPage.ValidateSignLogo();
		Assert.assertTrue(logo);
	}
		@Test
		public void SigninNavi()
		{
			signinPage = AmazonLoginPage.ClickOnHoverSigninLink();
			
		}
		
		@Test
		public void SigningIn()
		{
			homePage = signinPage.signin(prop.getProperty("username"), prop.getProperty("password"));
		}
	}
	

