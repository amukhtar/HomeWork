//******************************************************************************************************
//6.17 (Dice Rolling) Write an application to simulate the rolling of two dice. The application
//should use an object of class Random once to roll the first die and again to roll the second die. The
//sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
//the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
//least frequent. Figure 6.21 shows the 36 possible combinations of the two dice. Your application
//should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
//each possible sum appears. Display the results in tabular format.
//******************************************************************************************************
import java.util.Random;
import java.util.Arrays;
public class DiceRolling {

	public static void main(String args[]) {
		Random dice = new Random();
		int[] diceRolls = new int[36];
		int roll1;
		int roll2;

	
		for(int count = 0; count < 36000000; count++) {
			roll1 = (dice.nextInt(6) + 1);
			roll2 = (dice.nextInt(6) + 1);
			int row = 0;
			int column = 0;

			
			if(roll1 == 1) {
				row = 30;
			} else if(roll1 == 5){
				row = 24;
			} else if(roll1 == 4){
				row = 18;
			} else if(roll1 == 3){
				row = 12;
			} else if(roll1 == 2){
				row = 6;
			} else {
				row = 0;
			}

			
			if(roll2 == 6) {
				column = 5;
			} else if(roll2 == 5) {
				column = 4;
			} else if(roll2 == 4) {
				column = 3;
			} else if(roll2 == 3) {
				column = 2;
			} else if(roll2 == 2) {
				column = 1;
			} else {
				column = 0;
			}

			
			diceRolls[(row + column)] += 1;
		}

		
		System.out.printf("\t%d\t%d\t%d\t%d\t%d\t%d\n", 1, 2, 3, 4, 5, 6);	
		System.out.printf("----------------------------------------------------------------------");

		for(int table = 0; table < diceRolls.length; table++) {
			if( (table) % 6 == 0) {
				System.out.printf("\n%d|\t", (table / 6 + 1) );					
			}

			System.out.printf("%d\t", diceRolls[table]);
		}

		// Formatting
		System.out.println("");
	}
}