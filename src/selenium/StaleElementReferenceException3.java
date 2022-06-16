package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        WebElement box = driver.findElement(By.xpath("//input[@id='bmwcheck']"));
        box.click();
        
        driver.navigate().refresh();
        Thread.sleep(2000);

//       box.click();      causing StaleElementReferenceException
//        to handle it 
        
        try {
        	box.click();
        }catch(org.openqa.selenium.StaleElementReferenceException e) {
        	box = driver.findElement(By.xpath("//input[@id='bmwcheck']"));
            box.click();
        }
        
        Thread.sleep(3000);
        System.out.println("---- END ----");
        driver.close();
	}

}
