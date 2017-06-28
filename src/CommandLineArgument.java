//***************************************************************************************************
//6.15 (Command-Line Arguments)Rewrite Fig. 6.2 so that the size of the array is specified by the
//first command-line argument. If no command-line argument is supplied, use 10 as the default size
//of the array.
//***************************************************************************************************
 public class CommandLineArgument 
 {
    public static void main( String args[] )
    
    {
    	System.out.println("Since No Command Line arguments were passed, using the default values:");
		if (args.length == 0 )
        {
			int[] array = new int[10];
			System.out.printf("%s%8s%n", "Index" , "Value");
			for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n" , counter , array[counter]);
        }
        else
        {
          int arrayLength = Integer.parseInt( args[ 0 ] ); 
          int array[] = new int[ arrayLength ]; 

          int initialValue = Integer.parseInt( args[ 1 ] );
          int increment = Integer.parseInt( args[ 2 ] );
 
          for ( int counter = 0; counter < array.length; counter++ )
             array[ counter ] = initialValue + increment * counter;
 
          System.out.printf( "%s%8s\n", "Index", "Value" );

          for ( int counter = 0; counter < array.length; counter++ )
             System.out.printf( "%5d%8d\n", counter, array[ counter ] );
       }
    }
 } 