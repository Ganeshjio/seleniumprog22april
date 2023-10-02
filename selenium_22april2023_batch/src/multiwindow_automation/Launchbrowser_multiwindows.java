package multiwindow_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Launchbrowser_multiwindows implements Genralpro_multiwindow {

	WebDriver d;

	public void Chromebrowser() {

		System.out.println("launche chrome browser");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();

		System.out.println("lauch chrome browser succesfully");

	}

	public void launchapplocation()
	{
		System.out.println("lauch chrome browser succesfully");

		d.get(Url1);
	}

	public void edgebrowser() {

		System.out.println("edge chrome browser");
		d = new EdgeDriver();
		d.manage().window().maximize();

		System.out.println("launch edge browser succesfully ");

	}
}
