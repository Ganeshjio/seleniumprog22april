package selenium_programme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class My_thirdFirefoxprogram {
	// Test scenario -1 verify that end user is able to see home page of Instagram

	//	Test Case - a) end user should open chrome browser 
	//				b) end user should hit the correct or valid link of Instagram
	//				c) validate that end user should see home page of Instagram
	// Writing test script for above scenario 
	// 1) Tester should have configuration of Selenium file.
	// 2) Tester should have a java library 
	// 3) Tester should create different package & Class for writing test script


	//WebDriver v = new FirefoxDriver();  

	public void m1()
	{
		// Step 1 - open firefox browser 
		// create a upcasting object of firefox browser
		WebDriver r = new FirefoxDriver();
		// Step 2 - hit the correct URL (TAKE THIS FROM developer or product owner)
		//write down or call to first non static method of a chrome driver object 
		//https://en.wikipedia.org/wiki/Instagram

		r.get("https://en.wikipedia.org/wiki/Instagram");



		r.manage().window().maximize();
		// Step -4 after completion of execution of test scenario every time close the browser 
		//	to close the browser call a selenium method

		r.quit();
		// Step 5 - Yes we can see home page of Instagram
	}


	public  static void main(String[]args)
	{
		My_thirdFirefoxprogram v = new My_thirdFirefoxprogram();
		// WebDriver r = new FirefoxDriver();
		v.m1();

	}
}