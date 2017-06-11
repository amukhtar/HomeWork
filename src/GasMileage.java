import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		

		      Scanner input = new Scanner( System.in );

		      int miles = 0; 
		      int gallons = 0; 
		      double mpg = 0.0; 
		      int total_miles = 0; 
		      int total_gallons = 0; 
		      double total_mpg = 0.0; 
		      int trips = 0; 

		      System.out.print( "Enter trip 1 mileage as integer or -1 to quit: ");
		      miles = input.nextInt(); 
		      if ( miles != -1 )
		      { 
		         System.out.print( "Enter trip 1 gallons as integer: ");
		         gallons = input.nextInt(); 
		         trips++; 
		      }

		     
		      while ( miles != -1 )
		      {
		         total_miles += miles; 
		         total_gallons += gallons; 
		         total_mpg = (double) total_miles / total_gallons;

		         mpg = (double) miles / gallons;        

		         System.out.printf( "Trip %d's mpg (miles per gallon) is %.1f\n", trips, mpg );
		   
		         if ( trips > 1 )
		         {
		            System.out.printf( "\n   Total miles of your %d trips is %d\n", trips, total_miles );
		            System.out.printf( "   Total gallons of your %d trips is %d\n", trips, total_gallons );
		            System.out.printf( "   Combined mpg if your %d trips is %.1f\n", trips, total_mpg );
		         }   

		         
		         trips++; 
		         System.out.printf( "\nEnter trip %d mileage (as integer) or -1 to quit: ", trips );
		         miles = input.nextInt();
		         if ( miles != -1 )
		         {
		            System.out.printf( "Enter trip %d gallons (as integer): ", trips );
		            gallons = input.nextInt();
		         }
		      } 

		      if ( total_miles != 0 )
		      {
		         System.out.printf( "\nFinal total miles driven is: %d\n", total_miles );
		         System.out.printf( "Final total gallons used is: %d\n", total_gallons );
		         System.out.printf( "Final combined mpg is: %.1f\n\n", total_mpg );
		      }
		      else
		         System.out.printf( "No trip information was entered.\n\n" );

		   } 
		}
