package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=google+translate+english+to+hindi&rlz=1C1GCEU_enIN987IN987&sxsrf=APq-WBukJ1qzk-o4kXwh_N0L3ATYLzk2Fg%3A1647413407595&ei=n4gxYrrxI5SW4-EPjrCDuA8&oq=google+translator&gs_lcp=Cgdnd3Mtd2l6EAEYATIHCCMQsAMQJzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQsAMQQ0oECEEYAEoECEYYAFAAWABgsBJoAXABeACAAQCIAQCSAQCYAQDIAQrAAQE&sclient=gws-wiz");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='tw-source-text-ta']")).sendKeys("Hi");
		
		WebElement s = driver.findElement(By.xpath("(//span[@class='Y2IQFc'])[3]"));	
//		Thread.sleep(500);
//		System.out.print(s.getAttribute("lang"));
		System.out.print(s.getText());
//		driver.close();
		
		
		
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		
		
		
		
		
		
		
//		System.out.print(driver.findElement(By.id("tw-target-text")));
		
//		List<WebElement> s  = (List<WebElement>) driver.findElement(By.id("tw-target-text"));
//		
//		for(WebElement s1 : s) {
//			System.out.print(s1.getText());
//		}
		
				
	}

}
