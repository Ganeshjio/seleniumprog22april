package multiwindow_automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Naukri_pro {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.naukri.com/");
		String id = d.getWindowHandle();
		System.out.println("parent id = " + id);
		
		//to find id from parent plus child by using get WindowHandle();
		
		Set<String> ids = d.getWindowHandles();
		System.out.println("parent and child=" + ids);
		
		//to find counding for idd by using size() method
		
		int s = ids .size();
		System.out.println("the count of ids =" + s);
		
		//the close child pages from parent page by usingSwitchTo
		
		for (String child: ids)
		{
			if(!id.equalsIgnoreCase(child))
			{
			  d.switchTo().window(child);
			  System.out.println("child windows are="+d.getTitle());
			  Thread.sleep(3000);
			  d.close();
			  
			}
		}
		
	}

}
