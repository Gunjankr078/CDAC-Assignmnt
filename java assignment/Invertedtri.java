package cdacjavA;

import java.util.Scanner;

public class Invertedtri {
	
		public static void invtriangle() {
			System.out.println("Enter a number to print triangle: ");
			Scanner s  = new Scanner(System.in);
			int row = s.nextInt();
			
			for (int i = row; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invtriangle();
	}

}
