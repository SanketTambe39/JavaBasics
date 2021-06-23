package com.bridgelabz.harmonicnumber;

import java.util.Scanner;

public class Harmonic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit for getting harmonic number ::");
		int N = sc.nextInt();
		sc.close();
		double harmonicNumber = 0;
		if (0 < N && N <= 31)
		{
			for(double i= 1 ;i<=N ; i++) 
			{	
				harmonicNumber = harmonicNumber + ( 1 / i ) ;
			}
			System.out.println("The "+N+"th harmonic number is  " + harmonicNumber);
		}
		else
		{
			System.out.println("Not valid number");
		}
		
	}

}
