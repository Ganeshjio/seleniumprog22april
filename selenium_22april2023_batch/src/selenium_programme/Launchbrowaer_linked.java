package selenium_programme;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launchbrowaer_linked implements Genralproperties_linked{

	WebDriver d;
	public void Chromebrowser() {
		System.out.println("launche chrome browser");
		d = new ChromeDriver();
		d.manage().window().maximize();
	  
		System.out.println("lauch chrome browser succesfully");		
	}
	public void launchapplication() throws InterruptedException
	{
		System.out.println("lauching linked web site succesfully");
		d.get(url1);
		Thread.sleep(5000);
	}
	
	
	public void edgebrowser() {
		System.out.println("edge chrome browser");
		d = new EdgeDriver();
		d.manage().window().maximize();
		
		
		System.out.println("launch edge browser succesfully ");	
	}
	 public  void closebrowser() throws InterruptedException 
	  {
		  System.out.println("close browser successfully");
		 
		  Thread.sleep(6000);
	     
	  }
	   
	
     public  void quite() throws InterruptedException 
     {
   	  System.out.println("quite browser successfully");
   	 
   	 
   	
   	
     }

}
