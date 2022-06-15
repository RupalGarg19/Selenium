package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
	
	public static String username = "admin";
	public static String password = "admin";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.cssSelector("p")).getText());

	}

}
