package FibonacciNumber;

public class Solution {
	
	public int fib(int n) {
		
		if(n <= 1) {
		//if n is less than equal to 1
			
			return n;
			//return number n
		}
		
		return fib(n-1) + fib(n-2);
		//return n-1 + n-2
		
	}

}
