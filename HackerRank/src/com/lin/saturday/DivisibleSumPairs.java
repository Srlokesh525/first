package com.lin.saturday;

import java.util.Scanner;

public class DivisibleSumPairs {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please enter the Size of an array :");
		int n = sc.nextInt();
		System.out.println("Please enter the key to check :");
		int k = sc.nextInt();
		int[] c = creation(n);
		int[] r = reading(c);
		divisibleSumPairs(c,k);
	}

	private static void divisibleSumPairs(int[] c,int k) {
		int count =0;
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if((c[i]+c[j])%k==0)
				{
					count++;
				}
			}
		}
		System.out.println(count);
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
