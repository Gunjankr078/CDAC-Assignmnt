import java.util.Scanner;
import java.lang.String;

public class IsEligible {
	public static String iseligible(int age) {
		if(age>=18)
			return "Eligible";
		else 
			return "Not Eligible";
		
	
	}
	public static void main(String[] args) {
		
		System.out.println("Ënter your age :");
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		
		String res = iseligible(age);
		
	System.out.println(res);
		

	}

}
