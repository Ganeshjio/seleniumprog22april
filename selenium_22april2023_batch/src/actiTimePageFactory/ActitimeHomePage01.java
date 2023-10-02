package actiTimePageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage01 {

	//2 WebElement
	//Declaration
	@FindBy(xpath="//img[@height='61']")
	private WebElement logo;
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logOut;
	
	WebDriver driver;
	//initialization
	public ActitimeHomePage01(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Usage
	public void VerifyActiTimeLogo() 
	{
		boolean result = logo.isDisplayed();
		if(result=true)
		{
			System.out.println("Displayed Logo Test Scenario Passed");
		}
		else
		{
			System.out.println("Displayed Logo Test Scenario Failed");
		}
	}
		
		public void VerifyActiTimeLogoutButton()
		{
			logOut.click();
		}


}
