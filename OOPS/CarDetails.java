
public class CarDetails {
	String carbrand;
	int carmodel;
	String carname;
	String carvariant;
	int carprice;
	String carcolor;
	int mileage1;
	String cartype;
	
	public void giveInput(String carBrand,int carModel,String carName,String carVariant,int carPrice,String carColor,int mileage,String carType) {
		 carbrand = carBrand;
		 carmodel = carModel;
		 carname = carName;
		 carvariant = carVariant;
		 carprice = carPrice;
		 carcolor = carColor;
		 mileage1 = mileage;
		 cartype = carType; 
	}
	
	public void displayCar() {
		System.out.println(carbrand);
		System.out.println(carmodel);
		System.out.println(carname);
		System.out.println(carvariant);
		System.out.println(carcolor);
		System.out.println(mileage1);
		System.out.println(cartype);
	}
}