package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {
//Dynamic Tables
	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        
//        driver.get("http://demo.guru99.com/test/web-table-element.php");         

//        List <WebElement> col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
//        System.out.println("No of cols are : " +col.size()); 
//
//        List <WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
//        System.out.println("No of rows are : " + rows.size());
//        driver.close();
        
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		WebElement baseTable = driver.findElement(By.tagName("table"));
//		  
//		WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
//        String rowtext = tableRow.getText();
//		System.out.println("Third row of table : "+rowtext);
//		    
//		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
//		String valueIneed = cellIneed.getText();
//		System.out.println("Cell value is : " + valueIneed); 
//		driver.close();
        
        
        driver.get("http://demo.guru99.com/test/table.html");
    	WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
    	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
    	int rows_count = rows_table.size();
    	for (int row = 0; row < rows_count; row++) {
    		
    	    List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
    	    int columns_count = Columns_row.size();
    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
    	    for (int column = 0; column < columns_count; column++) {
    	        String celtext = Columns_row.get(column).getText();
    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
    	    }
    	System.out.println("-------------------------------------------------- ");  
    	}
	}

}
