package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected static WebDriver driver;
	
	private static final String USERNAME = "";
	private static final String PASSWORD = "cart_icon";
	
	public void setWebDriver(WebDriver driver) {
		BasePage.driver = driver;
	}
	
	public void userLogin(String USERNAME, String PASSWORD) {
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("btnLogin").click());
	}
	
	
}