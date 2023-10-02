package Drag_down_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_drag2 {

	public static void main(String[]args) throws InterruptedException
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://demoqa.com/droppable/");
		System.out.println("correct URL hit successfully");
		Thread.sleep(3000);

		WebElement element = d.findElement(By.xpath("//div[@id='draggable']"));
		element.click();
		Thread.sleep(3000);
		WebElement element1 = d.findElement(By.id("droppable"));
		element1.click();
		Thread.sleep(3000);

		Actions p = new Actions(d);
		p.clickAndHold(element).moveToElement(element1).release().build().perform();
		System.out.println("drag and drop using action successfully");
		Thread.sleep(2000);
		d.close();





	}

}
