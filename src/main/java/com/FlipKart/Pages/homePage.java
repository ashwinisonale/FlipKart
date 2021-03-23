package com.FlipKart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FlipKart.BaseClass.mainClass;

public class homePage extends mainClass {
	
	public homePage() {
		super();
		
		
	
	}
/**@FindBy(xpath="//img[@title='Flipkart']")
WebElement title;

@FindBy(xpath="//a//img[@class=\"_2xm1JU\"]")
WebElement LoGo;


public homePage() {
PageFactory.initElements(driver, this);
}

public String homePageTitle() {
//return driver.getTitle();
}
public boolean GetLoGo() {
	return LoGo.isDisplayed();
}**/


	
//@FindBy(xpath="//input[@class='_3704LK']")
//WebElement SearchBar;
By searchBar=By.xpath("//input[@class='_3704LK']");



By ClickOnSearchBar=By.xpath("//input[@title=\"Search for products, brands and more\"]");



//@FindBy(xpath="//button[@class=\"L0Z3Pu\"]")
//WebElement searchIcon;
By searchIcon=By.xpath("//button[@class='L0Z3Pu']");




public void SearchOnserachBox() {
	//driver.findElement(ClickOnSearchBar).click();
	//SearchBar.sendKeys("dress");
	
	driver.findElement(searchBar).sendKeys("dress");
	driver.findElement(ClickOnSearchBar).click();
	
}
	public void searchIconBtn() {
		
    driver.findElement(searchIcon).click();
	//searchIcon.click();
	}

}

















