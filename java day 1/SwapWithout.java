import java.util.Scanner;

public class SwapWithout {

	public static int inp() {
		System.out.println("Ëntered Numbers to swap:");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
		
	}
	
	public void swap(int a, int b) {
		a = a ^ b;
		b = a ^  b;
		a = a ^  b;
		System.out.println("A after Swapping is : "+a);
		System.out.println("B after Swapping is : "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapWithout x = new SwapWithout();
		int a = inp();
		int b = inp();
		x.swap(a, b);
	}

}

