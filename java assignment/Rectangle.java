package cdacjavA;

import java.util.Scanner;

public class Rectangle {
	public static void rec() {
		System.out.println("Enter Length and Breadth respectively:");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		int breadth = s.nextInt();
		
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= breadth; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec();
	}

}
