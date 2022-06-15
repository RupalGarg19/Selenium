package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1 {
	
	WebDriver driver;
	     
	@BeforeTest
	public void SetDriver() throws InterruptedException{
	 
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("java");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> s = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		
		for(WebElement s1 : s) {
			if(s1.getText().equalsIgnoreCase("javatpoint")) {
				s1.click();
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//h3[contains(text(),'Javatpoint: Tutorials List')]")).click();
	 
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
