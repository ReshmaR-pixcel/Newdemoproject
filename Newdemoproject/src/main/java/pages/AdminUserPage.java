package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUserPage {
	WebDriver driver;

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	private WebElement adminusermoreinfo;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement adminusernew;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement adminuserusername;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement adminpassword;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement usertype;
	@FindBy(xpath = "//button[@name='Create']")
	private WebElement adminusernewsave;
	@FindBy(xpath = "//button[@type='button']")
	private WebElement adminuseralert;
	
	//input[@id='username']
	
	public void clickOnAdminUserMoreInfo() {
		adminusermoreinfo.click();
	}

	public void clickOnAdminUserNewButton() {
		adminusernew.click();
	}

	public void enterNewUsername(String newusername) {
		adminuserusername.sendKeys(newusername);

	}

	public void enterNewPassword(String newpassword) {
		adminpassword.sendKeys(newpassword);
	}

	public void clickOnAdminSelectUsertype() {
		Select select=new Select(usertype);
				select.selectByVisibleText("staff");
			PageUtility pageutility=new PageUtility();
				pageutility.selectByvisibletext(usertype, "staff");
	}

	public void clickOnAdminUserSaveButton() {
		adminusernewsave.click();
	}



	public boolean isAdminUserAlertDisplayed() {
		return adminuseralert.isDisplayed();
	}
	public boolean isSaveButtonDisplayed() {
		return adminusernewsave.isDisplayed();
	}
}



