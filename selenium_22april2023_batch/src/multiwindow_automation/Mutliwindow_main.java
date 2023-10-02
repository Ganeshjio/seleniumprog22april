package multiwindow_automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Mutliwindow_main {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver d = new EdgeDriver();
		 d.manage().window().maximize();
		 d.manage().deleteAllCookies();
		
		 d.get("https://demo.automationtesting.in/Windows.html");
		 
		    WebElement click = d.findElement(By.xpath("//a[@href='#Tabbed']"));
			click.click();
			
			 WebElement next = d.findElement(By.xpath("//button[@class='btn btn-info']"));
			 next.click();
			 
			 String ParentPageId = d.getWindowHandle();	// For Parent Page ID
			 System.out.println("Home Page ID = "+ParentPageId);
			 
			 Set<String> ParentAndChildId = d.getWindowHandles();	// For Parent&Child Page ID
			 System.out.println("All Page ID = "+ParentAndChildId);
			 
				for(String r:ParentAndChildId)
				{
					if(!ParentAndChildId.equals(r))
					{
						d.switchTo().window(r);
						
					}
				
				}
				WebElement Download1 = d.findElement(By.xpath("//a[@class='nav-link']"));	 
				// stay on 2nd page
				Thread.sleep(2000);
				Download1.click();	// Click download on 2nd page
				Thread.sleep(2000);
				d.close();		// child  page closed   // this will switch the control to 2nd page 
				
				
				d.switchTo().window(ParentPageId);	// return switched to 1st page (Home Page)
				
				WebElement Click2 = d.findElement(By.xpath("//a[@href='#Multiple']"));// Selected 3rd option on Parent page
				Thread.sleep(2000);
				Click2.click();
				Thread.sleep(2000);
				WebElement Click3 = d.findElement(By.xpath("//button[@onclick=\"multiwindow()\"]")); 	// clicked on click option from parent page	
				Click3.click();
				Thread.sleep(2000);
				
				// logic for Download page
				
				Set<String> ParentAndChildID1 = d.getWindowHandles();		// For Multiple Page
				int size = ParentAndChildID1.size();
				System.out.println("No of tabs="+size);
					
				int i;
			    
				for(i=0; i<size; i++)
				{
				
						d.switchTo().window(ParentPageId); // this will switch the control to 2nd page 
						Thread.sleep(2000);
						System.out.println("Child title="+d.getTitle());
//				     	WebElement Download2 = driver.findElement(By.xpath("//a[@href='/downloads']"));
//						Download2.click();
						Thread.sleep(1000);
						//driver.close();
					}
				
				// logic for Registration page
				
				Set<String> ParentAndChildID2 = d.getWindowHandles();	
				
				for(String z:ParentAndChildID2)
				{
					if(!ParentAndChildID2.equals(z))
					{
						d.switchTo().window(z);		
					}
				}
				
				WebElement Login = d.findElement(By.xpath("//input[@id=\'email\']"));
				Login.sendKeys("8668971406");
				Thread.sleep(2000);
				
				WebElement Login1 = d.findElement(By.xpath("//img[@src=\'enter.png\']"));
				Login1.click();
				Thread.sleep(2000);
				Thread.sleep(2000);
				d.close();
				
                d.switchTo().window(ParentPageId);	// return switched to 1st page (Home Page)
				
				WebElement third = d.findElement(By.xpath("//a[@href='#Multiple']"));// Selected 3rd option on Parent page
				Thread.sleep(2000);
				third.click();
				Thread.sleep(2000);
				d.quit();
				d.close();
			}
				
				
	}


