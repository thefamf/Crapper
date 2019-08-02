package table;

import java.util.Random;

public class Roll {

	private int[] dice;
	private static int count = 0;
	
	public Roll() {
		dice = rollDice();
	}
	
	public int[] rollDice() {
		Random rand = new Random();
		int[] result = new int[3];
		result[1] = rand.nextInt(6) + 1;
		result[2] = rand.nextInt(6) + 1;
		result[0] = result[1] + result[2];
		count++;
		return result;
	}
	
	public int getDiceOne() {
		return dice[1];
	}
	public int getDiceTwo() {
		return dice[2];
	}
	public int getTotal() {
		return dice[0];
	}
	
	public boolean checkCraps() {
		return(dice[0] == 2 || dice[0] == 3 || dice[0] == 12); 
	}
	
	public boolean checkEleven(int[] roll) {
		return(roll[0] == 11); 
	}

	public boolean checkHardWays(int[] roll) {
		return(roll[1] == roll[2]); 
	}

	public boolean checkPointNumber(int[] roll) {
		return(roll[0] == 4 || roll[0] == 5 || roll[0] == 6 || roll[0] == 8 || roll[0] == 9 || roll[0] == 10 ); 
	}

	public boolean checkSeven(int[] roll) {
		return(roll[0] == 7); 
	}
	
	@Override
	public String toString() {
		String result = null;
		result = "Roll " + count + ": " + dice[1] + "," + dice[2] + " Total: " + dice[0];
		if (checkCraps()) {
			result += ", Craps";
		}
		if (checkEleven(dice)) {
			result += ", YO!";
		}
		if (checkHardWays(dice)) {
			result += ", Hard Ways";
		}
		return result;
	}
	
}
