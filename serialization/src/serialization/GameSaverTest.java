package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameSaverTest {
	private static ObjectInputStream is;

	public static void main(String[] args) throws ClassNotFoundException {
		GameCharacter one = new GameCharacter(50,"Elf", new String[] {"luk", "mech", "kastet"});
		GameCharacter two = new GameCharacter(200, "Troll", new String[] {"golie ruki", "bolshoy topor"});
		GameCharacter three = new GameCharacter(120, "Mag", new String[] {"zaklinania", "nevidimost"});
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(three);
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		one = null;
		two = null;
		three = null;
		
		try {
			is = new ObjectInputStream(new FileInputStream("Game.ser"));
			GameCharacter oneRestore = (GameCharacter) is.readObject();
			GameCharacter twoRestore = (GameCharacter) is.readObject();
			GameCharacter threeRestore = (GameCharacter) is.readObject();
			
			System.out.println("Tip pervogo:" + oneRestore.getType());
			System.out.println("Tip vtorogo:" + twoRestore.getType());
			System.out.println("Tip tretego:" + threeRestore.getType());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
