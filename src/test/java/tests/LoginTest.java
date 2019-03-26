package tests;

import org.testng.Test;

import org.testng.Assert;
import pages.LoginPage;

public class LoginTests extends BaseTest {
	
	@Test
	public void loginToApp() {
		LoginPage LoginPage = new LoginPage();
		loginPage.userLogin("test","test");
		Assert.assertEquals(loginPage.successMessage().getText(),"Login Succeeful");
	}
}
