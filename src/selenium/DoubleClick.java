package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"example-1\"]/div[2]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement click = driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"));
		
		Actions action = new Actions(driver);
		action.doubleClick(click).perform();

	}

}
