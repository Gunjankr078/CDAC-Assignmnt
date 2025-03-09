/*Declare and initialize variables of all primitive data types and print their values.*/

package cdacjavA;

import java.util.Scanner;

public class Swap {
	public static int takeInput() {
		System.out.println("Enter Number to swap");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public static void swap(int a, int b) {
		 a = a^b;
	     b = a^b;
		 a = a^b;
		System.out.println("After Swapping: a = " + a + ", b = " + b);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = takeInput();
		int b = takeInput();
		swap(a,b);
		

	}

}
