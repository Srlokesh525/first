package com.lin.saturday;

import java.util.Scanner;

public class PlusMinus {
	static Scanner	sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of an array :");
		int n = sc.nextInt();
		int[] creation = creation(n);
		int[] insertion = insertion(creation);
		validation(insertion);
	}
	private static void validation(int[] insertion) {
		float res1 =0f ,res2 = 0f,res3 =0f;
		int positive = 0,negitive = 0,zero =0,count=0;
		for (int i = 0; i < insertion.length; i++) {
			if(insertion[i]>0)
			{
				positive++;
			}
			else if(insertion[i]<0)
			{
				negitive++;
			}
			else 
			{
				zero++;
			}
			count++;
		}
		
		res1 = (float)positive/count;
		res2 = (float)negitive/count;
		res3 = (float)zero/count;
		System.out.printf("%.6f \n",res1);
		System.out.printf("%.6f \n",res2);
		System.out.printf("%.6f",res3);
	
	}
	private static int[] insertion(int[] creation) {
		for (int i = 0; i < creation.length; i++) {
			System.out.println("Please enter the element of array at "+(i+1)+" position");
			creation[i] = sc.nextInt();
		}
		return creation;
	}
	private static int[] creation(int n) {
		int arr[] = new int[n];
		return arr;
	}

}
