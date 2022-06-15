package selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinksInNewTab {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("London Time"+Keys.ENTER);
		
		WebElement firstLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div/div/div/div[1]/a/h3"));
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).moveToElement(firstLink).click().perform();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
	}

}
