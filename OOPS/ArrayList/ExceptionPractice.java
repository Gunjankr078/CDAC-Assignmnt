import java.util.Scanner;

public class ExceptionPractice {
	
	private static void isEligible(int age) throws Exception {
		
		if(age<18) {
			throw new Exception();
		}else {
			System.out.println("Eligile to vote");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int age = s.nextInt();
		s.close();
		
		
		try {
			
			isEligible(age);
		}catch(Exception a) {
			System.out.println(a.getMessage());
			
		}
		
		
	}

	
}