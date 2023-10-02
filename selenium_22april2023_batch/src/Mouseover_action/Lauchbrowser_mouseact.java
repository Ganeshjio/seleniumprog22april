package Mouseover_action;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Lauchbrowser_mouseact implements Comman_properties 
{

	WebDriver d;
	public void chromebrowser()  {
		ChromeOptions co = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumfile\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		co.setBinary("D:\\seleniumfile\\chrome-win64 (1)\\chrome-win64\\chrome.exe"); 
		
		System.out.println("launch chromebrowser");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		System.out.println("lauch chrome browser succesfully");
		
		//Thread.sleep(2000);
	}
	public void launchapplocation()
	{
		System.out.println("lauch chrome browser succesfully");

		d.get(Url);
		
	}
	public void edgebrowser() {
		
		System.out.println("launch edge browser succesfully ");
		  d= new EdgeDriver();
          d.manage().window().maximize();
          System.out.println("launch edge browser succesfully ");
         
	}

}
