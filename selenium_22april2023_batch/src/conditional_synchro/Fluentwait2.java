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

public class Fluentwait2 {
	static WebElement button;
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver d = new EdgeDriver();// Upcasting Object 
		// Step 1 to Perform Explicit Wait
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(20) );
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.navigate().to("https://www.amazon.in/");
		 Wait w = new  FluentWait(d)       //FluentWait
				 .withTimeout(Duration.ofSeconds(9))
				 .pollingEvery(Duration.ofSeconds(3))
				 .ignoring(NoSuchElementException.class);
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-csa-c-content-id='nav_cs_electronics']")));
	
	button.click();      ////input[@id='twotabsearchtextbox'
	}

                  ////a[@data-csa-c-content-id='nav_cs_electronics']
}


