
public class VehicleTypes {
	String manufactrurerName;
	String modelName;
	int year;
	float priceOfVehicle;
	
	public VehicleTypes(String manufactrurerName, String modelName, int year,float priceOfVehicle) {
		this.manufactrurerName = manufactrurerName;
		this.modelName = modelName;
		this.year = year;
		this.priceOfVehicle = priceOfVehicle;
	}
	
	public void displayVehicle() {
		System.out.println("Manufactured By: " +manufactrurerName);
		System.out.println("Model of the Vehicle: " +modelName);
		System.out.println("Manufactured in Year: " +year);
	}
	

void calculateInsurance() {
	double insurance1 = (priceOfVehicle*9)/100;
	double insurance2 = (priceOfVehicle*18)/100;
	
	if(priceOfVehicle > 1200000 && priceOfVehicle <3500000) {
		System.out.println("Insurance Premium(in Rs): "+insurance1);
	}else {
		System.out.println("Insurance Premium(in Rs): "+insurance2);
	}
}
	
}

class car extends VehicleTypes{
	int numberOfDoor;

	public car(String manufactrurerName, String modelName, int year, float priceOfVehicle, int numberOfDoor) {
		super(manufactrurerName, modelName, year, priceOfVehicle);
		this.numberOfDoor = numberOfDoor;
	}
	
	public void displayCar() {
		super.displayVehicle();
		System.out.println("Number of doors in the car: "+numberOfDoor);
	}
}





class truck extends VehicleTypes{
	int cargoCapacity;

	public truck(String manufactrurerName, String modelName, int year, float priceOfVehicle, int cargoCapacity) {
		super(manufactrurerName, modelName, year, priceOfVehicle);
		this.cargoCapacity = cargoCapacity;
	}
	
	public void displayTruck() {
		super.displayVehicle();
		System.out.println("Cargo Capacity (inTons): "+cargoCapacity);
	}
}


