package selenium_programme;

public class Selenium_url3 extends Selenium_url2 {    
	
	// TS1 - Verify that Actual URL is matching with expected URL of or not of Facebook App
		// TS2 - Verify that Actual Title is matching with expected Title of or not of Facebook App
		// Hint - getTitle();
		
		
		// Test steps - Steps to achieve the scenario
		// a) User launches browser successfully
		// b) User hits valid link successfully	
		// c) User should be able to see FB application Page successfully
		// d) User Validated Actual URL is matched with Expected URL of FB Application
		
		String ExpectedURL = "https://en-gb.facebook.com/reg/";
		// Test Script 
		public void verifyURL() throws InterruptedException {
			d.get(URL1);
			Thread.sleep(3000);
			String ActualURL = d.getCurrentUrl();// return Actual URL of page
			// Matching Expected = Actual 
			if (ExpectedURL.equals(ActualURL)) {
				System.out.println("Test Scenario Passed Successfully");
			}
			else {
				System.out.println("Test Scenario failed Successfully");
			}
		}
		
	}


