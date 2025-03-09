package cdacjavA;

import java.util.Scanner;

public class PrimeCheck {
	
	public static void check() {
		System.out.println("Enter Number to check it's Prime or not : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if  (num <= 1) {
			System.out.println(num+ " is not a prime number");
		}else if(isPrime(num)) {
			System.out.println(num+ " is a prime number");
		}else {
			System.out.println(num+ " is not a prime number");

		}
		
	}
	
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		check();
	}

}
