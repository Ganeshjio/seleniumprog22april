package liveframe;

public class Execuationclass_liveframe extends Scenario_liveframe {
	
	public static void main(String[]args)
	{
		Execuationclass_liveframe v = new Execuationclass_liveframe();
		
		Genralproperties_liveframe.welcome();
		v.chromebrowser();
		v.automationtesting();
		v.launchapplication();
		
	}

}
