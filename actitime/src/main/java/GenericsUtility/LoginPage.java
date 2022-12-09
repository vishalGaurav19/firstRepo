package GenericsUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloginCheckBox;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[contains[text(),'Forgot)]")
	private WebElement forgetPasswordLink;
	
	public WebElement getusernameTextField()
	{
		return usernameTextField;	
	}
	
	public WebElement getPasswordTextField()
	{
		return passwordTextField;
	}
	public WebElement getKeepLogedInCheckBoxTextField()
	{
		return keepmeloginCheckBox;
		
	}
	public WebElement getLoginButton()
	{
		return loginButton;	
	}
	public WebElement getForgetPasswordLink()
	{
		return forgetPasswordLink;	
	}
	public void loginAction(String username,String password ) 
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
		
	
	
	

}
