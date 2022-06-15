package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\rupal.garg\\eclipse-workspace\\Selenium Basics\\src\\selenium\\table.html");
        List<WebElement> costColumns= driver.findElements(By.xpath("/html/body/table/tbody/tr/td[4]"));
          
        int sum_price=0;
        for(WebElement e : costColumns){
           sum_price= sum_price+Integer.parseInt(e.getText());
        }
        System.out.println("total price: "+sum_price);
	}

}
