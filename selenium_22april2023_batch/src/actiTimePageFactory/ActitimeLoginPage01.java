package actiTimePageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage01 {

	//3 webElement
	
			//Declaration
		    @FindBy(xpath="//input[@id='username']")
			private WebElement username;
		    
		    @FindBy(xpath="//input[@name='pwd']")
			private WebElement password;
		    
		    @FindBy(xpath="//a[@id='loginButton']")
			private WebElement loginButton;
			
			WebDriver driver;
			//initialization
			public ActitimeLoginPage01 (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Usage
			public void setActiTimeUsername()
			{
				username.sendKeys("admin");
			}
			
			public void setActiTimePassword()
			{
				password.sendKeys("manager");
			}
			
			public void VerifyLoginButton()
			{
				loginButton.click();
			}


}
