package fortest;

//import chap2.*;
public class ForTest {

	public static void main(String[] args) {
//		Dog dog = new Dog("Kolya");
//		dog.bark();
//		
//		Dog[] myDogs = new Dog[3];
//		
//		myDogs[0] = new Dog("Mark");
//		myDogs[1] = new Dog("Lyosha");
//		myDogs[2] = dog;
//		
//		System.out.println("The name of the last dog is " + myDogs[2].getName());
//			
//		for(int i = 0; i < myDogs.length; i++ ){
//			myDogs[i].bark();
//		}
		
		int[] index = new int[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		String[] islends = new String[4];
		islends[0] = "Бермуды";
		islends[1] = "Фиджи";
		islends[2] = "Азорские острова";
		islends[3] = "Косумель";
		
		int y = 0;
		int ref;
		while(y < 4){
			ref = index[y];
			System.out.println(islends[ref]);
			y++;
		}
	}

}
