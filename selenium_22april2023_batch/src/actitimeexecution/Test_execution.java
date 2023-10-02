package actitimeexecution;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import actiTimeForm.ActiTimeHomePgae;
import actiTimeForm.ActitimeloginPage;
import actiTimeForm.ActitimeTastePage;

public class Test_execution {

	public static void main (String [] args) throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ActitimeloginPage k = new ActitimeloginPage(driver);
		k.verifyUserName();
		k.verifyPassword();
		k.verifyLoginButton();
		Thread.sleep(3000);
		
		ActitimeTastePage m = new ActitimeTastePage(driver);
		m.task();
		m.FilterTask();
		m.CreateTask();
		Thread.sleep(2000);
		
		ActiTimeHomePgae c = new ActiTimeHomePgae(driver);
		c.verifyActiTimeLogo();
		c.verifyActiTimeLogout();
		Thread.sleep(2000);
		
		
		
		driver.close();
		
		
	}
}
