package selenium_programme;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone_product {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver d = new ChromeDriver();
		
		Dimension p = new Dimension(1000,300);
        d.manage().window().setSize(p);
       
        Thread.sleep(3000);
        Point s = new Point(60,90);
        d.manage().window().setPosition(s);
        
		
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		
		
		 WebElement id = d.findElement(By.id("twotabsearchtextbox"));
		 id.sendKeys("mobile");
		 
		WebElement button = d.findElement(By.id("nav-search-submit-button"));
		 button.click();
		 
		System.out.println("Sucessfully process");
		
		d.close();
	}

}
