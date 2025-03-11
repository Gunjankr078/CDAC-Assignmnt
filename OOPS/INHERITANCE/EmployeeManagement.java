
public class EmployeeManagement {
	
	public static void main(String[] args) {
		
		FullTimeEmp f1= new FullTimeEmp(1001,"Palash","Deployment",150000);
		PartTimeEmp f2= new PartTimeEmp(1002,"Gunjan","Development",6);
		f1.DisplayFullTimeEmployee();
		f2.DisplayPartTimeEmployee();
		f2.TotalCompensation();
	}
	

}
 