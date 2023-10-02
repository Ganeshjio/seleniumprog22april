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

public class Sbibank_screen {
	
	public static void main(String[]args) throws InterruptedException, IOException
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.bcci.tv/");
		
		Thread.sleep(4000);
		
		WebElement logo = d.findElement(By.xpath("//img[@alt='images']"));
		Thread.sleep(1000);
		File source = logo.getScreenshotAs(OutputType.FILE);
	
		String path = "C:\\Users\\Ganesh kate\\Desktop\\image\\mumbai.png";
		File destination = new File(path);
		FileHandler.copy(source, destination);
		d.close();
		
		
		
		
	}

}
