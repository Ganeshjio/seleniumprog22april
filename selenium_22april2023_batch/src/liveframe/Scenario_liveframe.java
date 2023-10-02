package liveframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Scenario_liveframe extends Launchbrowser_liveframe {
	
	//step-2launch browser succesfuly
	//hit coorect url in multiwindow application
	
	public void automationtesting()
	{
		// parent id
		
		WebElement first = d.findElement(By.xpath("//div[@class='ts-logo-category-block']"));
		first.click();
	}

}
