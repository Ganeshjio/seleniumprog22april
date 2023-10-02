package Mouseover_action;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Sceniro_mouse extends Lauchbrowser_mouseact {

	public void mouseapllication() {

		WebElement actionmouse = d.findElement(By.xpath("//button[@class='dropbtn']"));

		Actions k = new Actions(d);

		k.moveToElement(actionmouse).perform();
		//tagname
		//x path/tagname
		List<WebElement> ThreeWebelement = d.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		int count = ThreeWebelement.size();
		System.out.println("Total option is="+ count);

		for(int i=0; i<=count; i++) {

			WebElement element =  ThreeWebelement.get(i);
			String text = element.getAttribute("innerHTML");

			System.out.println("options are=" +text);

			if(text.equals("Appium"));
			{
				element.click();
				
					
				}

			}
	}
		
		public void close()
		{
			System.out.println("current window sucessfully colse");
			d.close();
		}
		
		
		public void quit()
		{
			System.out.println("all windows are sucessfully quit");
			d.quit();
		}
		
               


	}











