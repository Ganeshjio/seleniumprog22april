package selenium_programme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_program {
	// Test scenario -1 verify that end user is able to see home page of hdfc,nasa

			//	Test Case - a) end user should open chrome browser 
			//				b) end user should hit the correct or valid link of hdfc,nasa
			//				c) validate that end user should see home page of hdfc,nasa
		
			// Writing test script for above scenario 
			// 1) Tester should have configuration of Selenium file.
			// 2) Tester should have a java library 
			// 3) Tester should create different package & Class for writing test script

	
	
	public  void m1() throws InterruptedException
	{
		// Step 1 - open chrome browser 
		// create a upcasting object of chrome browser
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		// Step 2 - hit the correct URL (TAKE THIS FROM developer or product owner)
				//write down or call to first non static method of a chrome driver object
		     //https://www.hdfcbank.com
		    //https://www.nasa.gov
		
		driver.navigate().to("https://www.hdfcbank.com/");
		
		// Step - 3 current browser is opening in minimize position according testing law we cannot test any application in minimised 
		// so we need to maximize it through selenium script.
		// Script to max chrome browser - call a method to manage the window size 

		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.manage().window().minimize();
		Thread.sleep(6000);
		driver.navigate().to("https://www.nasa.gov/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		
	
		Thread.sleep(5000);
		driver.navigate().back();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);

		WebDriver tab1 = driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(7000);
		
		// Step - current windows opening in to new tab 
		//	
		WebDriver window1 = driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(7000);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		System.out.println("succsfully");
		driver.quit();

	}

	public static void main(String[]args) throws InterruptedException
	{
		Selenium_program v = new Selenium_program();
		v.m1();
	}
}

