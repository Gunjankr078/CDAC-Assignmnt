import java.util.Scanner;

public class EvenSquare {
	
	public static void evenCheck() {
		System.out.println("Enter the to Check Even or Odd: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if (num%2==0) {
			System.out.println(""+num+" is an Even Number & the Square of "+num+" is " +Math.pow(num, 2));
		}else {
			System.out.println(""+num+" is an odd Number & the Cube of "+num+" is " +Math.pow(num, 3));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		evenCheck();
	}

}
