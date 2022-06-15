package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("java");
		
		Thread.sleep(1000);
		
		List<WebElement> s = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		
		for(WebElement s1 : s) {
			if(s1.getText().equalsIgnoreCase("javatpoint")) {
				s1.click();
				break;
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h3[contains(text(),'Javatpoint: Tutorials List')]")).click();
		
		Thread.sleep(1000);
		driver.close();
		
//		for(int i = 0; i<s.size(); i++) {
//			String s1 = s.get(i).getText();
//			if(s1.contains("javatpoint")) {
//				s.get(i).click();
//				break;
//			}
//		}
		
	}

}
