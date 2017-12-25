package sea_fight;

public class DotCom {
	private int[] locationCells;
	private int numOfHits = 0;
	
	public String checkYourself (String guess) {
		
		int choice = Integer.parseInt(guess); 
		String result = "����";
		
		for(int cell : this.locationCells) {			
			if (choice == cell){
				this.numOfHits++;
				result = "�����";
				break;
			}
		}
		
		if (this.numOfHits == this.locationCells.length) {
			result = "�������";
		}	
		
		System.out.println(result);
		return result;
	}
	
	public void setLocationCells(int[] loc) {
		this.locationCells = loc;		
	}	
}