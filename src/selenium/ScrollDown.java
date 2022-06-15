package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown {
		
		WebDriver driver;
	    @Test
//	    public void ByPixel() {
//	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
//	    	driver = new ChromeDriver();
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//	        driver.get("https://www.amazon.com/");
//	        driver.manage().window().maximize();
//	        js.executeScript("window.scrollBy(0,1000)");
//	    }
	    
	    public void ByVisibleElement() {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        driver.get("https://www.amazon.com/");
	        WebElement Element = driver.findElement(By.linkText("Careers"));	
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	    }
	    
//	    public void ByPage() {
//	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
//	    	driver = new ChromeDriver();
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//	        driver.get("https://www.amazon.com/");	
//	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	    }

}
