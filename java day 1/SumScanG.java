import java.util.Scanner;

public class SumScanG {
	
	public static void add() {
		int a,b;
		int sum;
		System.out.println("ENTER NUM:");
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		sum=a+b;
		System.out.println("sum of "+a+" and "+b+" =" +sum);
				
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
	}

}
