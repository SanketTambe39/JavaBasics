package com.bridgelabz.evenodd;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter value you want to check ::");
		int N = sc.nextInt();
		
		sc.close();
		
		if (N % 2 ==0 )
		{
			System.out.println("The Given Number is EVEN	");
		}
		else
		{
			System.out.println("The Given Number is ODD");
		}
		
	}

}
