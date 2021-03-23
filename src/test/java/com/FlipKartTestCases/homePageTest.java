package com.FlipKartTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.FlipKart.BaseClass.mainClass;
import com.FlipKart.Pages.LoginPage;
import com.FlipKart.Pages.homePage;

@Test
public class homePageTest extends mainClass {
	homePage page;
	LoginPage login;

	public homePageTest() {
		page = new homePage();
		login =new LoginPage();
	}

	@BeforeClass
	
	public void setUp() {
		
		openBrowser("chrome");
		openUrl();

       login.EnterEmailid();
       login.EnterPassword();
       login.LoginButtonClick();
	}

	@Test
	public void SearchBarElement() {

		//page.homePageTitle();
		//page.GetLoGo();
	
		page.SearchOnserachBox();
	}
	public void searchIconBtn() {
		page.searchIconBtn();
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
