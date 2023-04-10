package com.lin.saturday;

import java.util.Scanner;

public class BreakingTheRecords {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter the Size of an array :");
		int n = sc.nextInt();
		int[] c = creation(n);
		int[] r = reading(c);

		minMaxCount(c);

	}

	private static void minMaxCount(int[] c) {
		int minc = 0;
		int maxc = 0;
		int min = c[0];
		int max = c[0];
		for (int i = 0; i < c.length; i++) {
			
			if (c[i]<min) {
				min=c[i];
				minc++;
			}
			if (c[i]>max) {
				max = c[i];
				maxc++;
			}
		}
		System.out.println(maxc + " " + minc);
	}

	private static int[] reading(int[] c) {
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}
		return c;
	}

	private static int[] creation(int n) {
		int arr[] = new int[n];
		return arr;
	}

}