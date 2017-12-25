package sea_fight;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		int numOfGuesses = 0;
		
		DotCom dot = new DotCom();
		
		int randLocation = (int) (Math.random() * 4);
		
		int[] location = new int [3];
		location [0] = randLocation;
		for (int i = 1; i < location.length; i++) {
			location[i] = randLocation + i;
		}	
		
		dot.setLocationCells(location);
		
		boolean isAlive = true;	
		
		while(isAlive) {
			System.out.println("������� ��������: ");
			Scanner scanner = new Scanner(System.in);
			String choice = scanner.nextLine();	
			
			if (dot.checkYourself(choice).equals("�����")) {
				numOfGuesses++;
			}
			if(numOfGuesses == 3) {
				isAlive = false;
				System.out.println("���������� �������: " + numOfGuesses);
				break;
			}
		}
	}

}