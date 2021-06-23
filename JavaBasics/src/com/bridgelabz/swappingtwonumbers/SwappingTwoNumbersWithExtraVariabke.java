package com.bridgelabz.swappingtwonumbers;

import java.util.Scanner;

public class SwappingTwoNumbersWithExtraVariabke {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number");
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter Second number");
		int secondNumber = sc.nextInt();
		
		sc.close();
		
		System.out.println("Before Swaping");
		System.out.println("The First number = "+firstNumber);
		System.out.println("The second number = "+secondNumber);
		
		int temp = firstNumber ;
		firstNumber = secondNumber ;
		secondNumber = temp ;
		
		System.out.println("After Swaping");
		System.out.println("The First number = "+firstNumber);
		System.out.println("The second number = "+secondNumber);
	}

}
