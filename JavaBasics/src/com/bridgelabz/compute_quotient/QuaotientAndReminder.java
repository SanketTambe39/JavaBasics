package com.bridgelabz.compute_quotient;

import java.util.Scanner;

public class QuaotientAndReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the divident :: ");
		double divident = sc.nextInt();
		
		System.out.println("Enter The divisor");
		double divisor = sc.nextInt();
		
		sc.close();


		System.out.printf("The Quotient of "+divident+" is %.2f",(divident/divisor));
		System.out.print(" The remainder is "+(divident%divisor));
		
	}

}
