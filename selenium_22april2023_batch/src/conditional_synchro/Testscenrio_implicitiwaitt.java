package conditional_synchro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testscenrio_implicitiwaitt extends Launchbroe_ImplicitWait {

	public void impliciti()
	{
		WebElement paytmlogo = d.findElement(By.xpath("//a[@class='_3ZF2']"));
	boolean result = paytmlogo.isDisplayed();
	
	
	if(result==true)
	{
		paytmlogo.click();
		System.out.println("test scenrio pass successfully");
	}
	else {
		System.out.println("test scenrio fail successfully");
	}
	
	}
	public void close()
	{
		System.out.println("current window sucessfully colse");
		d.close();
	}


	public void quit()
	{
		System.out.println("all windows are sucessfully quit");
		d.quit();
	}
}
