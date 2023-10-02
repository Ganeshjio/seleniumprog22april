package selenium_programme;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class My_second_seleniumprog {
	
	// Test scenario -1 verify that end user is able to see home page of mahindra

			//	Test Case - a) end user should open chrome browser 
			//				b) end user should hit the correct or valid link of mahindra
			//				c) validate that end user should see home page of mahindra
			// Writing test script for above scenario 
			// 1) Tester should have configuration of Selenium file.
			// 2) Tester should have a java library 
			// 3) Tester should create different package & Class for writing test script

	public static void  main(String[]args)
	{
		// Step 1 - open microsoftedge browser 
		// create a upcasting object of microsoftedge browser
		WebDriver v = new EdgeDriver();
		// Step 2 - hit the correct URL (TAKE THIS FROM developer or product owner)
				//write down or call to first non static method of a chrome driver object
		        //https://en.wikipedia.org/wiki/Mahindra_%26_Mahindra
		
		v.get("https://en.wikipedia.org/wiki/Mahindra_%26_Mahindra ");
         v.manage().window().maximize();
      // Step -4 after completion of execution of test scenario every time close the browser 
			//	to close the browser call a selenium method
		
		v.quit();
		// Step 5 - Yes we can see home page of mahindra
	}
}
