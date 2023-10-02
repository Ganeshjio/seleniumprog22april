package selenium_programme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Instagram_generlization extends Launchbrowser_facebook1 {
	
	public void verifyinstagram()
	{
		WebElement email = d.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("Id-ashutoshbhujbal06@gmail.com");
		
		WebElement password = d.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("8177854753");
		
	}
	
	
	
	
	
		
	
	
      

		
	}



