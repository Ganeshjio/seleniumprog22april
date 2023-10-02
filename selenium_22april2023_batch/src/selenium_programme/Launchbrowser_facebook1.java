package selenium_programme;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launchbrowser_facebook1 implements Generproperties_facebook {

	WebDriver d;
	
	public void Chromebrowser()  {
		
		System.out.println("launche chrome browser");
		d = new ChromeDriver();
		d.manage().window().maximize();
	  
		System.out.println("lauch chrome browser succesfully");	
	}
	
	  public void launchapplication()
	  
	{
		System.out.println("lauching facebook application succesfully");
		d.get(url1);
	}
	
	public void edgebrowser()  {
		
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
    	 
    	  Thread.sleep(6000);
    	  d.quit();
    	
      }
}
