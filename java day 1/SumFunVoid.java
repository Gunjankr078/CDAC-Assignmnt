import java.util.Scanner;

public class SumFunVoid {
	public int add() {
		int a,b,sum;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Two Num");
		a=s.nextInt();
		b=s.nextInt();
		sum = a+b;
		return sum ;
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumFunVoid a = new SumFunVoid();
		SumFunVoid c = new SumFunVoid();
		int total =a.add();
		System.out.println(total);
		
		int total1 =c.add();
		System.out.println(total1);
		

	}

}
