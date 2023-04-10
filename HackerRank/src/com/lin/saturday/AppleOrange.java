package com.lin.saturday;

import java.util.Scanner;

public class AppleOrange {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Plesae enter the house points:");
		int s = sc.nextInt();
		int t = sc.nextInt();
		System.out.println("Please enter the apple tree point :");
		int a = sc.nextInt();
		System.out.println("Please enter the orange tree point :");
		int b = sc.nextInt();
		System.out.println("Please enter the number of apples :");
		int m = sc.nextInt();
		System.out.println("Please enter the number of oranges :");
		int n = sc.nextInt();
		int[] apples = new int[m];
		int[] oranges = new int[n];
		int[] appleInsertion = appleInsertion(apples);
		int[] orangeInsertion = orangeInsertion(oranges);
		int noOfApples = noOfApples(appleInsertion, a, s, t);
		int noOforanges = noOfOranges(orangeInsertion, b, s, t);
		System.out.println(noOfApples);
		System.out.println(noOforanges);

	}

	private static int noOfOranges(int[] or, int b, int s, int t) {
		int orangeCount = 0;
		for (int i = 0; i < or.length; i++) {
			int d = b + or[i];
			if (d >= s && d <= t) {
				orangeCount++;
			}

		}
		return orangeCount;
	}

	private static int noOfApples(int[] ai, int a, int s, int t) {
		int appleCount = 0;
		for (int i = 0; i < ai.length; i++) {
			int d = a + ai[i];
			if (d >= s && d <= t) {
				appleCount++;
			}

		}
		return appleCount;
	}

	private static int[] orangeInsertion(int[] oranges) {
		System.out.println("Enter the values for oranges :");
		for (int i = 0; i < oranges.length; i++) {
			oranges[i] = sc.nextInt();
		}
		return oranges;
	}

	private static int[] appleInsertion(int[] apples) {
		System.out.println("Enter the values for Apples :");
		for (int i = 0; i < apples.length; i++) {
			apples[i] = sc.nextInt();
		}
		return apples;
	}
}
