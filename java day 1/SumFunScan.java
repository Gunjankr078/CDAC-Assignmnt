import java.util.Scanner;

public class SumFunScan {
		
	public static void add() {
		int a,b;
		int sum;
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter Two Num");
		a = s.nextInt();
		b=s.nextInt();
		
		sum = a+b;
		System.out.println("sum of "+a+" and " +b+ " is :"+sum);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();

	}

}
