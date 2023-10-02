package selenium_programme;

import org.openqa.selenium.WebDriver;        //url- driver.get("link");
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_title2 extends Selenium_title1 {
	
	WebDriver driver = new ChromeDriver();
	
	public void a1()
	{
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.isro.gov.in/");
		String ExpectedTitle="Indian Space Research Organisation";
		String actulTitle=driver.getTitle();
		System.out.println(actulTitle);
		if(ExpectedTitle.equals(actulTitle)) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fails");
		}
	
}
}