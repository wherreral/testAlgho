package com.wh.fibo;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestFibo {

	private Fibonacci fib;
	
	@Before
	public void BeforeClass(){
		System.out.println("Aqui");
	}
	
	
	@Test
	public void test() {
		
		fib = new Fibonacci(6);
		int val = 8;
		assertTrue( val == fib.getFibo());
		
		
	}

	
	@Test
	public void test2() {
		
		fib = new Fibonacci(7);
		int val = 13;
		assertTrue( val == fib.getFibo());
		
	}	
	
	@Test
	public void test3() {
		
		fib = new Fibonacci(8);
		int val = 21;
		assertTrue( val == fib.getFibo());
		
	}
	
}
