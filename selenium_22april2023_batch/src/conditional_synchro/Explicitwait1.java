package conditional_synchro;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait1 {
	
	public static void main(String[]args)
	{   
		WebDriver d = new EdgeDriver();  //upcasting
		
		// Step 1 to Perform Explicit Wait
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(20));
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		// open url
		
		d.get("https://www.ebay.in/");
		
		//wait of second
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Expliciwait = Waiting Time + Condition
		// Applicable for only specific webelement which does not behave properly
		WebElement button = d.findElement(By.xpath("//header[@data-id='c9a6330']"));
		// Step 2 to Perform Explicit Wait
		button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header[@data-id='c9a6330']")));
		// Step 3 to Perform Explicit Wait

		button.click();
		
	}	
}
