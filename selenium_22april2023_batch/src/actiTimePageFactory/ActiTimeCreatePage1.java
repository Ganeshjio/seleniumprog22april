package actiTimePageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeCreatePage1 {
	//Declaration
    @FindBy(xpath="//div[@class='roundedBoxTag graphicButton button']") //div[@id='ext-gen32'
	private WebElement createTask;
	
    @FindBy(xpath="//input[@placeholder='Enter task name'])[1]")   //"//button[@id='ext-gen47']
	private WebElement taskName;
	
    @FindBy(xpath="//a[@id='ext-gen180']")  ////div[@id='createTasksPopup_cancelBtn']
    private WebElement cancle;
	WebDriver driver;
	//Initialization
	public ActiTimeCreatePage1 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void VerifyActiTimeCreatTask()
	{
		
		createTask.click();
	}
	
	public void setActiTimeTaskName()
	{
	    
		taskName.sendKeys("GK");;
	}
	
	public void VerifyActiTimeCancle() throws InterruptedException
	{
		cancle.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	}

}
