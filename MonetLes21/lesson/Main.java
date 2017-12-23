package lesson;

public class Main {	
	
	public static void main(String[] args){
		Monet monet = new Monet();	
		int eagle = 0, tails = 0, k = 0;
		for (int i = 0; i < 100; i++){
			k = monet.variable();
			if (k == 0){
				tails++;
			} else if (k == 1){
				eagle++;
			}
		}
		System.out.println("Eagle/Tails = " + eagle + "/" + tails);
	}
	
}
