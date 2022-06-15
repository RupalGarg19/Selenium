package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		
		WebElement opentabs = driver.findElement(By.xpath("//div[@class='navFooterLinkCol navAccessibility'][1]"));
		System.out.println(opentabs.findElements(By.tagName("a")).size());
		
		for(int i=0; i<opentabs.findElements(By.tagName("a")).size(); i++) {
			String openagain = Keys.chord(Keys.CONTROL, Keys.ENTER);
			opentabs.findElements(By.tagName("a")).get(i).sendKeys(openagain);
		}

		Set<String> h = driver.getWindowHandles();
		h.iterator(); 
		Iterator<String> iter = h.iterator();
		while(iter.hasNext()) {
			driver.switchTo().window(iter.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
