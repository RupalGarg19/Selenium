package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestGrid {
	
	static WebDriver driver;
	static String nodeUrl;

	public static void main(String[] args) throws MalformedURLException {
		try {
			nodeUrl = "http://192.168.29.22:5555/wd/hub";
			
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(org.openqa.selenium.Platform.WIN10);
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
			driver = new RemoteWebDriver(new URL(nodeUrl), cap);
			
			driver.manage().window().maximize();
			driver.get("http://www.google.in");
			System.out.print("Title of the page is: "+ driver.getTitle());
			driver.close();
	}
		catch(MalformedURLException e){
			e.printStackTrace();
		}

	}
}
