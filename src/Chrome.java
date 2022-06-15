import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Chrome {

	public static void main(String[] args) {
		
		//FOR CHROME
//		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com");
		
		
		//FOR EDGE
		System.setProperty("webdriver.edge.driver", "C:\\browserdrivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");

	}

}
