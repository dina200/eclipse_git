package hfj_1;

import hfj_1.PuzzleB;

public class Puzzle {

	public static void main(String[] args) {
			PuzzleB[] obs = new PuzzleB [6];
			int y = 1, x = 0, result = 0;
			while (x < 6) {
				obs[x] = new PuzzleB();
				obs[x].ivar = y;		
				y = y * 10;
				x = x + 1;
			}
			x = 6;
			while (x > 0) { 
				x = x - 1;
				result = result + obs[x].doStuff(x);;
			}
			System.out.print(result);
		}
	}


