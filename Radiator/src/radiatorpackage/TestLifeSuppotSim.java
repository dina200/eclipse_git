package radiatorpackage;
import java.util.*;

public class TestLifeSuppotSim {

	public static void main(String[] args) {
		ArrayList <SimUnit> aList = new ArrayList<SimUnit> ();
		V2Radiator v2 = new V2Radiator(aList);
		V3Radiator v3 = new V3Radiator(aList);
		for (int i = 0; i < 20; i++) {
			RetentionBot ret = new RetentionBot (aList);
			
		}
		
	}

}
