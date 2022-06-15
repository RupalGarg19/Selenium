package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingToastMessages {
	
	@Test
    public void ToastMessages() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://codeseven.github.io/toastr/demo.html");
        
        driver.findElement(By.id("title")).sendKeys("Success");
        driver.findElement(By.id("message")).sendKeys("Congrats, it works!");
        driver.findElement(By.id("showtoast")).click();

        String toastTitle = driver.findElement(By.className("toast-title")).getText();
        String toastMessage = driver.findElement(By.className("toast-message")).getText();
        
        System.out.println("Title of the Toast Message"+ toastTitle);
        System.out.println("Message of the Toast Message"+ toastMessage);
        
        Assert.assertEquals(toastTitle, "Success");
        Assert.assertEquals(toastMessage, "Congrats, it works!");
        
        Thread.sleep(5000);
        driver.close();
        
    }

}
