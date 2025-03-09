package cdacjavA;

public class InstanceStatic {

	String instance = "Hello world!";
	
	static String staticV = "By Java Programming";

public static void main(String[] args) {
	// TODO Auto-generated method stub
	InstanceStatic x = new InstanceStatic();
	
	System.out.println("Instance Variable: "+x.instance);
	System.out.println("Static Variable: "+staticV);	
}
}