import java.util.Scanner;

public class SumVoidG {
	
	public void add() {
		int a,b,sum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to perform sum:");
		a=s.nextInt();
		b=s.nextInt();
		sum=a+b;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumVoidG a = new SumVoidG();
		a.add();
		

	}

}
