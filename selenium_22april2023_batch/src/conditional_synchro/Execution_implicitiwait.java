package conditional_synchro;

public class Execution_implicitiwait extends Testscenrio_implicitiwaitt {

	public static void main(String[]args)
	{
		Execution_implicitiwait k = new Execution_implicitiwait();
		Genralproperties_ImplicitWait.welcome();
		k.edgebrowser();
		k.launchapplocation();
		k.impliciti();
		k.close();
		k.quit();
		Genralproperties_ImplicitWait.thanks();
	}
}
