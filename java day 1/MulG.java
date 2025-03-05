import java.util.Scanner;

public class MulG {

	public void mul() {
		int a,b,mul;
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter number to perform mul:");
	    a = s.nextInt();
	    b = s.nextInt();
	    mul = a * b;
	    System.out.println("Multiplication of "+a+" and "+b+" ="+mul);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulG x = new MulG();
		x.mul();

	}

}
