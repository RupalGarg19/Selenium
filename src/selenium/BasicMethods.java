package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	public static void main(String[] args) {
		
		//get method
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		
		//manage method
		driver.manage().window().maximize();

		
		//get currentUrl method
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		//get title method
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//page source method
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		
		//navigate method
		driver.navigate().to("https://www.google.com");	
		
		
		//quit or close method
		driver.close();
		
			
		
	}

}
