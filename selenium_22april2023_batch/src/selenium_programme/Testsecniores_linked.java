package selenium_programme;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class Testsecniores_linked extends Launchbrowaer_linked {
	

	//verify end user should send password in the password field of aplication
	//step 2- launch browser succesfuly
	//hit the coorect url1 in linked
	//user able to see in linked homee page
	//user validate that password field by providing text

	public void verifyemailid()
	{
		//find the web element
		 WebElement email = d.findElement(By.xpath("html/body/div/main/div/div/form/div/input"));
         email.sendKeys("kateganesh99@gmail.com");
	      System.out.println("test scenario of verify emailid executed successfully"); 
	
		
	      System.out.println("test scenario of verify emailid executed successfully"); 
	}
	
	public void verifypassword()
	{
		//find the web element
		 WebElement password = d.findElement(By.xpath("//input[@name='session_password']"));
		 password.sendKeys("Linked@99");
		 System.out.println("test scenario of verify password executed successfully");   
	}
	public void verifysignin()
	{
		WebElement button = d.findElement(By.xpath("/*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button "));
		button.click();
	}
	
	
  }
  
       


       

