package com.lin.saturday;
import java.util.*;
public class Demo2{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Size of Array :");
		int n = sc.nextInt();
		int[] alice = alicearraycreation(n);
		int[] bob = bobarraycreation(n);
		int[] aliceValues = aliceinsertion(alice);
		int[] bobValues = bobinsertion(bob);
		 score(aliceValues,bobValues);
	}
	private static void score(int[] alice, int[] bob) {
		int alicePoints = 0;
		int bobPoints = 0;
		for (int i = 0; i < bob.length; i++) {
			if(alice[i]>bob[i]) {
				alicePoints++;
			} 
			else if(alice[i]<bob[i]) {
				bobPoints++;
			} 
		}
		String str = alicePoints+""+bobPoints;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]+" ");
			
		}
		
	}
	private static int[] bobinsertion(int[] bob)
			 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of alice :");
		for (int i = 0; i < bob.length; i++) {
			bob[i] = sc.nextInt();
		}
		return bob;
	}
	private static int[] aliceinsertion(int[] alice) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of bob:");
		for (int i = 0; i < alice.length; i++) {
			alice[i] = sc.nextInt();
		}
		return alice;
	}
	private static int[] bobarraycreation(int n) {
		int bob[] = new int[n];
		return bob;
	}
	private static int[] alicearraycreation(int n) {
		int alice[] = new int[n];
		return alice;
	}
}
