package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationTest {
	
	@Test(invocationCount = 3)
	public void testmethod1() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		driver.get("https://randomuser.me/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		System.out.println("User name: " + driver.findElement(By.id("user_value")).getText());

		driver.findElement(By.xpath("//li[@data-label='email']")).click();
		System.out.println("Email address: " + driver.findElement(By.id("user_value")).getText());
		driver.quit();

	}
	
	//invocationTimeOut = 10000
	//threadPoolSize = 2

}
