import java.util.Scanner;

public class ThisKeyword {
	
	String customerName;
	double bankBal;
	double num;
	static String bankName ="WorldBank";
	static Double totalBankBalance=0.0;

	 ThisKeyword(){

		 Scanner scn = new Scanner(System.in);
		 System.out.println("Enter Customer Name :");
		 customerName = scn.next();
		 System.out.println("Enter Customer Bank Bal : ");
		 bankBal = scn.nextDouble();
		
		 System.out.println("Enter Customer Mob Num :");
		 num = scn.nextDouble();
		 //scn.close();
		 totalBankBalance = totalBankBalance+bankBal;
	 }
	 public void Display() {
		 
		 System.out.println("Customer Name  :"+customerName);
		 System.out.println("Customer Bank Bal :"+bankBal);
		 System.out.println("Customer Mob Num :"+num);
		 System.out.println("Bank Name  :"+bankName);
		
		 
	 }
	 public static void DisplayTotal() {
		 System.out.println("Bank total balance   :"+totalBankBalance);
	 }
	 
	
	
}
