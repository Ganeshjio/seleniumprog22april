package multiwindow_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sceniro_multi1 extends Launchbrowser_multiwindows {
	
	public void applicationauto() {
		
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.get("https://demo.automationtesting.in/Windows.html");

	String parentid = d.getWindowHandle();
	WebElement multiple = d.findElement(By.xpath("//a[@href='#Multiple']"));
	multiple.click();
	WebElement click = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button"));
	click.click();
	WebElement home = d.findElement(By.xpath("//a[@href='Index.html']"));
     home.click();

}
}