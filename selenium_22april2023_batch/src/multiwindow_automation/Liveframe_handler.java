package multiwindow_automation;
	
	import java.io.File;
	import java.io.IOException;
	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
	
	public class Liveframe_handler {

		public static void main(String[] args) throws IOException, InterruptedException {
			
			WebDriver d = new ChromeDriver();// Upcasting Object 
			d.manage().deleteAllCookies();
			d.manage().window().maximize();
			d.navigate().to("https://demo.guru99.com/test/guru99home/");
			String parentID = d.getWindowHandle();
			System.out.println("Parent Window ID is "+parentID);
			Thread.sleep(2000);
			JavascriptExecutor j = ((JavascriptExecutor)d); // DownCasting
			j.executeScript("scroll(0, 2100)");
			Thread.sleep(3000);
			d.switchTo().frame("a077aa5e");
			d.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
			d.switchTo().defaultContent();
			Set<String> childID = d.getWindowHandles();
			System.out.println("childID is"+childID);
			for(String ch:childID) {
				if(!parentID.equals(ch)) {
					System.out.println("Switch the focus of selenium from main page to child page");
					d.switchTo().window(ch);
					Thread.sleep(2000);
					String path = "";
					WebElement element = d.findElement(By.xpath("//img[@height='59']"));
					File Source = element.getScreenshotAs(OutputType.FILE);
					File dest = new File(path);
					FileHandler.copy(Source, dest);
					d.close();
				}
			}
			d.switchTo().window(parentID);
			j.executeScript("scroll(0, -2100)");
			String path1 = " C:\\Users\\Ganesh kate\\Desktop\\seleniumscreenshot\\defect6.png";
			WebElement element1 = d.findElement(By.xpath("//img[@src='/logo.png']"));
			File Source1 = element1.getScreenshotAs(OutputType.FILE);
			File dest1 = new File(path1);
			FileHandler.copy(Source1, dest1);
			Thread.sleep(2000);
			d.quit();
		}		


}
