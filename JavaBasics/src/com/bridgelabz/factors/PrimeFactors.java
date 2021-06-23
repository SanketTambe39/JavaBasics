package com.bridgelabz.factors;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find factors :: ");
		int N = sc.nextInt();
		sc.close();
		
		System.out.println("Factors of "+N+" are ::");
		
		for(int i=2 ; i<=N ;i++)
		{
			int isPrime = 0;
			
			for (int j = 2 ; j<i ;j++ )
			{
				int remainder = i % j ;
				if (remainder == 0)
				{
					isPrime ++ ;
				}		
			}
			if (isPrime == 0)
			{
				while ((N % i) == 0)
				{
					
					System.out.println(i);
					N = N/i;
				}
			}
		}
	}
}
