package com.FlipKart.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class mainClass {

	public static WebDriver driver;
	public static Properties prop;

	public mainClass() {
		//openBrowser("chrome");
		//openUrl();
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\com.FlipKart\\src\\main\\resources\\config.properties");
			prop.load(fis);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
	public static void openBrowser(String browserName) {

		switch (browserName) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case "HtmlUnit":
			driver = new HtmlUnitDriver();
			break;

		default: System.err.println("Unable to open browser"+ "provide correct browser name");
		}

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	}	  

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void implicitWait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}

	public static  void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
	
	
	


	public static void closeBrowser() {
		driver.close();
	}	
	public static void explicitWait(int duration) {
		FluentWait	wait=new FluentWait(driver);
		wait.withTimeout(duration, TimeUnit.SECONDS);
	}


	public static  void openUrl() {

		driver.get("https://www.flipkart.com/");
	}

}	




