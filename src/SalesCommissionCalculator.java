import java.util.Scanner;
public class SalesCommissionCalculator {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
     
      double totalsales = 0;
      double sales = 0;
      double comm = 0;
      System.out.println("Enter First sale  (0 to exit)");
       sales = input.nextInt();
       
      while(sales!=0)
      {

      	 System.out.println("Enter next sale (0 to exit)");
      	totalsales += sales;
      	 sales = input.nextInt();
      	 }
     
         comm = 200 + (.09*totalsales);
         System.out.println("Total sales by salesperson = "+ totalsales);
         System.out.println("salesperson's commission = "+ comm );
         
         }
     
    }
