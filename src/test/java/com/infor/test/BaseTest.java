/*
 * package com.infor.test;
 * 
 * import java.io.FileInputStream; import java.util.Properties; import
 * java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.testng.annotations.AfterTest; import org.testng.annotations.BeforeTest;
 * import org.testng.annotations.Parameters;
 * 
 * import com.infor.pages.BasePage; import com.infor.pages.HomePage;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class BaseTest {
 * 
 * WebDriver driver; public HomePage page;
 * 
 * 
 * @BeforeTest public void setUpTest() {
 * 
 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
 * 
 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
 * driver.g driver.get("https://www.google.com/");
 * driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 * 
 * page = new HomePage(driver);
 * 
 * }
 * 
 * @AfterTest public void tearDown() { driver.quit(); }
 * 
 * }
 */