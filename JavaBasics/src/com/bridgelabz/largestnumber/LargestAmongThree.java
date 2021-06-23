package com.bridgelabz.largestnumber;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first Number ");
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter second Number ");
		int secondNumber = sc.nextInt();
		
		System.out.println("Enter third Number ");
		int thirdNumber = sc.nextInt();
		
		sc.close();
		
		if ( firstNumber >= secondNumber && firstNumber >= thirdNumber ) 
		{		
			System.out.println("The Largest number is "+firstNumber);
		}
		
		else if ( secondNumber >= firstNumber && secondNumber >= thirdNumber ) 
		{		
			System.out.println("The Largest number is "+secondNumber);
		}
		else 
		{
			System.out.println("The Largest number is "+thirdNumber);
			
		}
		
	}

}
