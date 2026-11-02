package day6LargestSmallest;
import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Asks user for 3 numbers
		System.out.print("Enter 3 numbers: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		
		//Start with the first number
		double largest = num1;
		double smallest = num1;
		
		if(num2 > largest) {
			largest = num2;
		}
		
		if(num2 < smallest) {
			smallest = num2;
		}
		
		if(num3 > largest) {
			largest = num3;
		}
		
		if(num3 < smallest) {
			smallest = num3;
		}
		
		System.out.println("Largest: " + largest);
		System.out.println("Smallest" + smallest);
		
		sc.close();
		
	}


}
