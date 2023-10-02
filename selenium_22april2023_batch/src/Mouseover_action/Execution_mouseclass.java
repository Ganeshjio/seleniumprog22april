package Mouseover_action;

public class Execution_mouseclass extends Sceniro_mouse {
	
 public static void main(String[]args) throws InterruptedException
 {
	 Execution_mouseclass v = new Execution_mouseclass();
	 Comman_properties.welcome();
	 v.edgebrowser();
	 v.chromebrowser();
	 v.launchapplocation();
	 v.mouseapllication();
	 v.close();
	 v.quit();
	 Thread.sleep(2000);
	 Comman_properties.automation();
	 
 }
}
