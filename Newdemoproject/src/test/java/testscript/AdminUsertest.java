package testscript;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;
public class AdminUsertest extends Base {
	@Test
	public void verifyTheUsercanCreateANewusernameAndPassword() throws IOException{
		/**String usernamevalue="admin";
		String passwordvalue="admin";**/
		String username = ExcelUtility.getStringData(1, 0, "AdminUser");
		String password = ExcelUtility.getStringData(1, 1, "AdminUser");	
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		loginpage.clickOnSignInButton();
		
		/**String newusername="Ravin";
		String newpassword="Ravin";**/
		
		String newusername = ExcelUtility.getStringData(2, 0, "AdminUser");
		String newpassword = ExcelUtility.getStringData(2, 1, "AdminUser");	
		
	
		AdminUserPage adminuserpage =new AdminUserPage(driver);
		adminuserpage.enterNewUsername(newusername);
		adminuserpage.enterNewPassword(newpassword);
		adminuserpage.clickOnAdminUserMoreInfo();
		adminuserpage.clickOnAdminUserNewButton();
		adminuserpage.clickOnAdminUserSaveButton();
		adminuserpage.clickOnAdminSelectUsertype();
		
		boolean isalertdisplayed= adminuserpage.isAdminUserAlertDisplayed();
		Assert.assertTrue(isalertdisplayed);
		
		boolean issavebuttondisplayed= adminuserpage.isSaveButtonDisplayed();
		Assert.assertTrue(issavebuttondisplayed);
	}


}
