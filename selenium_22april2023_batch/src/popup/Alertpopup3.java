package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertpopup3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html ");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		// find locators
		
		  WebElement alert = driver.findElement(By.xpath("//input[@id='alertexamples']"));
		  
		  alert.click();
		  
		  Thread.sleep(3000);
		  
		  driver.switchTo().alert().accept();
		  
		  WebElement confirme = driver.findElement(By.xpath("//*[@id=\"confirmexample\"]"));  
		  confirme.click();
		  
		  Thread.sleep(3000);
		  
		  driver.switchTo().alert().accept();  //  this is a ok button use
		  //driver.switchTo().alert().dismiss();  // this is a cancel buuton
		  
		 WebElement prompte = driver.findElement(By.xpath("//input[@id='promptexample']"));
		  
		 prompte.click();
		 Thread.sleep(3000);
		 driver.switchTo().alert().sendKeys("this is for automation testing");
		 Thread.sleep(3000);
		 driver.switchTo().alert().accept();  
		 Thread.sleep(3000);
		 System.out.println("ok button");
		 
		 driver.close();
		  
		  

	}

}
