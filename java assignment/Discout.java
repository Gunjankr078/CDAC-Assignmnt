import java.util.Scanner;
import java.lang.String;


public class Discout {

	
	public static float findDiscount(int x) {
		if (x>=5000) {
			System.out.println("Congratulation You're Eligible For 5% Discount");
			float dis = x-(x*5)/100;
			return dis;
			
			
		}
			else {
				System.out.println("Congratulation You're Eligible For 2% Discount");
				float dis = x-(x*2)/100;
				return dis;
			}
				

					
	}
	public static void main(String[] args) {
		System.out.println("Enter Name");
		Scanner s = new Scanner(System.in);
		String name= s.next();
		System.out.println("Enter the Amount");
		int amount = s.nextInt();
		float res =findDiscount(amount);
		System.out.println(res);
		

	}

}
