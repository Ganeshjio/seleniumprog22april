package liveframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launchbrowser_liveframe implements Genralproperties_liveframe {

	WebDriver d = new ChromeDriver();
	
	public void chromebrowser() {
		
		System.out.println("launche chrome browser");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		
		System.out.println("lauch chrome browser succesfully");
		
	}
	
	public void launchapplication()
	{
		System.out.println("launchapllication is succesfully");
		d.get(URL1);
	}
	
	public void edgebrowser() {
		
	   d = new EdgeDriver();
	   d.manage().window().maximize();
	   d.manage().deleteAllCookies();
	   
	   System.out.println("lauch edge browser succesfully");
			   
		   
			   
	}
	

}
