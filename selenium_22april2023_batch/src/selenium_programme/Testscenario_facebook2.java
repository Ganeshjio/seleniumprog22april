package selenium_programme;

import org.openqa.selenium.By;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscenario_facebook2 extends Launchbrowser_facebook1 {
	
	//verify end user should send password in the password field of aplication
	//step-2launch browser succesfuly
	//hit coorect url in facebook
	//user able to see login page
	//user validate that password field by providing text
	//
	public void position() throws InterruptedException {
		 /*Dimension p =new Dimension(1100,250);
         d.manage().window().setSize(p);
		 */
	      Thread.sleep(3000);
	      
		   Point s  = new Point(50,80);
		   d.manage().window().setPosition(s);
	}
	public void verifyemailid()
	{
		//step 1-find the webelement
		
         WebElement email = d.findElement(By.id("email"));
         email.sendKeys("kateganesh99@gmail.com");
	      System.out.println("test scenario of verify emailid executed successfully"); 
	}

	
	public void verifypassword()
	{
		//step -find the webelement
	      WebElement password = d.findElement(By.id("pass"));
	      password.sendKeys("Facebook@99");
	      System.out.println("test scenario of verify password executed successfully");   
	}

	
	public void verifylogin()
	{
		//step -find the webelement
	   WebElement button = d.findElement(By.name("login"));
	     button.click();
	     System.out.println("facebook login successfully"); 
	}
	
	
}
