package selenium_programme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my_selenium {
	//Test scenario-1. verify that end user to see the home page aaj tak
			//
			//Test case- 1.end user should open the chorme web browser
			//           2.end user should hit valid link of aaj tak
			//           3.validate end user should see home page of aaj tak
			
			// Writing down test script for above scenario 
					// 1) Tester should have configuration of Selenium file.
					// 2) Tester should have a java library 
					// 3) Tester should create different package & Class for writing test script
	
	public static void main(String[]args) throws InterruptedException
	{
		// Step 1 - open chrome browser 
		// create a upcasting object of chrome browser
		
		System.setProperty("WebDriver.Chorme.Driver","D:\\chormefile\\chromedriver_win32 ");
		WebDriver driver = new ChromeDriver();
		
		// Step 2 - hit the correct URL (take this developer or product owner)
				//write down or call to first non static method of a chrome driver object
				//https://www.aajtak.in/
		
		driver.get("https://www.aajtak.in/");
		
		// Step - 3 current browser is opening in minimize position according testing law we cannot test any application in minimised 
		// so we need to maximize it through selenium script.
		// Script to max chrome browser - call a method to manage the window size 
         //to timing to set in ml second waighting time
		
		Thread.sleep(1000);//waighting time
		driver. manage().window().maximize();
		Thread.sleep(2000);
		// Step -4 after completion of execution of test scenario every time close the browser 
		//	to close the browser call a selenium method
	
		driver. manage().window().minimize();
		Thread.sleep(5000);
		driver. manage().window().maximize();
		Thread.sleep(2000);
		//  hit the correct url 
		driver.get("https://www.isro.gov.in/");
		driver. manage().window().maximize();
		Thread.sleep(2000);
		driver. manage().window().minimize();
		Thread.sleep(5000);
		
		// Step -4 after completion of execution of test scenario every time close the browser 
		//	to close the browser call a selenium method
		

		driver.quit();
		// Step 5 - Yes we can see home page of aaj tak
		////      - Yes we can see home page of isro
		
		

	}

}
