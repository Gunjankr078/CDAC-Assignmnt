import java.util.Scanner;

public class Divide {
	private static void divide(int a, int b) {
		int res;
		if (b==0) {
			throw new ArithmeticException("Deominator is greaterthan 0");
		}else {
			res = a/b;
			System.out.println(res);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter two numer two perform division");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		try {
			divide(a , b);

		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
	}

}
