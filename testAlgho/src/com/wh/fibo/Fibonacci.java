package com.wh.fibo;

public class Fibonacci {

	
	int number = 0;
	
	public Fibonacci(int i){
		this.number = i;
	}
	
	public Fibonacci(){
		
	}
	
	
	public int getFibo() {
		
			int result = Fibo(this.number);
			return result;
		
	}


	
	public  int Fibo(int i){
		if( i == 0)
			return 0;
		else if(i == 1)
			return 1;
		else
			return Fibo(i - 1) + Fibo(i - 2);
	}

}
