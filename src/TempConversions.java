//****************************************************************************************************
//5.22 - (Temperature Conversions) Implement the following integer methods:
//a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
//calculation
//celsius = 5.0 / 9.0 * (fahrenheit - 32);
//b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
//the calculation
//fahrenheit = 9.0 / 5.0 * celsius + 32;
//c) Use the methods from parts (a) and (b) to write an application that enables the user either
//to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
//Celsius temperature and display the Fahrenheit equivalent.
//***************************************************************************************************

import java.util.Scanner;
public class TempConversions {
public static int option = 0;

	public static void main(String[] args) {
		do{
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter 1 to convert Fahrenheit to Celsius:");
			System.out.println("Please enter 2 to convert  Celsius to Fahrenheit :");
			System.out.println("Please enter 3 to exit:");
			
				option = input.nextInt();		
			
				if (option==1){
					System.out.println("Please enter Fahrenheit temp");
					int ftemp = input.nextInt();
					System.out.printf("%d Fahrenheit equals %.02f Celsius.%n", ftemp, celsius(ftemp));
					
				}
				
			else if(option==2){
				System.out.println("Please enter temperature:");
				int ctemp = input.nextInt();
				System.out.printf("%d Celsius equals %.02f Fahrenheit.%n", ctemp, fahrenheit(ctemp));
			}
					
					}while(option != 3);
				
	}
	

	public static double celsius(int ftemp){
		
		return 5.0/9.0 * (ftemp -32);
		
	}
public static double fahrenheit(int ctemp){
	return 9.0/5.0 * ctemp +32;
	
	
}
}
