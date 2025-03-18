import java.util.ArrayList;
import java.util.Scanner;

public class EmpAllData {
	
	ArrayList<EmpData> eal = new ArrayList<>();
	
	
	public ArrayList<EmpData> addEmp() {
		
		EmpData e1 = new EmpData("Ram",1001,50000);
		EmpData e2 = new EmpData("shayam",1002,60000);
		EmpData e3 = new EmpData("radha",1003,54000);
		EmpData e4 = new EmpData("hari",1004,50500);
		eal.add(e1); // ArrayList.add(Employee 1)
		eal.add(e2);
		eal.add(e3);
		eal.add(e4);
		
		return eal;
		
		
	}
	public void updateEmp(ArrayList<EmpData> eal5) {
		System.out.println("Enter Employee Id to update sal");
		Scanner scn = new Scanner(System.in);
		int id = scn.nextInt();
		int sal = scn.nextInt();
		
		for(EmpData obj : eal5) {
			
			if(obj.id == id) {
				obj.sal = sal;
			}
		}
		
		
		
	}
	
	public void deleteEmp(ArrayList<EmpData> eal5) {
		System.out.println("Enter Employee Id to Delete Emp");
		Scanner scn = new Scanner(System.in);
		int id = scn.nextInt();
		int index=0;
		for(EmpData obj :eal5) {
			if(obj.id==id) {
				
				index  = eal5.indexOf(obj);  //ArrayList.indexOf(object)
			}
			 
		}
		eal5.remove(index);
		System.out.println("Records Deleted");
		
	}
	
	public void displayEmp(ArrayList<EmpData> eal1) {
		for(EmpData emp : eal1) {
			emp.displayEmp();
		}
		
		
	}
	
	
}
