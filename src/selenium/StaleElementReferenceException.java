package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.pavantestingtools.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Online Training')]"));
        link.click();
        driver.navigate().back();
        
        Thread.sleep(5000);
//        link.click();    causing StaleElementReferenceException
//        to handle it 
        
        try {
        	link.click();
        }catch(org.openqa.selenium.StaleElementReferenceException e) {
        	link = driver.findElement(By.xpath("//a[contains(text(),'Online Training')]"));
            link.click();
        }
        System.out.println("---- END ----");
        driver.close();
	}

}
