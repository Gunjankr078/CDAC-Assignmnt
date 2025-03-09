package cdacjavA;

import java.util.Scanner;

public class SquareCube {
	public static void squareCube() {
		System.out.println("Enter A Number To Find the Square And Cube:");;
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		int square = a*a;
		int cube = a*a*a;
		System.out.println("Square of "+a+" is :" +square);
		System.out.println("Cube of "+a+" is :" +cube);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squareCube();

	}

}
