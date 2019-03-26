package pages;
 
import org.openqa.selenium.By;
 
public class LoginPage extends BasePage {
 
	//private static final String TABLE = "//table[@class='table']";
	//private static final String TABLE_ROWS = TABLE + "/tbody/tr[contains(@class, 'username')]";
	
	public int getRowXpath() {
		return driver.findElements(By.xpath(TABLE_ROWS).size());
	}

	public void userLogin(String USERNAME, String PASSWORD) {
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("btnLogin").click());
	}

	public WebElement successMessage(){
			return driver.findElements(By.id("success"));
	}
	

}