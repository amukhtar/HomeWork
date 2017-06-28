//********************************************************************************************************
//5.29 - (Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
//each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
//the coin appears. Display the results. The program should call a separate method flip that takes no
//arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
//simulates coin tossing, each side of the coin should appear approximately half the time.]
//********************************************************************************************************		
import java.util.Scanner;

public class CoinToss {
public static boolean flip() {
String[] choices = {"1","2"};
int length = choices.length;
int rand1 = (int) (Math.random()*length);
boolean result = false; // Default Tails
String num = choices[rand1];
if(num == "1") {
result = true; //Heads
}
return result;
}

public static void main(String[] args)
{
int input = 0;
while (input != -1){
System.out.println("Enter the number of times to toss or -1 to quit:");
Scanner scanner = new Scanner(System.in);
input=scanner.nextInt();
System.out.println();

int count_heads = 0;
int count_tails = 0;
for (int i=0; i< input; i++) {
if(flip())
count_heads++;
else
count_tails++;
}
if(input > 0)
System.out.println(count_heads + " Heads " + count_tails + " Tails ");
System.out.println();
//input = -1;
}
return;
}
}