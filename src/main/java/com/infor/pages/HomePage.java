/*
 * package com.infor.pages;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.support.ui.ExpectedConditions;
 * 
 * public class HomePage extends BasePage {
 * 
 * public HomePage(WebDriver driver) { super(driver); // TODO Auto-generated
 * constructor stub }
 * 
 * 
 * @Override public String getPageTitle() { return driver.getTitle(); }
 * 
 * 
 * @Override public String getPageHeader(By locator) { return
 * getElement(locator).getText(); }
 * 
 * 
 * @Override public WebElement getElement(By locator) { WebElement element=
 * null; try { waitForElementPresent(locator); element =
 * driver.findElement(locator); return element; } catch(Exception e) {
 * System.out.println("some error occured while creating element" +
 * locator.toString()); e.printStackTrace(); }
 * 
 * return element; }
 * 
 * 
 * @Override public void waitForElementPresent(By locator) { try {
 * wait.until(ExpectedConditions.presenceOfElementLocated(locator)); }
 * catch(Exception e) {
 * System.out.println("some error occured while waiting for the element" +
 * locator.toString()); }
 * 
 * }
 * 
 * 
 * @Override public void waitForPageTitle(String title) { try {
 * wait.until(ExpectedConditions.titleContains(title)); } catch(Exception e) {
 * System.out.println("some error occured while waiting for the element" +
 * title); }
 * 
 * }
 * 
 * 
 * @Override public WebDriver getDriver() { return null; }
 * 
 * 
 * 
 * 
 * }
 */