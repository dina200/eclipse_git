package radiatorpackage;
import java.util.*;

public class V2Radiator {
	V2Radiator (ArrayList <SimUnit> list) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			
			SimUnit tmp = new SimUnit("V2радиатор");
			list.add(tmp);
//			sum += tmp.powerUse();
//			System.out.println("Радиатор2 " + sum);
		}		
	}
}
