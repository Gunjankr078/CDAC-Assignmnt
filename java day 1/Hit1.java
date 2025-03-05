import java.util.Scanner;

public class Hit1 {

	public static int takeInput() {
		System.out.println("Enter A Number");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public static void showOutput(int x) {
		System.out.println("Result is "+x);
	}
	
	public int sum(int x , int y) {
		int sum = x+y;
		return sum;
		
	}
	
	public int mul(int x,int y) {
		return x*y;
	}
	
	//Main
	public static void main(String[] args) {
		int num1 = takeInput();
		int num2= takeInput();
		
		Hit1 a = new Hit1();
		int res = a.sum(num1,num2);
		showOutput(res);
		int res1=a.mul(num1,num2);
		showOutput(res1);
		
		
	}

}
