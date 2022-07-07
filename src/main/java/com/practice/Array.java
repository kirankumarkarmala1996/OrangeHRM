package com.practice;
import java.util.Iterator;

public class Array {
	public static void main(String[] args) {
		int []num= {2,3,4,5,7,8};
		int targert =9;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
			if (num[i]+num[j]==9) {
				System.out.println(num[i]+","+num[j]);
			}
			
			}
		}
		
		
	}

}
