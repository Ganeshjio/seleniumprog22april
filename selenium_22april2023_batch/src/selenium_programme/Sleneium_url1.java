package selenium_programme;

public interface Sleneium_url1 {
	String URL1 = "https://en-gb.facebook.com/reg/";
	String URL2 = "https://www.phonepe.com/";
	
	default void welcomeInSelenium() {
		System.out.println("Welcome in Jurasic World of Selenium Automation");
	}
	
	void chromeLaunch();
	void edgeLaunch();
	void firefoxLaunch();
	void closeBrowser();
	void quiteBrowser();
	
	public static void tyfromSelenium() {
		System.out.println("Thank You and Hope you Enjoyed the Journy");
	}
}
