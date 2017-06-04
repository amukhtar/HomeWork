//2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them 
//from the user and prints their sum, product, difference and quotient (division). Use the techniques shown in Fig. 2.7.

import java.util.Scanner;
public class Q215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int numb1;
		int numb2;
		int sum;
		int product;
		int difference;
		int quotient;
		
		System.out.print("Enter first integer: ");
		numb1 = input.nextInt();
		System.out.print("Enter second integer: "); 
		numb2 = input.nextInt();
		
		sum = numb1 + numb2;
		product = numb1 * numb2;
		difference  = numb1 - numb2;
		quotient = numb1 /numb2;
		
		System.out.printf("Sum is %d\n", +sum);
		System.out.printf("Product is %d\n", +product);
		System.out.printf("Difference is %d\n", +difference);
		System.out.printf("Quotient is %d\n", +quotient);
	
	}

}
