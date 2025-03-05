import java.util.Scanner;

public class LargestOfThreeNum {
	public static int takeInput() {
		System.out.println("Enter A Number");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	

	public static void main(String[] args) {
	int x= takeInput();
	int y= takeInput();
	int z= takeInput();
	
	if(x>y & x>z)
		System.out.println("num1  is largest among ("+x+","+y+","+z+") :"+x);
	else if(y>x & y>z)
		System.out.println("num2  is largest among ("+x+","+y+","+z+") :"+y);
	else 
		System.out.println("num3  is largest among ("+x+","+y+","+z+") :"+z);

	}

}
