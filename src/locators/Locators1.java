package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://translate.google.co.in/");
		
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.name("jqKxS"));
		s.sendKeys("translations");
		
				
	}

}
