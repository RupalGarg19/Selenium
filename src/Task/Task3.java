package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");		
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.ndtv.com/");  
	driver.manage().window().maximize();
    driver.findElement(By.id("h_sub_menu")).click();
    driver.findElement(By.xpath("//a[contains(text(),'WEATHER')]")).click();  
    driver.findElement(By.id("searchBox")).sendKeys("New Delhi");
    System.out.println(driver.findElement(By.xpath("//span[contains(text(),'40')]")).getText());
    	    
    
}
	
}
