package com.lin.saturday;

import java.util.Scanner;
public class DiogonalDiff {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Enter the length of an array :");
		int n = sc.nextInt();
		int[][] creation = creation(n);
		int[][] insertion = insertion(creation);
		int ltrsum = ltrsum(insertion);
		int rtlsum = rtlsum(insertion);
		display(ltrsum,rtlsum);
	}
	private static void display(int ltrsum, int rtlsum) {
		int difference = ltrsum-rtlsum;
		if(difference<0)
		{
			difference*=-1;
		}
		System.out.println(difference);
	}
	private static int rtlsum(int[][] insertion) {
		int sum2=0;
		for (int i = 0; i < insertion.length; i++) {
			for (int j = 0; j < insertion.length; j++) {
				if((i+j)==(insertion.length-1))
				{
				sum2+=insertion[i][j];
				}
			}
		}
		return sum2;
		
	}
	private static int ltrsum(int[][] insertion) {
		int sum1=0;
		for (int i = 0; i < insertion.length; i++) {
			for (int j = 0; j < insertion.length; j++) {
				if(i==j)
				{
				sum1+=insertion[i][j];
				}
			}
		}
		return sum1;
	}
	private static int[][] insertion(int[][] creation) {
		for (int i = 0; i < creation.length; i++) {
			for (int j = 0; j < creation.length; j++) {
				System.out.println("enter the element of "+(i+1)+" row "+(j+1)+" column");
				creation[i][j]=sc.nextInt();
			}
		}
		return creation;
	}
	private static int[][] creation(int n) {
		int arr[][] = new int[n][n];
		return arr;
	}
}