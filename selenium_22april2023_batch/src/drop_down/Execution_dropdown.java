package drop_down;

import Mouseover_action.Comman_properties;
import Mouseover_action.Execution_mouseclass;

public class Execution_dropdown extends Testsceniro_dropdown {
	 public static void main(String[]args) throws InterruptedException
	 {
		 Execution_dropdown v = new Execution_dropdown();
		 GenralproDropdown_handling.welcome();
		 v.chromebrowser();
		 v.launchapplocation();
		 v.dropdown();
		 v.close();
		 v.quit();
		 Thread.sleep(2000);
		 Comman_properties.automation();

}
}