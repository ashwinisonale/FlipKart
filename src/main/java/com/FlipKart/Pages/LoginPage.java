package com.FlipKart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FlipKart.BaseClass.mainClass;

public class LoginPage extends mainClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='_1_3w1N']")
	WebElement login;
	
	
   By login1=By.xpath("//a[contains(text(),'Login')]");
   
   
   
	public void clickOnLogin() {
	login.click();
		

	}
	
	//By EnterMail=By.xpath("//input[@class='_2IX_2- VJZDxU']");
	
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement EnterMail;

	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement password;
	
	
	By loginButton=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	//@FindBy(xpath="_2KpZ6l _2HKlqd _3AWRsL")
	//WebElement loginButton;
	
   
	//By phoneNo=By.xpath("//label[@class=\\\"_1fqY3P\\\"]");
	//By phoneNo=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	//@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	//WebElement phoneNo;
	

	public void EnterEmailid() {
		//EnterMail.sendKeys("a.m.sonale1336@gmail.com");
        driver.findElement(By.xpath(prop.getProperty("Email"))).sendKeys("ashwinisonale11@gmail.com");
	}
	public void EnterPassword() {
		//password.sendKeys("test12345");
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys("test12345");
	}
	
	public homePage LoginButtonClick() {
         // loginButton.click();
	driver.findElement(loginButton).click();
	
	
	return new homePage();
	}
	
	/**public void EnterMobileNo() {
		phoneNo.click();
		phoneNo.sendKeys("9988776655");
		//driver.findElement(phoneNo).sendKeys(value);
	}**/

}
