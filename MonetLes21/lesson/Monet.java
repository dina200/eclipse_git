package lesson;

import java.util.*;

public class Monet {
	
	
	private int k = 0;
	
	public int variable (){
		Random rnd = new Random ();
		k = rnd.nextInt(2);
		if (k == 1){
			
			System.out.println("The eagle");
		} else if (k == 0){
			
			System.out.println("The tails");
		}
		return this.k;
	}	
}
