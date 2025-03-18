import java.util.Scanner;

public class Division {
	
	private static void divide(double a, double b) throws Exception {
		double res;
		if(b==0) {
			throw new Exception("Division by zero");
		}else {
			res = a/b;
			System.out.println(res);
		}
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter Two Num");
		Scanner s = new Scanner(System.in);
		double a = s.nextInt();
		double b = s.nextInt();
		try {
			
			divide(a ,b);
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		
		

	}

	

}
