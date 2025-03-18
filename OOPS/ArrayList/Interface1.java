
public interface Interface1 {
    public abstract void processPayment(double amount);
    public abstract void validatePayment(boolean paid);
 
}

class Creditt1Card implements Interface1{
	boolean paid=false;
	public void processPayment(double amount){
		System.out.println("Paid $"+amount + "using Creditcard ending XXXXXXXX7865");
		 paid = false;
		 validatePayment(paid);
		 
		
	}
	
	public void validatePayment(boolean paid) {
		if(paid == true) {
			 System.out.println("Payment validated using Credit card ending XXXXXXXX7865");
		}
		else {
			System.out.println("Payment Failed");
		}
	}
}

class Debitt2Card implements Interface1{
	boolean paid=false;
    public void processPayment(double amount){
    	System.out.println("Paid $"+amount + "using Debit card ending XXXXXXXX7855");
    	paid = true;
		 validatePayment(paid);
	}
    
    public void validatePayment(boolean paid) {
    	if(paid == true) {
			 System.out.println("Payment validated using Credit card ending XXXXXXXX7865");
		}
		else {
			System.out.println("Payment Failed");
		}
	}
	
}

class Upi1 implements Interface1{
	boolean paid=false;
    public void processPayment(double amount){
    	System.out.println("Paid $"+ amount + "using UPI");
    	paid = true;
		 validatePayment(paid);
	}
    
    public void validatePayment(boolean paid) {
    	if(paid = true) {
			 System.out.println("Payment validated using Credit card ending XXXXXXXX7865");
		}
		else {
			System.out.println("Payment Failed");
		}
	}
	
}

class TestEcommere2{
	
	public static void main(String[] args) {
		Upi1 u = new Upi1();
		u.processPayment(5900);
        
        System.out.println("___________________________________");
        
        Debitt2Card d = new Debitt2Card();
        d.processPayment(5089.55);
        
        System.out.println("___________________________________"); 
        
        Creditt1Card c = new Creditt1Card();
        c.processPayment(57050.36);
        
        System.out.println("___________________________________");	}
}