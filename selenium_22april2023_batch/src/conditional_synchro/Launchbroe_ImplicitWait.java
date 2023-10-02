package conditional_synchro;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launchbroe_ImplicitWait implements Genralproperties_ImplicitWait {

	WebDriver d;
	public void edgebrowser() {
		
		  d= new EdgeDriver();
		  WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(20));
        d.manage().window().maximize();
        d.manage().deleteAllCookies();
        System.out.println("launch edge browser succesfully ");
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
	}
	public void launchapplocation()
	{
		System.out.println("lauch  apllictaion succesfully");

		d.get(url);
		// When we use Implicit Wait - When we know exact time to load the webpage
				// Implicit Wait = Waiting Time [Specific]
				//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	}
}
