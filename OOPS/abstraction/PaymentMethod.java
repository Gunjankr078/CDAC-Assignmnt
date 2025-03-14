
public interface PaymentMethod {
	public abstract void pay(float amt);
	
}
class  CreditCard implements PaymentMethod{
	
	public void pay(float amt) {
		System.out.println("paid "+ amt + "using creditcard");
		
	}
}

class DebitCard implements PaymentMethod{
	public void pay(float amt) {
		System.out.println("paid "+ amt + "using Debitcard");
		
	}
}

class TestInterface{
	public static void main(String[] args) {
		
		DebitCard d = new DebitCard();
		d.pay(200);
		CreditCard c = new CreditCard();
		c.pay(5000);
		
	}
}