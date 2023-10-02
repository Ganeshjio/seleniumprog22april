package selenium_programme;

public class Testexecution_linked4 extends Testsecniores_linked {

	public static void main(String[]args) throws InterruptedException
	{
		Testexecution_linked4 v = new Testexecution_linked4();
		Genralproperties_linked.welcome();
		v.Chromebrowser();
		v.verifyemailid();
		v.verifypassword();
		v.verifysignin();
		v.closebrowser();
		v.quite();
		
		Thread.sleep(3000);
		Genralproperties_linked.linked();
	}
}
