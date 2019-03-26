package tests;

import org.testng.AfterClass;
import org.testng.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Page;

public class BaseTest {

	private static WebDriver webDriver;
	protected static Page basePage;
	
	private static final String APP_URL = "http://<test_app>.com";

	@BeforeClass
	public static void launchApplication(){
		setChromeDriverProperty();
		webDriver = new ChromeDriver();
		webDriver.get(APP_URL);
		basePage = new Page();
		basePage.setWebDriver(webDriver);
	}

	@AfterClass
	public static void closeBrowser(){
		webDriver.quit();
	}

	private static void setChromeDriverProperty(){
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
	}

}