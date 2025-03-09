package cdacjavA;

import java.util.Scanner;

public class ElectricityBillCalculator {
	public static void billInRupee() {
		System.out.println("Enter the Unit consumed:");
		Scanner s  = new Scanner(System.in);
		int units = s.nextInt();
		
		int bill = 0;
		
		if (units >100) {
			bill = bill + 100*1;
			units = units - 100;
		}else {
			bill = bill + units*1;
			units = units-units;
		}
		if (units > 100) {
			bill = bill + 100*2;
			units =  units - 100;
		}else if (units>0) {
			bill = bill + units * 2;
            units = units - units;
        }

        if (units > 0) {
            bill = bill + units * 3;
        }
        
        System.out.println("Total bill for the given units is: Rs "+bill);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		billInRupee();

	}

}
