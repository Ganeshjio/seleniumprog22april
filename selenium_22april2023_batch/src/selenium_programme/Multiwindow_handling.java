package selenium_programme;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiwindow_handling {
	
	//Test Scenario-

	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver d = new ChromeDriver ();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		//scenario- click on new open seperate window
		//open child page
		//click on doccumentetion,close current window
		//writen on parent page
		//quit window
		d.get("https://demo.automationtesting.in/Windows.html");
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
		for(String r:parentChildID) {
			
			if(!parentID.equals(r))
			{
				d.switchTo().window(r);
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
