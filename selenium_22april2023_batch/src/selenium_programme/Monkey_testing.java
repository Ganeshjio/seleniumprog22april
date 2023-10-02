package selenium_programme;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monkey_testing {
	
	//HL Scenario- verify that aaj tak home page working properly as per functionality
	//in any of the size/position of browser
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.aajtak.in/");
		Thread.sleep(2000);
		//any pre-requiste- need information about the final/last size of browser
		
		/*Dimension size = d.manage().window().getSize();
		System.out.println("height is="+ size.getHeight());
		System.out.println("width is="+ size.getWidth());
		*/
		//height is=832
		//width is=1552
		Dimension size1 = d.manage().window().getSize();
	      int h1 = size1.getHeight();
	       int w1 = size1.getWidth();
	       System.out.println(h1);
	       System.out.println(w1);
		d.quit();
	}

}
