
public class InstanceStatic { 
	
	static  int count =0 ; // static variable
	static int x=20;
	public static void display() {
		
		int a = 10; 	//instance variable or local variable
		count++; 	// static variable inside method
		x++;
		System.out.println(a); 	//instance variable print inside same method
	}
	
	public static void main(String args[]) {
		display();
	// System.out.println(a);		//instance variable print inside main method
	 System.out.println(count);
	 System.out.println(x);// static variable in  main
	}
}
