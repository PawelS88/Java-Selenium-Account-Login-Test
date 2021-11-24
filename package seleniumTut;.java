package seleniumTut;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MailLogin {
	private WebDriver wd;
	private String url;
	private String userName;
	private String userPass;
	
	@Before
	public void setUp() {
		wd = new FirefoxDriver();
				url ="https://www.phptravels.net/login";
				userName = "user@phptravels.com";
				userPass = "demouser";
	}
	@Test
	public void loginPositive() {
		wd.get(url);
		
		WebElement loginName = wd.findElement(By.name("email"));
		loginName.clear();
		loginName.sendKeys(userName);
		
		WebElement loginPass = wd.findElement(By.name("password"));
		loginPass.clear();
		loginPass.sendKeys(userPass);
		
		wd.findElement(By.partialLinkText("Login")).click();
		
	}
	
	@After
	public void tearDown() {
		wd.quit();
	}

}
