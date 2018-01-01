package radiatorpackage;
import java.util.*;

public class V3Radiator {
	V3Radiator (ArrayList <SimUnit>  lglist) {
		
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			SimUnit tmp = new SimUnit("V3радиатор");
			lglist.add(tmp);
//			sum += tmp.powerUse();
//			System.out.println("Радиатор3 " + sum);
			
		}
	}
}
