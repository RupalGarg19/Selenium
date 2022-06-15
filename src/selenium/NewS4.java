package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewS4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.google.com/");
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.navigate().to("https://www.browserstack.com/");

		//screenshot
		driver.get("https://www.amazon.com/");
		
		WebElement ele = driver.findElement(By.xpath(""));
		File file = ele.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("ss.png"));
		
	}

}
