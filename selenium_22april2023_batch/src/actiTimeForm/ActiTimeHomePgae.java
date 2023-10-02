package actiTimeForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeHomePgae {

	// 2 webElement 
	//Declaration
	private WebElement Logo;
	private WebElement Logout;
	
	WebDriver driver;
	
	// initialization
	public ActiTimeHomePgae (WebDriver driver) 
	{
		Logo = driver.findElement(By.xpath("//img[@height='61']"));
		Logout = driver.findElement(By.xpath("//a[@class='logout']"));
	}
	//usage
	public void verifyActiTimeLogo()
	{
		boolean result = Logo.isDisplayed();
		if (result=true)
		{
			System.out.println ("Test Scenario pass");
		}
		else 
		{
			System.out.println ("Test Scenario fail");
		}
	}
	public void verifyActiTimeLogout()
	{
	  Logout.click();
	}

}
