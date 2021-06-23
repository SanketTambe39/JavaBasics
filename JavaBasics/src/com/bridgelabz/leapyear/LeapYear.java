package com.bridgelabz.leapyear;

import java.util.Scanner;
/**
 * class to check that the given year is a leap year or not
 * @author Sanket
 *
 */
public class LeapYear {

	public static void main(String[] args) {
		
		int year;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter year");
		year=sc.nextInt();
		sc.close();
		if(year>999 && year<=9999)
			checkLeapYear(year);
		else
			System.out.println("Please enter a valid year");
	}
/**
 * Name:checkLeapYear
 * 
 * Description: method to check given year is leap year or not
 * 
 * @param year
 * 
 * Modification: Added year 1582 from where the Gregorian calendar calender started
 * 
 */
	private static void checkLeapYear(int year) {
		if (year >= 1582) {
			if(((year%4==0)&&(year%100!=0))||(year%400==0))
			{
				System.out.println("You Just Enter A Leap Year "+year);
			}else
			{
				System.out.println("You Just Enter Not A Leap Year "+year);
			}
			
		} else {

				System.out.println("Entered a year which is not in the Gregorian calendar");
			
		}
	}

}
