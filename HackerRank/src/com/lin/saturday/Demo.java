package com.lin.saturday;

import java.util.Scanner;

class Demo{
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please enter the size of an Array");
		int size = scanner.nextInt();
		int[] array = createArray(size);
		int[] array1 = initializeArray(array);
		long arraySum = arraySum(array1);
		System.out.println("The sum of array elements :"+arraySum);
		
		
	}

	private static long arraySum(int[] array1) {
		long sum = 0;
		for (int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
		}
		return sum;
	}

	private static void display(int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] +" ");
		}
		
	}

	private static int[] initializeArray(int[] array) {
		System.out.println("Please enter "+array.length+" elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}

	private static int[] createArray(int size) {
		int array[] = new int[size];
		return array;
	}
}