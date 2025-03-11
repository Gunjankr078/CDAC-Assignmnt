
public class VehicleMain {

	public static void main(String[] args) {
		car c1 = new car("Mahidra", "ScorpioN", 2021, 1959999,5);
		car c2 = new car("jeep", "Wrangler", 2021, 2559999,6);
		truck t1 = new truck("TATA", "Signa-5533", 2021, 6559997, 120);
		truck t2 = new truck("TATA", "SignaPro-5533", 2021, 8559997, 420);
		c1.displayCar();
		c1.calculateInsurance();
		System.out.println("______________________________________");
		c2.displayCar();
		c2.calculateInsurance();
		System.out.println("______________________________________");
		t1.displayTruck();
		t1.calculateInsurance();
		System.out.println("______________________________________");
		t2.displayTruck();
		t2.calculateInsurance();
		
		
		
	}

}
