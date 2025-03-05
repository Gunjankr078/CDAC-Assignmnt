import java.util.Scanner;

public class SquareCube {
	
	public static int takeInput() {
		System.out.println("Enter A Number");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public int square(int x) {
		return x*x;
		
	}
	public int cube(int x) {
		return x*x*x;
		
	}
	public void showOutput(int x) {
		System.out.println("Result is "+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = takeInput();
		SquareCube s = new SquareCube();
		int res1= s.square(x);
		int res2= s.cube(x);
		
		s.showOutput(res1);
		s.showOutput(res2);

	}

}
