package conditional_synchro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class Fluent4 {
	static WebElement button;
	public static void main(String[]args) {
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();

		d.get("https://www.ebay.in/");
		Wait w = new FluentWait(d)
				.withTimeout(Duration.ofSeconds(12))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

		WebElement button = d.findElement(By.xpath("//header[@data-id='c9a6330']"));
		 //button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header[@data-id='c9a6330']")));
		// Step 3 to Perform Explicit Wait

		button.click();
	}
}