package thirdpackage;

public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "������� (�������)";
		
		while (beerNum > 0){
			
			if (beerNum == 1 || beerNum%10 == 1 && beerNum != 11 ){
				word = "�������";
			} else {
				word = "������� (�������)";
			}
			
			if (beerNum > 0){
				System.out.println(beerNum + " " + word + " ���� �� �����");
				System.out.println(beerNum + " " + word + " ����.");
				System.out.println("����� �� �����.");
				beerNum--;
			} else {
				System.out.println("��� ������� ���� �� �����");
			}
		
			
		}

	}

}
