package day3TempConverter;

import java.util.Scanner;

public class TempConverter {
	public static void main(String[] args) {
		//Establish scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the temperature converter");
		
		double temp, tempConverted;
		
		System.out.println("Enter a temperature to convert from F to C or vice versa: ");
		temp = sc.nextDouble();
		
		System.out.println("Choose which unit to convert to: 'F' or 'C': ");
		char unit = sc.next().charAt(0);
		

		
		if(unit == 'F') {
			tempConverted =	(temp * 9.0/5.0) + 32;		
			System.out.println("The result is: " + tempConverted);
		} else if (unit == 'C') {
			tempConverted = (temp - 32) * 5.0/9.0;
			System.out.println("The result is: " + tempConverted);
		}
		
		sc.close();
		
	}
	
}
