import java.util.Scanner;

public class FindMax {
	
	public static void max() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of element in the array");
		int n = s.nextInt();
		int[] arr = new int[n];
	    System.out.println("Enter the Element of the Array");
	    for (int i = 0; i<n;i++) {
	    	arr[i] = s.nextInt();
	    }
		
	    int fMax = arr[0];
		for (int i=0;i<n;i++) {
			if (fMax < arr[i]) {
				fMax = arr[i];
			}
		}
			System.out.println("Maximum Number of the array: " +fMax);
			s.close();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  max();
	}

}
