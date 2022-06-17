package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //Example 1
//        driver.get("https://www.google.co.in/");
//        WebElement ele = driver.findElement(By.name("q"));
//        String t = ele.getAttribute("title");
//        System.out.println("ToolTipText is : " +t);
//        driver.quit();
        
        //Example 2
//        driver.get("https://www.amazon.com/");
//        WebElement ele = driver.findElement(By.id("searchDropdownBox"));
//        String t = ele.getAttribute("title");
//        System.out.println("ToolTipText is : " +t);
//        driver.quit();
//        
        //Example 3
        String str = "We ask for your age only for statistical purposes.";
        
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement ele = driver.findElement(By.id("age"));
        String t = ele.getAttribute("title");
        System.out.println("ToolTipText is : " +t);
        if(t.equals(str)) {							
            System.out.println("Test Case Passed");					
        }
        driver.quit();
	}

}
