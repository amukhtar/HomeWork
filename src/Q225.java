//2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even. 
//[Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple of 2 leaves a remainder of 0 when divided by 2.]

import java.util.Scanner;
public class Q225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Please Enter an integer");
		int number = input.nextInt();
		
		if(number%2 == 0){
			System.out.println("It is an even number");}
		else{
			System.out.println("It is an odd number");
		}
	}

}
