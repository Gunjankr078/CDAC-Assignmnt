import java.util.Scanner;

public class Hit2 {

	public static int inp() {
		System.out.println("Enter Number:");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
		
	}
	
    public static void out(int res) {
    	System.out.println("Result is:" +res);
		
	}

    public int sub(int a, int b) {
    	return a-b;
	
    }
 
    public int div(int a, int b) {
    	//int res =a/b;
    	// return res;
    	//System.out.println("Result is :"+res);
    	
    	return a/b;
	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = inp();
		int b = inp();
		Hit2 x = new Hit2();
		int res = x.sub(a,b);
		x.out(res);
		int res1 = x.div(a, b);
		x.out(res1);
		

	}

}
