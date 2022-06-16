package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
//        driver.get("https://www.freecrm.com/index.html");
        driver.get("https://ui.freecrm.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        WebElement username = driver.findElement(By.name("email"));
        username.sendKeys("abc@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("abc12");
        driver.navigate().refresh();
        
        Thread.sleep(2000);
//      username.sendKeys("abc@gmail.com"); causing StaleElementReferenceException
//        to handle it 
        
        try {
        	username.sendKeys("abc@gmail.com");
        }catch(org.openqa.selenium.StaleElementReferenceException e) {
        	username = driver.findElement(By.name("email"));
            username.sendKeys("abc@gmail.com");
        }
        Thread.sleep(3000);
        System.out.println("---- END ----");
        driver.close();
	}

}
