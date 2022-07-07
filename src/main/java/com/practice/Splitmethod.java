package com.practice;

public class Splitmethod {

	public static void main(String[] args) {
		String str = "kiran  kumar";
		String[] ss = str.split("kiran");
		int le = ss.length;
		System.out.println(le);

//		String[] ss=str.split(" ");
		// kirankumar

		for (String string : ss) {
			System.out.print(string);

		}

	}

}
