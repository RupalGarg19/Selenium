package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	
	public String confirmationMessage() {
		return driver.findElement(By.id("")).getText();
	}
	
	public String title() {
		return driver.getTitle();
	}
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

}
