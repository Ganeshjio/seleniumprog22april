package popup;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup1 {

	public static void main(String[]args) throws InterruptedException
	{
		WebDriver d = new ChromeDriver();

		d.get("https://the-internet.herokuapp.com/javascript_alerts");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();

		WebElement element = d.findElement(By.xpath("//button[@onclick='jsAlert()']"));

		element.click();
		Thread.sleep(3000);

		d.switchTo().alert().accept();


		WebElement element1 = d.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		element1.click();
		Thread.sleep(3000);

		d.switchTo().alert().accept();

		WebElement element2 = d.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		element2.click();
		Thread.sleep(3000);
		d.switchTo().alert().sendKeys("this is alert");  // provied name
		d.switchTo().alert().accept();  //click ok
		//d.switchTo().alert().dismiss();  // click cancel
		Thread.sleep(3000);
		System.out.println("sucesfully popup alert");  //
		d.switchTo().alert().getText();
		d.close();
	}

}

