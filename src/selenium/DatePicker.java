package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {

public static void main(String[] args) throws InterruptedException {
String dot="10/June/2020";
String date,month,year;
String caldt,calmonth,calyear;
/*
* Spliting the String into String Array
*/
String dateArray[]= dot.split("/");
date=dateArray[0];
month=dateArray[1];
year=dateArray[2];

System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
    
        //Launch the Website
driver.get("http://cleartrip.com");
driver.findElement(By.id("DepartDate")).click();

WebElement cal;
cal=driver.findElement(By.className("calendar"));
calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
/**
* Select the year
*/
while (!calyear.equals(year)) 
{
driver.findElement(By.className("nextMonth")).click();
calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
System.out.println("The Displayed Year::" + calyear);
}

calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
/**
* Select the Month
*/
while (!calmonth.equalsIgnoreCase(month)) 
{
driver.findElement(By.className("nextMonth ")).click();
calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
}

cal=driver.findElement(By.className("calendar"));
/**
* Select the Date
*/
List<WebElement> rows,cols;
rows=cal.findElements(By.tagName("tr"));
for (int i = 1; i < rows.size(); i++) 
{
cols=rows.get(i).findElements(By.tagName("td"));
for (int k = 0; k < cols.size(); k++) 
{
caldt=cols.get(k).getText();
if (caldt.equals(date)) 
{
cols.get(k).click();
break;
}
}
}

}

}