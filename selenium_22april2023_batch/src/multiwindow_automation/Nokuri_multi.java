package multiwindow_automation;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Nokuri_multi {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver d = new ChromeDriver();// Upcasting Object 
		TakesScreenshot ts=((TakesScreenshot)d); // DownCasting
		double g = 250;
		int f = (int)g;
		
		
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.aajtak.in/");
		Thread.sleep(3000);

		String path = "C:\\Users\\Ganesh kate\\Desktop\\image\\defect2.png";
		File source = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		// File Handling in Java
		File destination = new File(path);
		FileHandler.copy(source, destination);
		Thread.sleep(2000);
	}
	}


		