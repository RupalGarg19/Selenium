package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAlertTextMessage {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//   	Example1
//        driver.get("http://omayo.blogspot.com/");
//        driver.findElement(By.id("alert1")).click();
//        
//        Alert alert = driver.switchTo().alert();
//        String textOnAlert = alert.getText();
//        Thread.sleep(2000);
//        System.out.println(textOnAlert);
//        
//        alert.accept();
//        driver.close();
        
//      Example 2
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
        
        Alert alert = driver.switchTo().alert();
        String textOnAlert = alert.getText();
        Thread.sleep(2000);
        System.out.println(textOnAlert);
        
        alert.accept();
//      alert.dismiss();
        Thread.sleep(2000);
        
        WebElement ele = driver.findElement(By.xpath("//p[@id='demo']"));
        System.out.println(ele.getText());
        driver.close();
	}

}
