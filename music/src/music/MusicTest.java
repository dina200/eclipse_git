package music;
import javax.sound.midi.*;

public class MusicTest {
	public void play() {
		try {
			Sequencer player = MidiSystem.getSequencer();
			
			System.out.println("We have got the sequencer.");
		} catch(MidiUnavailableException e) {
			System.out.println("Fault");
		}
	}
	 public static void main(String[] args) {
		 MusicTest st = new MusicTest();
		 st.play();
	 }
}
