package cdacjavA;

import java.util.Scanner;

public class InvertedRightTriangle {
	
	public static void invertriangle() {
		System.out.println("Enter a number to print triangle: ");
		Scanner s  = new Scanner(System.in);
		int row = s.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invertriangle();
	}

}
