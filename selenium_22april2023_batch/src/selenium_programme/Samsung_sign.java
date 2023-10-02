package selenium_programme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samsung_sign {
	
	public static void main(String[]args)
	{
		WebDriver d = new ChromeDriver();
		d.get("https://account.samsung.com/accounts/v1/MBR/signInGate?locale=en_IN&countryCode=IN&goBackURL=https:%2F%2Faccount.samsung.com%2Fmembership%2Fintro&returnURL=https:%2F%2Faccount.samsung.com%2Fmembership%2Fintro&redirect_uri=https:%2F%2Faccount.samsung.com%2Fmbr-svc%2Fauth%2FregistAuthentication&tokenType=OAUTH&response_type=code&client_id=ea2r064y73&state=IPNVjFsRWVamFqnxngqZxwoeyRYrPyZa ");
	    d.manage().window().maximize();	
	    System.out.println("lauch chrome browser succesfully");	
	    
	    //find web element// //using realative x path by attribute both password and signin
		 
	    WebElement name = d.findElement(By.xpath("//input[@id='iptLgnPlnID']"));
	    name.sendKeys("8668971406");
	    // //using realative x path by attribute both password and signin
		 
	    WebElement button = d.findElement(By.xpath("//*[@id=\"rememberID\"]/label/span"));
	    button.click();
	    
	    //using realative x path by attribute both password and signin
		 
	    WebElement  button1 = d.findElement(By.xpath("//*[@id=\"signInButton\"]"));
	    button1.click();
	    
	  
	    
	}

	
}
