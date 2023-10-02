package conditional_synchro;
import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait {
	
		static WebElement button;
		public static void main(String[] args) throws IOException, InterruptedException {
			WebDriver d = new EdgeDriver();// Upcasting Object 
			// Step 1 to Perform Explicit Wait
			WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(20) );
			d.manage().deleteAllCookies();
			d.manage().window().maximize();
			d.navigate().to("https://www.amazon.in/");
			//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			//Expliciwait = Waiting Time + Condition
			// Applicable for only specific webelement which does not behave properly
		//WebElement button = d.findElement("//input[@id='twotabsearchtextbox']");
			// Step 2 to Perform Explicit Wait
			//WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
			// Step 3 to Perform Explicit Wait
			//button.click();
			// Fluent Wait = Waiting Time + Condition + Frequency
			 Wait w = new  FluentWait(d)       //FluentWait
					 .withTimeout(Duration.ofSeconds(20))
					 .pollingEvery(Duration.ofSeconds(4))
					 .ignoring(NoSuchElementException.class);
			 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox'")));
		
		button.click();      ////input[@id='twotabsearchtextbox'
		}

                   
}






































