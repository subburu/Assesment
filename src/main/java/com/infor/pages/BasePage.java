package com.infor.pages;
import static org.testng.Assert.assertEquals;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class BasePage {
  
	public static WebDriver driver;

	
	public static void invoke(){
		Reporter.log("Launch the browser");
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Reporter.log("Enter the url");
		driver.get("http://google.com/");

			 
		}

  
	public static void scroll()
	{
		Reporter.log("Scroll the web page");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
	}
	
	
	public void verify_page_title(String expectedTitle)
	{
		String actualTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		assertEquals(expectedTitle,actualTitle);
	}
  }
 