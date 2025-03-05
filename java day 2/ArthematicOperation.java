import java.util.Scanner;

public class ArthematicOperation {
	public static int takeInput() {
		System.out.println("Enter A Number");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	 public int add(int x , int y) {
		 return x+y;
		 
	 }
	 public int sub(int x , int y) {
		 return x-y;
	 }
	 public int mul(int x , int y) {
		 return x*y;
	 }
	 public void div(float x , float y) {
		 if (y == 0) {
		       System.out.println("division by zero");
		    }
		 else {
			 float res  =x / y;
			 System.out.println("Result of divsion "+res);
		 }
	 }
	public void showOutput(int x) {
		System.out.println("Result is "+x);
	}
	
	
	
	
	public static void main(String args[]) {
		int x=takeInput();
		int y = takeInput();
		ArthematicOperation a = new ArthematicOperation();
		int res1 =a.add(x,y);
		int res2= a.sub(x, y);
		int res3= a.mul(x, y);
		 a.div(x, y);
		
		a.showOutput(res1);
		a.showOutput(res2);
		a.showOutput(res3);
		
		
	
		
	}

}
