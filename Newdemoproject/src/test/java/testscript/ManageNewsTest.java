package testscript;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;


public class ManageNewsTest extends Base {
	@Test

	public void verifyTheUserCanCreateManageNewsSuccessfully() throws IOException {

		/**String usernamevalue="admin";
		String passwordvalue="admin";**/
		
		String username = ExcelUtility.getStringData(1, 0, "ManageNews");
		String password = ExcelUtility.getStringData(1, 1, "ManageNews");
		
		String newsvalue = "test automation";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		loginpage.clickOnSignInButton();

		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickOnManageNewsInfo();
		managenewspage.clickOnManageNewsNewButton();
		managenewspage.enterTheNews(newsvalue);
		managenewspage.clickOnManageNewsSaveButton();
		boolean isalertdisplayed = managenewspage.isGreenAlertDisplayed();
		Assert.assertTrue(isalertdisplayed);
	}

}

/**
 * String usernamevalue= "admin"; String passwordvalue= "admin"; String
 * newsvalue="test automation";
 **/