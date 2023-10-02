package selenium_programme;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_usingpath {
	
	
public static void main(String[]args) throws InterruptedException
{
	WebDriver d = new ChromeDriver();
	d.get ("https://www.facebook.com/login/");

	d.manage().window().maximize();
  
	System.out.println("lauch chrome browser succesfully");	
	
		//find the web element   
		 WebElement email = d.findElement(By.xpath("//*[@id=\"email\"]"));
         email.sendKeys("kateganesh99@gmail.com");
	      System.out.println("test scenario of verify emailid executed successfully"); 
	
		//find the web element 
		WebElement password = d.findElement(By.xpath("//*[@id=\"pass\"]"));
		password.sendKeys("Facebook@99");
		 System.out.println("test scenario of verify password executed successfully");   

		WebElement button = d.findElement(By.xpath(" //*[@id=\"loginbutton\"]"));
		button.click();
		
	
	}
	
}
	
	

