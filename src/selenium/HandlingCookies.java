package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com/");
        
        Set <Cookie> cookies = driver.manage().getCookies();    //capture all the cookies from browser
		System.out.println("SIZE : " + cookies.size());
		
//		for(Cookie cookie:cookies) {
//			System.out.println(cookie.getName()+":"+cookie.getValue());
//		}
		
//		System.out.println(driver.manage().getCookieNamed("session-id-time"));
		
//		add new cookie to the browser
		Cookie cobj = new Cookie("MyCookie123","12345");
		driver.manage().addCookie(cobj);
		
		cookies = driver.manage().getCookies();
		
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		System.out.println("NEW SIZE : " + cookies.size());
		
		//delete a specific cookie
		driver.manage().deleteCookie(cobj);
		cookies = driver.manage().getCookies();
		
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		System.out.println("NEW SIZE : " + cookies.size());
		
		
		//delete all cookie
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("NEW SIZE : " + cookies.size());
		
		driver.close();
	}

}
