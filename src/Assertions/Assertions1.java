package Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertions1 {
	
	WebDriver driver;
	//String path = System.getProperty("user.dir”);
	     
	@BeforeTest
	public void SetDriver(){
	 
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		driver.manage().window().maximize();
	 
	}
	 
	@Test
	public void verifyTitle(){
		
		driver.get("https://www.javatpoint.com/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Tutorials List - Javatpoint";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Assert passed");
		
	}
	 
	@AfterTest
	public void closedriver(){
	
		driver.close();
	}
}
