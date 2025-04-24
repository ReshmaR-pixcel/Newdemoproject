package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//input[@name='username']")private WebElement username;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	@FindBy(xpath="//button[@class='close']")private WebElement alert;
	@FindBy(xpath="//li[@class='breadcrumb-item active']")private WebElement dashboard;
	
	public void enterUsername(String usernamevalue) {
		username.sendKeys(usernamevalue);
	}
	public void enterpassword(String passwordvalue) {
		password.sendKeys(passwordvalue);
	}
	public void clickOnSignInButton() {
		signin.click();
	}
	public boolean isDashboardLoaded() {
		return dashboard.isDisplayed();
	}
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
}
