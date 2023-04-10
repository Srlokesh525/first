import java.util.Scanner;

public class ArrayUsingMethods {

	public static void main(String[] args) {
		System.out.println("Enter the Size of array:");
		Scanner scanner = new Scanner(System.in);
		//Creating Logic for Size of an array.
		int n = scanner.nextInt();
		int[] createArray = createArray(n);
		displayArray(createArray);
		int[] initializeArray = initializeArray(createArray);
		displayArray(initializeArray);
	}
	
	// Logic for printing the values of an array using 
	//for each loop (enhanced -for loop)
private static void displayArray(int[] createArray) {
	for (int i : createArray) {
		System.out.print(i+" ");
	}
	}

private static int[] initializeArray(int[] createArray) {
	System.out.println("Enter  "+createArray.length+" elements of an Array");
	Scanner scan = new Scanner(System.in);
	for (int i = 0; i < createArray.length; i++) {
	createArray[i]=scan.nextInt();	
	}
	return createArray; 
	}

public static int[] createArray(int n) {
	int a[] = new int[n];
	return a;
}
}
