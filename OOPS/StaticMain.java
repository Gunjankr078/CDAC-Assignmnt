import java.util.ArrayList;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static s1 = new Static(1001,"Gunjan",7,450);
		Static s2 = new Static(1002,"Palash",7,450);
		Static s3 = new Static(1003,"Vipul",7,450);
		s1.displayStd();
		s2.displayStd();
		s3.displayStd();
		Static s4 = new Static(1004,"Vipul",7,450);
		Static s5 = new Static(1005,"ipul",7,450);
		Static s6 = new Static(1006,"pul",7,450);
		 ArrayList<Static> staticList = new ArrayList<>();
	        for (int i = 0; i < 20; i++) {
	            Static s = new Static(1006, "pul", 7, 450);
	            staticList.add(s);
	        }
		
		Static.totalStudents();
		
		

	}

}

