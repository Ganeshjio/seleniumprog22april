package conditional_synchro;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launchbrowser_explicitwait implements Genralpro_explicitwait{
	static WebElement dth;
	WebDriver d;
	public void edgebrowser() {
		/*ChromeOptions co = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumfile\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		co.setBinary("D:\\seleniumfile\\chrome-win64 (1)\\chrome-win64\\chrome.exe"); 
*/
		d= new EdgeDriver();
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(20) );
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		System.out.println("launch edge browser succesfully ");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Expliciwait = Waiting Time + Condition
		// Applicable for only specific webelement which does not behave properly
		WebElement demo = d.findElement(By.xpath("//a[@class='demo-url']"));
		// Step 2 to Perform Explicit Wait
		demo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='demo-url']")));
		// Step 3 to Perform Explicit Wait
		demo.click();

	}


	public void launchapplocation()
	{
		System.out.println("lauch  apllictaion succesfully");

		d.get(url);

	}

	public void m1()
	{
		System.out.println(" all windows quit succesfully");
		d.quit();
	}
}