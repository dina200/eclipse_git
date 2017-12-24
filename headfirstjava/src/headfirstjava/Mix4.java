package headfirstjava;


public class Mix4 {
	int counter = 0;
	
	public int maybeNew(int index){
		if(index < 1){
		Mix4 m4 = new Mix4();
		m4.counter = m4.counter + 1;
		return 1;
		}
	return 0;
	}
}
