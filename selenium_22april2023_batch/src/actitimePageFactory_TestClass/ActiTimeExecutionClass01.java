package actitimePageFactory_TestClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import actiTimePageFactory.ActiTimeCreatePage1;
import actiTimePageFactory.ActitimeHomePage01;
import actiTimePageFactory.ActitimeLoginPage01;
import actiTimePageFactory.ActiTimeTaskPage01;

public class ActiTimeExecutionClass01 {

	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost/login.do");
	
		ActitimeLoginPage01 a = new ActitimeLoginPage01(driver);
		a.setActiTimeUsername();
		a.setActiTimePassword();
		a.VerifyLoginButton();
		Thread.sleep(3000);
		
		ActiTimeTaskPage01  b =new  ActiTimeTaskPage01 (driver);
		 b.setActiTimeTask();
		 b.setActiTimeFilterTask();
		 b.VerifyActiTimeApplyFilter();
		 Thread.sleep(3000);
		 
		 ActiTimeCreatePage1 c = new ActiTimeCreatePage1 (driver);
		 c.VerifyActiTimeCreatTask();
		 c.setActiTimeTaskName();
		 c.VerifyActiTimeCancle();
		 
		 ActitimeHomePage01  d = new ActitimeHomePage01 (driver);
		d.VerifyActiTimeLogo();
		Thread.sleep(3000);
		d.VerifyActiTimeLogoutButton();
		Thread.sleep(3000);
		driver.quit();
	}
}
