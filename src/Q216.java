//2.16 (Comparing Integers) Write an application that asks the user to enter two integers, obtains
//them from the user and displays the larger number followed by the words "is larger". If the numbers
//are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.

import java.util.Scanner;

public class Q216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int numb1;
		int numb2;
		
		
		System.out.print("Enter first integer: ");
		numb1 = input.nextInt();
		System.out.print("Enter second integer: "); 
		numb2 = input.nextInt();
			
	
			if (numb1 < numb2)
			System.out.print(+numb2+" is larger");
			
			if (numb2 < numb1)
				System.out.print(+numb1+" is larger");
			
			if (numb1 == numb2)
				System.out.print("These numbers are equal");
	}

}