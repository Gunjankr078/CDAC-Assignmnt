import java.util.Scanner;

public class Swap {
	
	public static int takeInput() {
		System.out.println("Enter Values");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
		
	}
	
	
	
	public void swap(int a,int b) {
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("Valur of A after Swap is : "+a);
		System.out.println("Valur of B after Swap is : "+b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =takeInput();
		int b = takeInput();
		
		Swap s = new Swap();
		s.swap(a, b);
	}

}
