import java.util.Scanner;

public class CircleArea {
	public static void area() {
		System.out.println("Enter the Radius to calculate the area of the Circle: ");
		Scanner s = new Scanner(System.in);
		int rad = s.nextInt();
		
	    double area = (3.14159)*Math.pow(rad, 2);
	    System.out.println("The are of circle with radius "+rad+": " +area);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		area();
	}

}
