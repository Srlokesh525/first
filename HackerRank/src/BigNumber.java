import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		System.out.println("Enter first number");
		Scanner sc = new Scanner (System.in);
		BigInteger a = sc.nextBigInteger();
		System.out.println(a);
		System.out.println("Enter second number");
		BigInteger b = sc.nextBigInteger();
		System.out.println(b);
		//addition of two big integers.
		System.out.println(a.add(b));
		//Multiplication of two big integers
		System.out.println(a.multiply(b));

		}
	

}
