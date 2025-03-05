import java.util.Scanner;

public class SquareM {
		
		public static int takeInput() {
			System.out.println("Enter A Number");
			Scanner s = new Scanner(System.in);
			return s.nextInt();
		}
		
		public static void showOutput(double x) {
			System.out.println("Result is : "+x);
		}
		 
		public static void main(String[] args) {
			int x = takeInput();
			SquareM a = new SquareM();
			double res1 = Math.pow(x, 2);
			double res2 = Math.pow(x, 3);
			
			a.showOutput(res1);
			a.showOutput(res2);
		}
		
}
