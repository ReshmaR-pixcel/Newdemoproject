package testscript;

import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.Assert;
import pages.LoginPage;
import utilities.ExcelUtility;


public class LoginTest extends Base  {
	@Test(groups={"regression"}, retryAnalyzer=retry.Retry.class)
	
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException {

		/**String usernamevalue = "admin";
		String passwordvalue = "admin";**/
		
		String username = ExcelUtility.getStringData(1, 0, "Login_Page");
		String password = ExcelUtility.getStringData(1, 1, "Login_Page");	
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username );
		loginpage.enterpassword(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageavailable = loginpage.isDashboardLoaded();
		Assert.assertTrue(ishomepageavailable);
		boolean isalertdisplayed = loginpage.isAlertDisplayed();
		Assert.assertTrue(isalertdisplayed);

	}

	@Test
	public void verifyTheUserIsAbleToLoginUsingValidUsernameAndIncorrectPassword() throws IOException {

		/**String usernamevalue = "admin";
		String passwordvalue = "Aravind";**/
		
		String username = ExcelUtility.getStringData(2, 0, "Login_Page");
		String password = ExcelUtility.getStringData(2, 1, "Login_Page");	
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageavailable = loginpage.isDashboardLoaded();
		Assert.assertTrue(ishomepageavailable);
		boolean isalertdisplayed = loginpage.isAlertDisplayed();
		Assert.assertTrue(isalertdisplayed);

	}

	@Test

	public void verifyTheUserIsAbleToLoginUsingIncorrectUsernameAndCorrectPassword() throws IOException {

		//String usernamevalue = "good";
		//String passwordvalue = "admin";
		
		String username = ExcelUtility.getStringData(3, 0, "Login_Page");
		String password = ExcelUtility.getStringData(3, 1, "Login_Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageavailable = loginpage.isDashboardLoaded();
		Assert.assertTrue(ishomepageavailable);
		boolean isalertdisplayed = loginpage.isAlertDisplayed();
		Assert.assertTrue(isalertdisplayed);

	}

	@Test
	public void verifyTheUserIsAbleToLoginUsingIncorrectUsernameAndIncorrectPassword() throws IOException {

		//String usernamevalue = "good";
		//String passwordvalue = " Aravind";
		
		String username = ExcelUtility.getStringData(4, 0, "Login_Page");
		String password = ExcelUtility.getStringData(4, 1, "Login_Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageavailable = loginpage.isDashboardLoaded();
		Assert.assertTrue(ishomepageavailable);
		boolean isalertdisplayed = loginpage.isAlertDisplayed();
		Assert.assertTrue(isalertdisplayed);

	}
}
