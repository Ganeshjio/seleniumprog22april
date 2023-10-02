package multiwindow_automation;

public class Execuation_multiwindow extends Testscenario1_multiwindow {
	
	public static void main(String[]args) throws InterruptedException
	{
		Execuation_multiwindow v = new Execuation_multiwindow();
		Genralpro_multiwindow.welcome();
		v.Chromebrowser();
		v.launchapplocation();
		v.automationtesting();
		Genralpro_multiwindow.automation();
	}
	
	

}
