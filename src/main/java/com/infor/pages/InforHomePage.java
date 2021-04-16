package com.infor.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.sun.jna.platform.dnd.DropHandler;

public class InforHomePage extends BasePage {
	// Initializing the Page Objects:

	public InforHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[contains(text(),'Birst ')]")
	List<WebElement> search_Results;

	public void search_Results(List<WebElement> search_Results) {
		((WebElement) search_Results).click();
	}

	@FindBy(xpath = "//div[@id='top-nav']//a[@class='nav-link'][contains(text(),'Resources')]")
	WebElement link_Resources;

	@FindBy(xpath = "//select[contains(.,'All Products')]")
	WebElement dropdownAllProducts;

	@FindBy(xpath = "//select[contains(.,'All Assets')]")
	WebElement dropdownAssets;

	@FindBy(id = "onetrust-accept-btn-handler")
	WebElement acceptCookies;
	@FindBy(xpath = "//a[contains(.,'Six steps to becoming a data-driven organization')]")
	WebElement link_Six_Steps;

	@FindBy(xpath = "//div[@id='mastheadImageEvent']//h1[contains(text(),'Six steps to becoming a data-driven organization')]")
	WebElement webinar_Six_Steps_to_become_data_driven;

	public String expectedWebinar = "Six steps to becoming a data-driven organization";

	public void dropdownAssets(String value) {
		Select statusDropdown = new Select(dropdownAssets);
		statusDropdown.selectByVisibleText(value);
	}

	public void dropdownAllProducts(String value) {
		Select statusDropdown = new Select(dropdownAllProducts);
		statusDropdown.selectByVisibleText(value);
	}

	String searchValue = "Birst | Business intelligence and analytics | Infor";
	WebDriverWait wait = new WebDriverWait(driver, 30);

	public void verify_Google_Search_Results() throws InterruptedException {

		for (int i = 0; i < search_Results.size(); i++) {
			String temp = search_Results.get(i).getText();

			if ((temp.equalsIgnoreCase(searchValue))) {
				search_Results.get(i).click();
			}
		}

		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(acceptCookies)));
		acceptCookies.click();

	}

	public void enter_details_Resource_Page() {
		Reporter.log("Navigate to Resources Page ");
		wait.until(ExpectedConditions.elementToBeClickable(link_Resources));
		Reporter.log("Click on Resources link ");
		link_Resources.click();
		scroll();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(dropdownAllProducts)));
       Reporter.log("Enter the details in Resource page");
		dropdownAllProducts("Birst");
		driver.navigate().refresh();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(dropdownAssets)));
		dropdownAssets("Past Webinars");
		scroll();
		Reporter.log("Click on  Six_Steps for data-driven ");
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(link_Six_Steps)));
		link_Six_Steps.click();

	}

	public void verify_Webinar() {
		String actualWebniar = webinar_Six_Steps_to_become_data_driven.getText();
		Assert.assertEquals("Webinar is available", actualWebniar, expectedWebinar);

	}

}
