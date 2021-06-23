 package com.bridgelabz.poweroftwo;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number until you want to see power of 2 ::");
		int N = sc.nextInt();
		sc.close();
		
		if (0 <= N && N <= 31)
		{
			for(int i=0 ;i<=N ; i++) 
			{
				System.out.println((int)Math.pow(2, i));
			}
		}
		else
		{
			System.out.println("Not valid number");
		}

	}

}
