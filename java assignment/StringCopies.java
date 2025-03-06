import java.util.Scanner;

public class StringCopies {
	
	 public static String stringCopies(String str, int n) {
	        if (n < 0) {
	            return "n should be a non-negative integer.";
	        }
	    
	        String res = "";
	        for (int i = 0; i < n; i++) {
	        	res += str;
	        }
	        return res;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		System.out.println("Enter a Positive Number :");
		int n = s.nextInt();
		System.out.println(stringCopies(str, n));
		
		         

	}

}
