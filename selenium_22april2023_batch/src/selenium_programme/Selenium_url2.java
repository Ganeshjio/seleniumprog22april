package selenium_programme;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class Selenium_url2 implements Sleneium_url1  {

		WebDriver d;

		public void chromeLaunch() {
			System.out.println("Launching Chrome Browser");
			d = new ChromeDriver();
			d.manage().window().maximize();
			System.out.println("Chrome Browser Launched Successfully");
		}

		public void edgeLaunch() {
			System.out.println("Launching Edge Browser");
			d = new EdgeDriver();
			d.manage().window().maximize();
			System.out.println("Edge Browser Launched Successfully");
		}
		
		public void firefoxLaunch() {
			System.out.println("Launching Firefox Browser");
			d = new FirefoxDriver();
			d.manage().window().maximize();
			System.out.println("Firefox Browser Launched Successfully");
		}


		public void closeBrowser() {
			System.out.println("Closing Current TAB/Window of Browser");
			d.close();
			System.out.println("Closed Current TAB/Window Succesfully");
		}

		public void quiteBrowser() {
			System.out.println("Closing Browser");
			d.quit();
			System.out.println("Closed Browser Succesfully");
		}
		
	}


