import java.util.Scanner;

public class Argsum {

	private int a,b;
	public Argsum(int x,int y) {
		this.a=x;
		this.b=y;
	}
	public static int takeInput() {
		System.out.println("Enter A Number");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	public int sum(int x , int y) {
		int sum = x+y;
		return sum;
		
	}
	public static void main(String[] args) {
		int num1 = takeInput();
		int num2= takeInput();
		
		Argsum a = new Argsum(num1, num2);
		int res = a.sum(num1,num2);
		System.out.println(res);
		
	}

}
