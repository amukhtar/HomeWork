//2.14 Write an application that displays the numbers 1 to 4 on the same line, with each pair of adjacent numbers separated by one space. Use the following techniques:
// a) Use one System.out.println statement.
// b) Use four System.out.print statements.
// c) Use one System.out.printf statement

public class Q214 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb1 = 1;
		int numb2 = 2;
		int numb3 = 3;
		int numb4 = 4;
		
		//All four numbers in one line with space and using just system.out
		System.out.println("Solution (a)");
		System.out.println(numb1+" "+numb2+" "+numb3+" "+numb4+" ");
		System.out.println();
		
		//All four numbers in one line with space and using 4 system.out
		System.out.println("Solution (b)");
		System.out.print(numb1+" ");
		System.out.print(numb2+" ");
		System.out.print(numb3+" ");
		System.out.print(numb4);
		System.out.println("\n");
		System.out.println();
		
		//All four numbers in one line with space and using 4 system.out
		System.out.println("Solution (c)");
		System.out.printf("%d %d %d %d", numb1,numb2,numb3,numb4);
	}

}
