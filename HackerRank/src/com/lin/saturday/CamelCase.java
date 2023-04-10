package com.lin.saturday;

public class CamelCase {

	public static void main(String[] args) {
		String s = "camelCase";
		String[] split = s.split("[A-Z]");
		System.out.println(split.length);
		
	}

}
