package multiwindow_automation;

import java.io.File;

import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Guru_multiwindow 
{
	public static  void main(String[]args) throws InterruptedException, IOException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/guru99home/");
		System.out.println("correct URL hit successfully");
		Thread.sleep(3000);
		JavascriptExecutor j = ((JavascriptExecutor)driver); // DownCasting
		j.executeScript("scroll(0, 2100)");
		driver.switchTo().frame("a077aa5e");//
		WebElement click = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		driver.switchTo().defaultContent();
		click.click();
		System.out.println("  click on Successfully");
		
		//j.executeScript("scroll(0, -2100)");
		//driver.switchTo().defaultContent();
		String ParentPageId = driver.getWindowHandle();		// For Parent Page ID
		System.out.println("Home Page ID = "+ParentPageId);

		Set<String> ParentAndChildId = driver.getWindowHandles();		// For Parent&Child  Page ID
		System.out.println("All Page ID = "+ParentAndChildId);


		for(String r:ParentAndChildId)
		{
			if(!ParentAndChildId.equals(r))
			{
				driver.switchTo().window(r);	

			}

		}
		System.out.println("Shift parent page to child page Successfully");
		j.executeScript("scroll(0, -2100)");
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div/div/div/div/div/div/div[1]/div/div/a/img"));
		File source = logo.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\Ganesh kate\\Desktop\\image\\guru.png";
		File destination = new File(path);
		FileHandler.copy(source, destination);
		System.out.println("Take ScreenShot Succesfully");

		WebElement Click1 = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div/div/div/div/div/div/div[1]/div/div/a/img"));
		Click1.click();
		System.out.println("Guru99 on click Successfully");


		String ParentPageId1 = driver.getWindowHandle();		// For Parent Page ID
		System.out.println("Home Page ID = "+ParentPageId);

		Set<String> ParentAndChildId1 = driver.getWindowHandles();		// For Parent&Child  Page ID
		System.out.println("All Page ID = "+ParentAndChildId);


		for(String a:ParentAndChildId1)
		{
			if(!ParentAndChildId1.equals(a))
			{
				driver.switchTo().window(a);	

			}	
		}
		System.out.println("Shift child page to child page1 Successfully");////input[@id='gsc-i-id1']
            
		WebElement search = driver.findElement(By.xpath("//input[@class='gsc-input"));//input[@class='gsc-input
		search.sendKeys("Selenium");      
		Thread.sleep(2000);
		System.out.println("Search get Successfully");  ////input[@name='search  ////div[@class='gsc-input-box
           Thread.sleep(1000);
		WebElement button = driver.findElement(By.xpath("//button[@class='gsc-search-button gsc-search-button-v2']"));
		button.click();
		
		driver.quit();

	}

	
	}


