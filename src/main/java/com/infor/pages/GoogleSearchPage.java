package com.infor.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;;

public class GoogleSearchPage  extends BasePage {
	// Initializing the Page Objects:
			public GoogleSearchPage() {
				PageFactory.initElements(driver, this);
			}

	@FindBy(xpath = "//input[@name='q']")
	WebElement textBoxSearch;
	
	@FindBy(id="first_name")
	WebElement firstName;

	 String expectedTitle="Google";
	public  void searchOnGoogle(String value) {
		Reporter.log("Verify the expected title");
        verify_page_title(expectedTitle);
		Reporter.log("Enter the details in search box");
		textBoxSearch.sendKeys(value);
		Reporter.log("Click on Enter button");
		textBoxSearch.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}


	
	
	

}

	

