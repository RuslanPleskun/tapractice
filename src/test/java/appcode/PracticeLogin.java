package appcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeLogin {
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginPageLink;
	
	@FindBy(id="email")
	WebElement emailField;
	
	@FindBy(id="password")
	WebElement passwordField;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement loginButton;
	
	public PracticeLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginPageLink() {
		loginPageLink.click();
	}
	
	public void setEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void setPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}

}
