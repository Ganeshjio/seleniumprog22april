package selenium_programme;

public class Testexecutionclass_facebook extends Testscenario_facebook2  {
	
	public static void main(String[]args) throws InterruptedException //throws InterruptedException
	{
		Testexecutionclass_facebook v = new Testexecutionclass_facebook();
		Generproperties_facebook.welcome();
		v.Chromebrowser();
		v.position();
		v.launchapplication();
		v.verifyemailid();
		v.verifypassword();
		v.verifylogin();	
		v.closebrowser();
		v.quite();
		Thread.sleep(3000);
		Generproperties_facebook.facebook();
		
		
		
	}
	
}
