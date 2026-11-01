package day5LetterGrade;
import java.util.Scanner;

public class LetterGrade {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Enter a numerical grade (0-100): ");
		double grade = sc.nextDouble();
		
		//Set range for grades
		if (grade < 0 || grade > 100) {
			System.out.println("Invalid grade. Enter a number from 0-100");
		} else if (grade >= 90) {
			System.out.println("Letter grade: A");
        } else if (grade >= 80) {
            System.out.println("Letter grade: B");
        } else if (grade >= 70) {
            System.out.println("Letter grade: C");
        } else if (grade >= 60) {
            System.out.println("Letter grade: D");
        } else {
            System.out.println("Letter grade: F");
		}
		
		sc.close();
	}
}
