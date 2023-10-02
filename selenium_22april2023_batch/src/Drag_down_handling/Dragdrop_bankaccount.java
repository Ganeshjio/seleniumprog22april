package Drag_down_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop_bankaccount {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://demo.guru99.com/test/drag_drop.html");
		System.out.println("correct URL hit successfully");
		Thread.sleep(3000);
		
		
		WebElement element = d.findElement(By.id("credit2"));
		//element.click();
		//Thread.sleep(4000);
		WebElement element1 = d.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		//element1.click();
		Thread.sleep(5000);
		
		Actions b =  new Actions(d);
		Thread.sleep(3000);
		b.clickAndHold(element).moveToElement(element1).release().build().perform();
		Thread.sleep(3000);
		System.out.println("drag and drop using action successfully");
		Thread.sleep(3000);
		d.close();
		
		
	}

}
