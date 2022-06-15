package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"user-signup-actions\"]/div[1]/div[1]/a[2]/span[1]")).click();
		
		//using sendkeys()
//		driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("C:\\Users\\rupal.garg\\Downloads\\DB.pdf");
		
		//using robot class
		WebElement button = driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
		
		/*
		1)Copy the Path
		2)CTRL+V
		3)Enter
		*/
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		//put path to file in a clipboard
		StringSelection ss = new StringSelection("C:\\Users\\rupal.garg\\Downloads\\DB.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		//CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL); // Press on CTRL Key
		rb.keyPress(KeyEvent.VK_V); // Press on V Key
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
