package sea_fight;

import java.util.ArrayList;

public class DotCom {
	private String name; 
	private ArrayList<String> locationCells;
	
	public void setLocationCells(ArrayList<String> loc) {
		this.locationCells = loc;		
	}	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String checkYourself (String guess) {		
		String result = "Мимо";		
		int index = this.locationCells.indexOf(guess);		
		if (index >= 0){
			this.locationCells.remove(index);
			
			if (this.locationCells.isEmpty()) {
				result = "Потопил";
				System.out.println("Вы тотопили " + this.name + " :(");
			} else {
				result = "Попал";
			}			
		}
		return result;
	}
		
	
	
	
}
