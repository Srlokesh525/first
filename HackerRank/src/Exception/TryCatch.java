package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int res = x/y;
			System.out.println(res);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
		}
	}

}
