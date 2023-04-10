package com.lin.saturday;

import java.util.Scanner;

public class GradingStudents {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size of an array :");
		int n = sc.nextInt();
		int[] creation = creation(n);
		int[] is = insertion(creation);
		greading(is);
		// System.out.println((n+5)-(n%5));
	}

	private static void greading(int[] is) {
		for (int i = 0; i < is.length; i++) {
			if (is[i] > 37) {
				if ((is[i] + 5) - (is[i] % 5) - is[i] < 3) {
					System.out.println((is[i] + 5) - (is[i] % 5));
				} else {
					System.out.println(is[i]);
				}
			} else {
				System.out.println(is[i]);
			}
		}
	}

	private static int[] insertion(int[] creation) {
		for (int i = 0; i < creation.length; i++) {
			creation[i] = sc.nextInt();
		}
		return creation;
	}

	private static int[] creation(int n) {
		int arr[] = new int[n];
		return arr;
	}

}
