package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPageFactory;

public class LoginFactory {
	
	public void loginTestPageFactory() {
		
		String username = "abc@gmail.com";
		String password = "abc123";
		
		// 1. initialise driver
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.confirmation.com/home.aspx");
		
		// 2. Enter login 
		LoginPageFactory loginpage = new LoginPageFactory(driver);
		loginpage.login(username, password);
	}
		
}
