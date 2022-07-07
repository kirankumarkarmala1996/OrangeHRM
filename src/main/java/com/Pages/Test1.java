package com.Pages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	public Testing test;
	@BeforeMethod
	public void base() {
		test=new Testing();
		
	}
	
	@Test
	public void test() {
		test.m1();
	}
	
	@Test
	public void test1() {
		test.m2();
	}
	
	

}
