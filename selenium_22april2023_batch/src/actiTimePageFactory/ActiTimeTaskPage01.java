package actiTimePageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeTaskPage01 {

	//3 webElement
		//Declaration
		@FindBy(xpath="(//img[@src='/img/default/pixel.gif?hash=274618146'])[7]")
		private WebElement task;
		@FindBy(xpath="//input[@name='visiableFilterString']")
		private WebElement filterTask;
		@FindBy(xpath="//input[@id='tasksFilterSubmitButton']")
		private WebElement applyFilter;

		
		WebDriver driver;
		//Initialization
		public ActiTimeTaskPage01(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		//usage

		public void setActiTimeTask() throws InterruptedException
		{
			Thread.sleep(3000);
			task.click();
		}
		
		public void setActiTimeFilterTask()
		{
			filterTask.sendKeys("pqrs");
		}
		
		public void VerifyActiTimeApplyFilter()
		{
			applyFilter.click();
		}
		
}
