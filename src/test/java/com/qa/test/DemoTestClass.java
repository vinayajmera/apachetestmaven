package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestClass {
	
	@Test
	public void sum()
	{
		System.out.println("Sum");
		int a=10;
		int b=20;
		int sum =a+b;
		Assert.assertEquals(30, sum);
	}
	public void diff()
	{
		System.out.println("Diff");
		int a=10;
		int b=20;
		int diff =b-a;
		Assert.assertEquals(10, diff);
	}
	public void mul()
	{
		System.out.println("Mul");
		int a=10;
		int b=20;
		int mul =a*b;
		Assert.assertEquals(30, mul);
	}
	public void div()
	{
		System.out.println("Div");
		int a=10;
		int b=20;
		int div =b/a;
		Assert.assertEquals(30, div);
	}
	

}
