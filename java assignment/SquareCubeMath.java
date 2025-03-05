import java.util.Scanner;

public class SquareCubeMath {
	
	public static int takeInput() {
		System.out.println("Enter A Number");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public void showOutput(double x) {
		System.out.println("Result is "+x);
	}
	public static void main(String[] args) {
		
		int x = takeInput();
		SquareCubeMath s = new SquareCubeMath();
		double res1= Math.pow(x, 2);
		double res2= Math.pow(x, 3);
		
		s.showOutput(res1);
		s.showOutput(res2);

	}

}
