package multiwindow_automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Isro_screenshot {
	
	public static void main(String[]args) throws InterruptedException, IOException
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.isro.gov.in/");
		
		Thread.sleep(3000);
		
		String path = "C:\\Users\\Ganesh kate\\Desktop\\image\\isro.png";
		File source = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileHandler.copy(source, destination);
		Thread.sleep(3000);
		
		
	}
	
	
}
