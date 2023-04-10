import java.util.Scanner;

public class BArrayCreUsingMethod {

	public static void main(String[] args) {
		System.out.println("Enter the Size of BoolArray:");
		Scanner scanner = new Scanner(System.in);
		//Creating Logic for Size of an array.
		int n = scanner.nextInt();
		boolean[] createArray = createArray(n);
		// Logic for printing the values of an array using 
		//for each loop (enhanced -for loop)
		displayArray(createArray);
		boolean[] initializeArray = initializeArray(createArray);
		displayArray(initializeArray);
	}
	
private static void displayArray(boolean[] createArray) {
	for (boolean i : createArray) {
		System.out.print(i+" ");
	}
	}

private static boolean[] initializeArray(boolean[] createArray) {
	System.out.println("Enter  "+createArray.length+" elements of an BoolArrayArray");
	Scanner scan = new Scanner(System.in);
	for (int i = 0; i < createArray.length; i++) {
	createArray[i]=scan.nextBoolean();	
	}
	return createArray; 
	}

public static boolean[] createArray(int n) {
	boolean a[] = new boolean[n];
	return a;
}
}
