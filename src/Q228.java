//2.28 (Diameter, Circumference and Area of a Circle) Here’s a peek ahead. In this chapter, you
//learned about integers and the type int. Java can also represent floating-point numbers that contain
//decimal points, such as 3.14159. Write an application that inputs from the user the radius of a circle
//as an integer and prints the circle’s diameter, circumference and area using the floating-point value 3.14159 for π.

import java.util.Scanner;

public class Q228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner input = new Scanner(System.in);
				
			int r;	
				
			System.out.print("Enter the radius of the circle: ");	
			r = input.nextInt();
			System.out.printf("Diameter of the circle is %d\n", (2 * r));	
			System.out.printf("Circumference of the circle is %.2f\n", (2* (Math.PI) * r));	
			System.out.printf("Area of the circle is %.2f\n", ((Math.PI) * (r * r)));	

	}

}
