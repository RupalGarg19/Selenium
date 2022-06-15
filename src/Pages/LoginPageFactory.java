package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;
	
	
	@FindBy(id="ctl00_ctpBody_login_txbUserName")
	WebElement usernameBox;
	
	@FindBy(id="ctl00_ctpBody_login_txbPassword")
	WebElement passwordBox;
	
	@FindBy(id="ctl00_ctpBody_login_ibtnLogin")
	WebElement loginButton;
	
	public void setUsername(String username) {
		usernameBox.click();
	}
	
	public void setPassword(String password) {
		passwordBox.click();
	}

	public void clickSubmit() {
		loginButton.click();
	}
	
	//Actions
	public void login(String username, String password) {
		setUsername(username);
		setPassword(password);
		clickSubmit();
	}
		
	
	
	//constructor  initializes the state of the driver
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	

}
