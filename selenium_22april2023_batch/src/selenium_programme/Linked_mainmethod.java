package selenium_programme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Linked_mainmethod {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver d = new EdgeDriver();
		d.get("https://www.linkedin.com/login ");
	   
		d.manage().window().maximize();
		System.out.println("chrome browser is launch");
		
		//find the web element  //using absoulate x path
		 WebElement email = d.findElement(By.xpath("html/body/div/main/div/div/form/div/input"));
		 email.sendKeys("kateganesh99@gmail.com");
		 
		 //using realative x path by attribute both password and signin
		 
		 WebElement password = d.findElement(By.xpath("//input[@name='session_password']"));
		 password.sendKeys("Linked@99");
		 
		 WebElement button = d.findElement(By.xpath("//button[@type='submit']"));
		 button.click();
		 Thread.sleep(5000);
	}

}
