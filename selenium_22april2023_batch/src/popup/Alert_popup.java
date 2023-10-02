package popup;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// url hit
		//driver.get("https://demo.guru99.com/test/delete_customer.php");

		// find element

		WebElement element = driver.findElement(By.xpath("//button[@id='alertButton']"));

		element.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();


		WebElement element2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));

		element2.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);


		WebElement element3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		element3.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("welcome");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println("yes");


		System.out.println("alert succesfully");

	}

}
