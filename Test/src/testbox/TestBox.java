package testbox;

public class TestBox {
	Integer i = new Integer (20);
	int j;
	Boolean bool;
	
	public void go() {
		j = i;
		System.out.println(j);
		System.out.println(i);
	}
	
	public static void main (String[] args) {
		TestBox t = new TestBox();
		t.go();
	}
}
