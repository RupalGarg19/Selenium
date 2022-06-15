package selenium;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://qavbox.github.io/demo/webtable/");
	    driver.manage().window().maximize();
	    
	    WebElement Table_1 = driver.findElement(By.id("table01"));
	    
	    List<WebElement> Rows = Table_1.findElements(By.tagName("tr"));
	    System.out.println("No. of rows: "+Rows.size());    
//	    mainloop:
//	    for(int i=0; i<Rows.size();i++)
//	    {
//	        List<WebElement> Cols = Rows.get(i).findElements(By.tagName("td"));
//	        for(int j=0; j<Cols.size();j++)
//	        {
//	            if(Cols.get(j).getText().contains("TFS"))
//	            {
//	                Cols.get(0).findElement(By.tagName("input")).click();
//	                Cols.get(4).findElement(By.tagName("input")).click();
//	                break mainloop;
//	            }
//	        } 
//	    }  
	    for(int i=0;i<Rows.size();i++)
	    {
	        List<WebElement> cols=Rows.get(i).findElements(By.tagName("td"));
	        for(int j=1;j<=cols.size();j++)
	        {
	        	String cell = driver.findElement(By.xpath(".//*[@id='table01']/tbody/tr["+i+"]/td[" +j+"]")).getText();
	            System.out.print(cell);
	        }
	        System.out.println("\n");
	    }
	}
}
