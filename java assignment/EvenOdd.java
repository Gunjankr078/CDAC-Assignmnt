package cdacjavA;

import java.util.Scanner;

public class EvenOdd {
	public static void evenOdd() {
		System.out.println("Enter Num to To Check Even Or Odd:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		String res = ( a % 2 == 0 ) ?+ a +" is Even.": " is Odd."; 
		System.out.println(res);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOdd();
		

	}

}
