package selenium;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DateTimePicker {
	
	@Test
    public void dateTimePicker(){

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/test/");
        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
        dateBox.sendKeys("09252013");
        dateBox.sendKeys(Keys.TAB);
        dateBox.sendKeys("0245PM");

    }
	
//	public void testDatePicker() throws Exception{
//        String dateTime ="12/07/2014 2:00 PM";
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
//    
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebElement selectDate = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_dateview']"));
//        selectDate.click();
//    	WebElement nextLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-next')]"));
//    	WebElement midLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-fast')]"));
//    	WebElement previousLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-prev')]")); 
//        String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");
//        int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Calendar.getInstance().get(Calendar.YEAR);
//        midLink.click();
//        if(yearDiff!=0){
//            if(yearDiff>0){
//                for(int i=0;i< yearDiff;i++){
//                    System.out.println("Year Diff->"+i);
//                    nextLink.click();
//                }
//            }
//            else if(yearDiff<0){
//                for(int i=0;i< (yearDiff*(-1));i++){
//                    System.out.println("Year Diff->"+i);
//                    previousLink.click();
//                }
//            }
//        }
//        Thread.sleep(1000);
//        List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
//        
//        list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1])-1).click();
//        
//        Thread.sleep(1000);
//        List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
//        list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0])-1).click();
//        WebElement selectTime = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_timeview']"));
//        selectTime.click();
//        List<WebElement> allTime = driver.findElements(By.xpath("//div[@data-role='popup'][contains(@style,'display: block')]//ul//li[@role='option']"));
//        dateTime = dateTime.split(" ")[1]+" "+dateTime.split(" ")[2];
//        for (WebElement webElement : allTime) {
//            if(webElement.getText().equalsIgnoreCase(dateTime)){
//                webElement.click();
//            }
//        }
//    }
	
}

