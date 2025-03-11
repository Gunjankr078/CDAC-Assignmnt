
public class ThisArgument {
	
	
	String customerName;
	double bankBal;
	double num;
	static String bankName ="WorldBank";
	static Double totalBankBalance=0.0;

	 public ThisArgument(String customerName , double bankBal ,double num){
		 
		 this.customerName = customerName;
		 this.bankBal = bankBal;
		 this.num = num;
		 totalBankBalance = totalBankBalance+bankBal;
		 
	 }
	 public void Display() {
		 
		 System.out.println("Customer Name  :"+customerName);
		 System.out.println("Customer Bank Bal :"+bankBal);
		 System.out.println("Customer Mob Num :"+num);
		 System.out.println("Bank Name  :"+bankName);
		 System.out.println("Bank total balance   :"+totalBankBalance);
		 
	 }
	

	
}


