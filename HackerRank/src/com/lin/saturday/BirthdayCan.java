package com.lin.saturday;

import java.util.Scanner;

public class BirthdayCan {
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("please Enter the size of array :");
		int n = sc.nextInt();
		int[] creation = creation(n);
		int[] insertion = insertion(creation);
		int ismax = ismax(insertion);
		count(insertion,ismax);
	}
	private static void count(int[] insertion, int ismax) {
		int count =0;
		for (int i = 0; i < insertion.length; i++) {
			if(insertion[i]==ismax)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	private static int ismax(int[] insertion) {
		int max = insertion[0];
		for (int i = 1; i < insertion.length; i++) {
			if(insertion[i]>max)
			{
				max= insertion[i];
			}
		}
		return max;
	}
	private static int[] insertion(int[] insertion) {
		System.out.println("Enter the "+ insertion.length +" elements of array :");
		for (int i = 0; i < insertion.length; i++) {
			insertion[i] = sc.nextInt();
		}
		return insertion;
	}

	private static int[] creation(int n) {
	int arr[] = new int [n];
	return arr;
	}

}
