package com.FlipKartTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.support.PageFactory;
import com.FlipKart.BaseClass.mainClass;
import com.FlipKart.Pages.LoginPage;
import com.FlipKart.Pages.homePage;

public class LoginTest extends mainClass {

	LoginPage page;

	public LoginTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		page = new LoginPage();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void openBrowse() {

		page.clickOnLogin();
	}

	//@Test(priority = 1)
	public void LoginDetail() {
		page.EnterEmailid();
		page.EnterPassword();
		page.LoginButtonClick();
		// page.EnterMobileNumber("1122334455");
	}
	/**
	 * @Test(priority=2) public void EnterMobile() { page.EnterMobileNo(); }
	 **/
}
