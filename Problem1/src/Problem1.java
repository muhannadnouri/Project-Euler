/*
 * Project Euler
 * Problem 1
 * 
 * Date: 27 October, 2016
 * Author: Muhannad Nouri
 * Description: Find the sum of all multiples of 3 and 5
 * 				for all numbers below 1000.
 */


public class Problem1 {
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i = 0; i < 1000; i++)
		{
			if(i % 3 == 0 || i % 5 == 0)
				sum = sum + i;
		}
	
		System.out.println("Answer: " + sum);
	}
}
