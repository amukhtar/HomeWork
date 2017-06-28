//*********************************************************************************************************************
//4.13 - (Factorials) Factorials are used frequently in probability problems. The factorial of a positive
//integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
//1 to n.Write an application that calculates the factorials of 1 through 20. Use type long. Display the
//results in tabular format. What difficulty might prevent you from calculating the factorial of 100?
//********************************************************************************************************************
public class Factorial {
    static long factorial(int n)
    {
        return ( n==0 ? 1 : n*factorial(n-1) );
    }
    public static void main(String[] args)
    {
        for (int n=0; n<=16; n++)
            System.out.println(n+"! = "+factorial(n));
    }
}
