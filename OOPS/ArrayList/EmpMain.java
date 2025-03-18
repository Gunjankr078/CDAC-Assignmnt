import java.util.ArrayList;

public class EmpMain {

	public static void main(String[] args) {
		
		EmpAllData e1 = new EmpAllData(); // 1st
		
		ArrayList<EmpData> eal5 = new ArrayList<>(); //2ns
		
		eal5 = e1.addEmp();
		
		
		e1.displayEmp(eal5);
		e1.updateEmp(eal5);

		e1.displayEmp(eal5);
		
		e1.deleteEmp(eal5);
		e1.displayEmp(eal5);
		
	}

}
