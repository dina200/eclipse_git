package myex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyExTestDrive {
	public static void main (String[] args) {
		String test = null;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			test = reader.readLine();
		} catch (IOException e) {
			System.out.print("Fault");
		}
		System.out.print("t");
		try {			
			doRisky(test);
			
		} catch (MyEx e) {
			System.out.print("a");
			
		} finally {
			System.out.print("w");
			System.out.print("s");
		}
		
	}
	static void doRisky(String t) throws MyEx {
		System.out.print("h");
		if ("yes".equals(t)){			
			throw new MyEx();
		}
		System.out.print("r");
		System.out.print("o");
	}
}
