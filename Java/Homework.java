public class Homework {

  public static void main (String [] arg) {

    char [] a = {'a', 'b', 'c', 'd', 'x', 'y', '1', '2', '3', '4'};  
    char [] b = {'p', 'q', '9', '8' ,'7', '6'}; 
    int  [] c = {6, 0, 1};

	  // Testing initializeArray
	  printArray(a);
    initializeArray(a);
    printArray(a);

	  // Testing selectionSort
	  printArray(b);
    selectionSort (b);
    printArray(b);

    // Testing factorial
	  System.out.println ( factorial (5) );
    System.out.println ( factorial (c[0] );
    System.out.println ( factorial (c[2] );
  }
  
}
