package day4NumberProperties;

import java.util.Scanner;

public class NumberProperties {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		
		//Reject non integer input
		if (!sc.hasNextInt()) {
			System.out.println("Invalid input. Please enter an integer.");
			sc.close();
			return;//Stops program
		}
		
	
		int number = sc.nextInt();
		
		//Determines if the number is positive, negative, or zero
		if(number > 0) {
			System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("Zero is neither positive nor negative.");
        }
		
		//Modulo (%) gives remainder after dividing, if remainder is 0, the number is even
		if (number % 2 == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
		
		sc.close();
	}
}