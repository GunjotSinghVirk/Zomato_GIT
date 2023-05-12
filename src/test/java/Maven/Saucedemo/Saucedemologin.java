package Maven.Saucedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemologin extends Saucedemobase {

	//constructor
	public Saucedemologin()
	{
		PageFactory.initElements(driver,this);
	}

	//WebElements : Locators + Identification
	@FindBy(id="user-name")
	WebElement sd_username;
	@FindBy(id="password")
	WebElement sd_password;
	@FindBy(id="login-button")
	WebElement loginbutton;
	@FindBy(xpath="//button[@class='error-button']")
	WebElement errorpopup;

	//action methods
	public void setUsername(String username)
	{
		sd_username.clear();
		sd_username.sendKeys(username);
	}
	public void setPassword(String password)
	{
		sd_password.clear();
		sd_password.sendKeys(password);
	}
	public void clickSubmit()
	{
		loginbutton.click();
	}
	public boolean checkerrorPresence()
	{
		boolean status=errorpopup.isDisplayed();
		return status;
	}

}
