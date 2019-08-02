package table;

public class Game {

	int point;
	Roll roll;
	
	public Game() {
		point = 0;
		roll = new Roll();
	}
	
	public int[] comeOutRoll() {
		Roll roll = new Roll();
		if (roll.checkCraps()) {
			System.out.println(roll.toString() + "Result: Craps");
		}
		return null; 
	}
	
}
