package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToastMessagesToolTip2 {
	
	@Test
    public void ToastMessage() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://seleniumpractise.blogspot.com/2019/08/tooltip-in-selenium-or-help-text-example.html");
        
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//div[@class='tooltip']"))).perform();
        
        String helpText = driver.findElement(By.xpath("//span[@class='tooltiptext']")).getText();
        System.out.println(helpText);
        Assert.assertTrue(helpText.contains("Tooltip"));
	}
}
