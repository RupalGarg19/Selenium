package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();
		
		WebElement radio2 = driver.findElement(By.id("redeemFlights"));

		WebElement radio1 = driver.findElement(By.id("bookFlights"));
		radio2.click();
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
		
		System.out.println(driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());
		
		driver.close();
	}
	
}
