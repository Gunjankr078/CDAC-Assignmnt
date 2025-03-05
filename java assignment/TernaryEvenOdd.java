import java.util.Scanner;

public class TernaryEvenOdd {
	public static int takeInput() {
		System.out.println("Enter A Number");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =takeInput();
		
		String check = (x%2==0) ? "Even" : "Odd"; 
		System.out.println(check);
	}

}
