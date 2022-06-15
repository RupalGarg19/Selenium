package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public void setUsername(String username) {
		driver.findElement(By.id("ctl00_ctpBody_login_txbUserName")).sendKeys(username);
	}
	
	public void setPassword(String password) {
		driver.findElement(By.id("ctl00_ctpBody_login_txbPassword")).sendKeys(password);
	}

	public void clickSubmit() {
		driver.findElement(By.id("ctl00_ctpBody_login_ibtnLogin")).click();
	
	}
	//constructor  initializes the state of the driver
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
}