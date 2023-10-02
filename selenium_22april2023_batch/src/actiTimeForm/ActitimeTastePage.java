package actiTimeForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeTastePage {
	//3 WebElement
	//Declaration 
	private WebElement Task;
	private WebElement FilterTask;
	private WebElement CreateTask;
	WebDriver driver;
	
	// initialization
	public ActitimeTastePage(WebDriver driver) throws InterruptedException
	{
		Task = driver.findElement(By.xpath("(//img)[8]"));
		Thread.sleep(3000);
		FilterTask = driver.findElement(By.xpath("//input[@name='visiableFilterString']"));////input[@class='controlBorder']
		CreateTask = driver.findElement(By.xpath("//div[@id='ext-comp-1016']"));
	}
	//usage
	public void task()
	{
		Task.click();
	}
	public void FilterTask()
	{
		FilterTask.sendKeys("abcd");
	}
	public void CreateTask()
	{
		CreateTask.click();
	}
	
	
}
