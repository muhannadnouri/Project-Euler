/*
 * Project Euler
 * Problem 3
 * 
 * Date: 27 October, 2016
 * Author: Muhannad Nouri
 * Description: Finds the largest prime factor of the number 600851475143
 */
public class Problem3 {
	public static void main(String[] args)
	{
		System.out.println("Prime Factors:");
		for(long j = 2; j < 600851475143L; j++)
		{
			if(600851475143L % j == 0 && isPrime(j) == true)
				System.out.println(j);
		}
		
	}
	
	/* Description: Check if integer entered is a prime number
	 * Argument: 	An integer number
	 * Returns: 	True/False depending on whether number is a prime or not
	 */
	private static boolean isPrime(long number)
	{	// prime number is divisible by 1 and itself only
		for(int i = 2; i <= number / 2; i++)
		{
			if(number % i == 0)
				return false;
		}
		
		return true;
	}
	
	
}
