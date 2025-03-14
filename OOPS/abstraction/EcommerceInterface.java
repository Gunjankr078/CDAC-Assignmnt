
public interface EcommerceInterface {
    public abstract void processPayment(double amount);
    public abstract void validatePayment();
}

class CredittCard implements EcommerceInterface{
	public void processPayment(double amount){
		System.out.println("Paid $"+amount + "using Creditcard ending XXXXXXXX7865");
	}
	
	public void validatePayment() {
		 System.out.println("Payment validated using Credit card ending XXXXXXXX7865");
	}
}

class DebittCard implements EcommerceInterface{
    public void processPayment(double amount){
    	System.out.println("Paid $"+amount + "using Debit card ending XXXXXXXX7855");
	}
    
    public void validatePayment() {
    	 System.out.println("Payment validated using Debit card ending XXXXXXXX7855");
	}
}

class Upi implements EcommerceInterface{
    public void processPayment(double amount){
    	System.out.println("Paid $"+ amount + "using UPI");
	}
    
    public void validatePayment() {
    	 System.out.println("Payment validated using UPI");
	}
}

class TestEcommere{
	public static void main(String[] args) {
		Upi u = new Upi();
		u.processPayment(5900);
        u.validatePayment();
        System.out.println("___________________________________");
        
        DebittCard d = new DebittCard();
        d.processPayment(5089.55);
        d.validatePayment();
        System.out.println("___________________________________"); 
        
        CredittCard c = new CredittCard();
        c.processPayment(57050.36);
        c.validatePayment();
        System.out.println("___________________________________");	}
}