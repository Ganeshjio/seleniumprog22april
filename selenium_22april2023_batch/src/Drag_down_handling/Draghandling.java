package Drag_down_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Draghandling {

	public static void main(String[]args) throws InterruptedException
	{
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://jqueryui.com/droppable/");
		System.out.println("correct URL hit successfully");
		Thread.sleep(3000);

		d.switchTo().frame(0);
		WebElement element = d.findElement(By.xpath("//div[@id='draggable']"));
		element.click();
		WebElement element1 = d.findElement(By.xpath("//div[@id='droppable']"));
		element1.click();

		//drag and drop using action class
		Actions b =  new Actions(d);
		b.clickAndHold(element).moveToElement(element1).release().build().perform();
		System.out.println("drag and drop using action successfully");
		d.quit();


	}
}
