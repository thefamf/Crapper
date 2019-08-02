package table;

import static org.junit.Assert.*;

import org.junit.Test;

public class RollTest {

	@Test
	public void testRoll() {
		Roll roll;
		for (int i = 0; i < 10; i++) {
			roll = new Roll();
			System.out.println(roll.toString());
			assertEquals(roll.getTotal(), roll.getDiceOne() + roll.getDiceTwo());			
		}		
	}

}
