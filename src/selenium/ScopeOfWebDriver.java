package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeOfWebDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		int totalLinksCount = driver.findElements(By.tagName("a")).size();
		
		System.out.println("Total Links : "+totalLinksCount);
		
		WebElement footer = driver.findElement(By.tagName("footer"));
		
		int footerLinksCount = footer.findElements(By.tagName("a")).size();
		
		System.out.println("Footer Links : "+footerLinksCount);
		
	}

}
