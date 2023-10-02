package drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testsceniro_dropdown extends Launchbrow_dropdown {

	public void dropdown() throws InterruptedException {

		WebElement day = d.findElement(By.xpath("//select[@name='birthday_day']"));

		Select p1 = new Select(day);
		p1.selectByIndex(11);
		Thread.sleep(2000);
		WebElement month = d.findElement(By.xpath("//select[@title='Month']"));

		Select p2 = new Select(month);
		p2.selectByValue("10");
		Thread.sleep(2000);

		WebElement year = d.findElement(By.xpath("//select[@id='year']"));
		Select p3 = new Select(year);
		p3.selectByVisibleText("2011");
		
		List<WebElement> options = p3.getOptions();
		
		int count = options.size();
		System.out.println("Total count is= "+count);
		for (int i=0; i<count; i++) {
			String Text = options.get(i).getText();
			System.out.println(Text);
		}
		Thread.sleep(2000);
		
		
		
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
