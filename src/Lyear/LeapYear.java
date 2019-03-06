package Lyear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args){
		// TODO Auto-generated method stub
//int year ;
Scanner s=new Scanner(System.in);
System.out.println("Enter any year");
int year=s.nextInt();
		
		//if year is divisible by 4, it is a leap year
		
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is not a leap year");
	
	}

}
