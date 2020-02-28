package com.cts.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.calculator.Calculator;

public class CalculatorTest {
	private static Calculator calculator;
	
	@Ignore
	@BeforeClass
	public static void init()
	{
		calculator=new Calculator();
		System.out.println("Object Created!!!");
	}
	@Ignore
	@AfterClass
	public static void destroy()
	{
		calculator=null;
		System.out.println("Object Destroyed!!!");
	}
	@Ignore
	@Test
	public void test_add_success() {
		assertEquals(17, calculator.add(12, 5));
		System.out.println("Inside add test");
	}
	@Ignore
	@Test
	public void test_sub_success()
{
	assertEquals(7, calculator.sub(5, 12));
	System.out.println("Inside sub test");
}
	@Ignore
	@Test
	public void test_mul_success()
{
	assertEquals(50, calculator.mul(10, 5));
	System.out.println("Inside mul test");
}
	@Ignore
	@Test
	public void test_div_success()
{
	assertEquals(2, calculator.div(10, 5));
	System.out.println("Inside div test");
}
	@Test
	public void test_to_check_prime_success()
	{
		assertEquals(true, calculator.isPrime(5));
	}
	
	@Test
	public void test_to_check_prime_fail()
	{
		assertEquals(false, calculator.isPrime(4));
	}	
}
