package actiTimeForm;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class ActitimeloginPage {
		
		// 3 WebElement 
		
		// Declaration
		private WebElement Username;
		private WebElement Password;
		private WebElement LoginButton;
		
		WebDriver driver;
		
		//initialization
		public ActitimeloginPage(WebDriver driver)
		{
			Username = driver.findElement(By.xpath("//input[@id='username']"));
			Password = driver.findElement(By.xpath("//input[@name='pwd']"));
			LoginButton = driver.findElement(By.xpath("//a[@id='loginButton']"));
			
		}
		//usage
		public void verifyUserName()
		{
			Username.sendKeys("admin");
		}
		public void verifyPassword()
		{
		  Password.sendKeys("manager");
		}
		public void verifyLoginButton()
		{
			LoginButton.click();
		}
		
		


}
