package cdacjavA;

import java.util.Scanner;

public class SimpleCalculator {
	
	public static void calculator() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = s.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = s.nextInt();
		
		System.out.println("Click 1 for Additon");
		System.out.println("Click 2 for subtraction");
		System.out.println("Click 3 for multiplication");
		System.out.println("Click 4 for division");
		
		int operation = s.nextInt();
		
		int result = 0;
		
		switch(operation) {
		case 1:
			result = a + b;
			break;
		case 2:
			result = a - b;
			break;
		case 3:
			result = a * b;
			break;
		case 4:
			result = a / b;
			}
		System.out.println("The Result for the arithematic operation you have chosen = " +result);
		
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculator();
	}

}
