/*
 * Project Euler
 * Problem 2
 * 
 * Fibonacci Series: A series of numbers in which each number (Fibonacci number) 
 * 			is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
 * 
 * Note:
 * 		- Even numbers are 2n
 * 		- Odd numbers are 2n+1
 * 
 * Date: 27 October, 2016
 * Author: Muhannad Nouri
 * Description: Find the sum of even-valued Fibonacci terms up until 4 million.
 */
public class Problem2 {
	public static void main(String[] args)
	{
		int fib = 1;
		int fib2 = 2;
		int temp = 0;
		int sum = 0;

		while(temp < 4000000)
		{
			temp = fib2;
			
			if(temp % 2 == 0)
				sum = sum + temp;
			temp = fib + fib2;
			fib = fib2;
			fib2 = temp;
		}
		System.out.println(sum);
	}
}
