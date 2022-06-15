package captureScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot {

	WebDriver driver;

	@Test
	public void captureScreenshot() throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");

		driver.findElement(By.xpath(".//*[@id=\"email\"]")).sendKeys("Learn Automation");

		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		Files.copy(source, new File("./Screenshots/facebook.png"));
		System.out.println("Screenshot taken");
		
		driver.quit();
	
	}
	
}

//	@AfterMethod
//	public void tearDown(ITestResult result){
//
//		if(ITestResult.FAILURE == result.getStatus()){
//			try {
//
//				TakesScreenshot ts = (TakesScreenshot)driver;
//
//				File source=ts.getScreenshotAs(OutputType.FILE);
//
//				try{
//					FileHandler.copy(source, new File("./Screenshots/"+result.getName()+".png"));
//					System.out.println("Screenshot taken");
//				}catch (Exception e) {
//					System.out.println("Exception while taking screenshot "+e.getMessage());
//				} 
//			}
//			driver.quit();
//			}
//	}
