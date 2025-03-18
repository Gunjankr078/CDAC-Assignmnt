import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		
		for(int ele : a) {
			System.out.println(ele);
		}

		System.out.println("______________________");
		
		a.set(2, 200);
		
		for(int ele : a) {
			System.out.println(ele);
		}
		
		System.out.println("______________________");
		
		a.remove(5);
		for(int ele : a) {
			System.out.println(ele);
		}
		System.out.println("______________________");
		
		
		System.out.println(a.get(4));
		
		System.out.println("______________________");
		System.out.println(a.size());
		System.out.println("______________________");
	}

}
