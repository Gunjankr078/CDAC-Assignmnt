
public abstract class AbstractVehicle {
	int speed;

	float fuelCapacity;
	float mileage;
	
	public AbstractVehicle(int speed, float fuelCapacity, float mileage) {

		this.speed = speed;
		this.fuelCapacity = fuelCapacity;
		this.mileage = mileage;
	}
	abstract void Display(); 

	
	abstract void fuelEfficiency();

}
class Car1 extends AbstractVehicle{
	
	
public Car1(int speed, float fuelCapacity, float mileage) {
		super(speed, fuelCapacity, mileage);
		Display(); 
	}

void fuelEfficiency() {
	  float efficiency = (mileage/ fuelCapacity*2);
		System.out.println("Car :"+efficiency);
	}

void Display(){
	System.out.println(speed+"  "+ fuelCapacity+"  "+mileage);
}



	
}
class Bike extends AbstractVehicle{
	
	
	
public Bike(int speed, float fuelCapacity, float mileage) {
		super(speed, fuelCapacity, mileage);
		Display(); 
		
}
void fuelEfficiency() {
	  float efficiency = (mileage *2/ fuelCapacity);
	  System.out.println("Bike :"+efficiency);
	}
void Display(){
	System.out.println(speed+"  "+ fuelCapacity+"  "+mileage);
}

}
class Truck extends AbstractVehicle{
	
	
	
public Truck(int speed, float fuelCapacity, float mileage) {
		super(speed, fuelCapacity, mileage);
		Display(); 
	}
@Override
void fuelEfficiency() {
	  float efficiency = (mileage*100 / fuelCapacity);
	  System.out.println("Truck :"+efficiency);
	}
@Override
void Display(){
	System.out.println("Truck "+speed+"  "+ fuelCapacity+"  "+mileage);
}

}

class TestAbstraction{
	public static void main(String[] args) {
		Car1 c = new Car1(180, 20 ,21);
		c.fuelEfficiency();
		c.Display();
		Bike b = new Bike(140, 12,26);
		b.fuelEfficiency();
		Truck t = new Truck(90,60,18);
		
		
		
		t.fuelEfficiency();
	}

}

