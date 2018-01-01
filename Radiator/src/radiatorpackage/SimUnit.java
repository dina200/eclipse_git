package radiatorpackage;

public class SimUnit {
	String botType;
	SimUnit (String type) {
		botType = type;
		System.out.println(botType);
	}
	 int powerUse() {
		 if ("Тепловая машина".equals(botType)) {			 
			 return 2;
		 } else {			 
			 return 4;
		 }
	}
}
