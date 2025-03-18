import java.util.Scanner;

public class Division1 {
	
	private static float divide(float a, float b)  {
		
			float res;
		if(b==0) {
			
			throw new ArithmeticException("Division By Zero");
			
		}else {
					res = a/b;
					return res;
		}
	
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter Two Num");
		Scanner s = new Scanner(System.in);
		float a = s.nextInt();
		float b = s.nextInt();
		float res;
		try {
			
			 res = divide(a ,b);
			 System.out.println(res);
			
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
			
		
		System.out.println("Print This");
		
		
		
	}

	

	

}
