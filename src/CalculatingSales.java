//******************************************************************************************************
//4.17 (Calculating Sales) An online retailer sells five products whose retail prices are as follows:
//Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
//Write an application that reads a series of pairs of numbers as follows:
//(a) product number
//(b) quantity sold
//Your program should use a switch statement to determine the retail price for each product. It
//should calculate and display the total retail value of all products sold. Use a sentinel-controlled
//loop to determine when the program should stop looping and display the final results.
//******************************************************************************************************
import java.util.Scanner;
public class CalculatingSales {

public static void main(String[] args) {

Scanner input =new Scanner(System.in);

double totalRetail=0;

while(true){

System.out.println("1 - Product 1, $2.98");
System.out.println("2 - Product 2, $4.50");
System.out.println("3 - Product 3, $9.98");
System.out.println("4 - Product 4, $4.49");
System.out.println("5 - Product 5, $6.87");
System.out.println("6 - Exit program");
System.out.print("Enter product number: ");
int productnumber=input.nextInt();

if(productnumber==6){
break;
}

System.out.print("Enter quantity sold: ");
int quantitySold=input.nextInt();

switch(productnumber){
case 1:
totalRetail+=2.98*quantitySold;
break;
case 2:
totalRetail+=4.50*quantitySold;
break;
case 3:
totalRetail+=9.98*quantitySold;
break;
case 4:
totalRetail+=4.49*quantitySold;
break;
case 5:
totalRetail+=6.87*quantitySold;
break;
}

System.out.println("\nThe total retail value of all products sold: $"+totalRetail);
}
}
}