package conditional_synchro;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	

		static WebElement dth;
		public static void main(String[] args) throws IOException, InterruptedException {
			WebDriver d = new EdgeDriver();// Upcasting Object 
			// Step 1 to Perform Explicit Wait
			WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(20) );
			d.manage().deleteAllCookies();
			d.manage().window().maximize();
			d.navigate().to("https://paytm.com/recharge");
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//Expliciwait = Waiting Time + Condition
			// Applicable for only specific webelement which does not behave properly
			WebElement dth = d.findElement(By.xpath("//a[@href='/dth-recharge']"));
			// Step 2 to Perform Explicit Wait
			dth = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/dth-recharge']")));
			// Step 3 to Perform Explicit Wait
			dth.click();
		}

	}


