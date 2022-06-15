package Tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.DashboardPage;
import Pages.LoginPage;
import graphql.Assert;

public class Login {
	
	@Test
	public void loginTest() {
	
	// 1. initialise driver
	System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
	driver.get("https://www.confirmation.com/home.aspx");
	
	// 2. enter login info(login page)
	LoginPage loginpage = new LoginPage(driver);
	loginpage.setUsername("tm@gmail.com");
	loginpage.setPassword("ab123#123");
	loginpage.clickSubmit();

	// 3. get confirmation(dashboard page)
	 DashboardPage dashboardPage = new DashboardPage(driver);
	 String conf = dashboardPage.confirmationMessage();	 
	 String title = dashboardPage.title();
	 
	 // 4. Assertions
	 Assert.assertTrue(conf.contains("success"));
	 Assert.assertTrue(conf.contains("Account"));
	 
	// 5. close driver
	driver.close();
	
	}
}
