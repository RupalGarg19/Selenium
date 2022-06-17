package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetValAttribute {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String url = "https://www.google.com/";
        driver.get(url);
        
        WebElement ele = driver.findElement(By.name("q"));
        ele.sendKeys("Selenium WebDriver");
        
        Thread.sleep(2000);
        String val = ele.getAttribute("value");
        System.out.println("Entered text is: " + val);
        
        driver.close();

	}

}
