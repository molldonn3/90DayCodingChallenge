package day2Calc;

import java.util.Scanner;

public class Calculator {
	
	
	private static Scanner sc;
	public static void main(String[] args) {
		//Make scanner to read what the user input is
		sc = new Scanner(System.in);
		//Using integers to test basic operations with basic numbers
		int n1, n2, result;
		//Asks for first number
		System.out.print("Enter your first number: ");
		n1 = sc.nextInt();
		
		// Read the operator as text, then get its first character.
		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = sc.next().charAt(0);
        
        
		//Asks for second number
		System.out.print("Enter your second number: ");
		n2 = sc.nextInt();
		
		
		
		//Checks which operator the user typed
		if (operator == '+') {
			result = n1 + n2;
			System.out.println("Result: " + result);
		} else if (operator == '-') {
            result = n1 - n2;
            System.out.println("Result: " + result);

        } else if (operator == '*') {
            result = n1 * n2;
            System.out.println("Result: " + result);

        } else if (operator == '/') {
            // Prevent division by zero.
            if (n2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                result = n1 / n2;
                System.out.println("Result: " + result);
            }

        } else {
        	//Handles if the user types an invalid operator
        	System.out.println("Invalid operator, must be +, -, *, or /");
        }
			//Close the scanner after reading input to avoid reading anymore keyboard input
			sc.close();
	}		
}
