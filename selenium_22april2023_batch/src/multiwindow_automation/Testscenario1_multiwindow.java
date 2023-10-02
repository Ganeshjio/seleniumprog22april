package multiwindow_automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testscenario1_multiwindow extends Launchbrowser_multiwindows  {
	
	//verify end user should send password in the password field of aplication
			//step-2launch browser succesfuly
			//hit coorect url in multiwindow application
			
			//user validate that password field by providing text
		
		public void automationtesting () throws InterruptedException
		{
			//parent id
					String parentID = d.getWindowHandle();
					System.out.println(parentID);
					WebElement seperate = d.findElement(By.xpath("//a[@href='#Seperate']"));
					seperate.click();
					WebElement click = d.findElement(By.xpath("//button[text()='click']"));
					click.click();
					
					
					//Parent child id
					Set<String> parentChildID = d.getWindowHandles();
					System.out.println(parentChildID);
					
					System.out.println("no of tab="+"size");
					for(String r:parentChildID) {
						
						if(!parentID.equals(r))
						{
							d.switchTo().window(r);
							d.manage().window().maximize();
							Thread.sleep(3000);
							WebElement documentation = d.findElement(By.xpath("//span[text()='Documentation']"));
							documentation.click();
							Thread.sleep(3000);
							d.close();
							Thread.sleep(3000);
						}	
					}
					
					
					d.switchTo().window(parentID);
					Thread.sleep(3000);
					WebElement parent1 = d.findElement(By.xpath("//a[@href='#Multiple']"));
					parent1.click();
					Thread.sleep(3000);
					d.quit();
					 
				}
}
