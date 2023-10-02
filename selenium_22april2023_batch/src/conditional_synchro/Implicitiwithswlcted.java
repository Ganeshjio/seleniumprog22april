package conditional_synchro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Implicitiwithswlcted {

	public static void main(String[]args)
	{
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://paytm.com/recharge");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement postpaid = d.findElement(By.xpath("//input[@id='radio1']"));

		boolean result = postpaid.isSelected();

		if(result == true) {
			System.out.println("Test Scenario is passed");
		}else {
			System.out.println("Test Scenario is Failed");
		}
		d.quit();
	}


}


