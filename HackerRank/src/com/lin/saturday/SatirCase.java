package com.lin.saturday;

import java.util.Scanner;

public class SatirCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int n = sc.nextInt();
		stairCase(n);
	}

	private static void stairCase(int n) {
		for (int i = 0; i <=n; i++) {
			for (int j = n; j >=i ; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
