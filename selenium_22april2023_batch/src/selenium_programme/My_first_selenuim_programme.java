package selenium_programme;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class My_first_selenuim_programme {
	// Test scenario -1 verify that end user is able to see home page of msrtc

		//	Test Case - a) end user should open chrome browser 
		//				b) end user should hit the correct or valid link of msrtc
		//				c) validate that end user should see home page of msrtc
	
		// Writing test script for above scenario 
		// 1) Tester should have configuration of Selenium file.
		// 2) Tester should have a java library 
		// 3) Tester should create different package & Class for writing test script

	public static void main(String[]args)
	{
		// Step 1 - open chrome browser 
				// create a upcasting object of chrome browser
		WebDriver v = new ChromeDriver();
		
		
		// Step 2 - hit the correct URL (TAKE THIS FROM developer or product owner)
		//write down or call to first non static method of a chrome driver object
		//linl:"https://msrtc.maharashtra.gov.in/"
		
		v.get("https://msrtc.maharashtra.gov.in/");
		
		
		// Step - 3 current browser is opening in minimize position according testing law we cannot test any application in minimised 
				// so we need to maximize it through selenium script.
				// Script to max chrome browser - call a method to manage the window size 
	
		v.manage().window().maximize();
		// Step -4 after completion of execution of test scenario every time close the browser 
				//	to close the browser call a selenium method
		v.quit();
		// Step 5 - Yes we can see home page of msrtc
		
	}

}
