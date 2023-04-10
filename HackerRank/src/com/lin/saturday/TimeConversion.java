package com.lin.saturday;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		if (time.contains("AM")) {
			String subString = time.substring(0, 8);
			String[] split = subString.split(":");
			int hour = Integer.parseInt(split[0]);
			String minute = (split[1]);
			String second = (split[2]);

			if (hour == 12) {
				hour = 0;
			}
			String s = Integer.toString(hour);
			if (s.length() == 1) {
				s = "0" + s;
			}
			System.out.println(s + ":" + minute + ":" + second);
		} else {
			String subString = time.substring(0, 8);
			String[] split = subString.split(":");
			int hour = Integer.parseInt(split[0]);
			String minute = (split[1]);
			String second = (split[2]);
			if (hour != 12) {
				hour = hour + 12;
			}
			String s = Integer.toString(hour);
			if (s.length() == 1) {
				s = "0" + s;
			}

			System.out.println(s + ":" + minute + ":" + second);
		}

	}

}
