
public class Employee {
	static int totalComp =0;
	int empId;
	String empName;
	String dept;
	
	public Employee(int empId, String empName, String dept) {
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}
	void DisplayEmployee() {
		System.out.println("ID   : "+empId);
		System.out.println("Name : "+empName);
		System.out.println("Dept : "+dept);
	}
	void TotalCompensation() {
		System.out.println("Total Amount Spent By Company : "+totalComp);
	}
	
}
 class FullTimeEmp extends Employee{
	 int salary;
	 
	 public FullTimeEmp(int empId, String empName, String dept,int sal) {
		super(empId, empName, dept);
		this.salary= sal;
		totalComp= totalComp+salary;
	}
	 
	 void DisplayFullTimeEmployee() {
		 	super.DisplayEmployee();
			System.out.println("Salary of FullTime Employee : "+salary);
				
		}
	 
 }
 
 class PartTimeEmp extends Employee{
	 int hourlyRate = 1000;
	 int amountPaid;
	 int workTime;
	 
	 public PartTimeEmp(int empId, String empName, String dept, int workTime) {
		super(empId, empName, dept);
		this.workTime = workTime;
		this.CalculatePartSal() ;
		
		
		
	}
	 void CalculatePartSal() {
		 
		 amountPaid = hourlyRate*workTime*30;
		 totalComp= totalComp+amountPaid;
	 }
	 
	
			
	
	 void DisplayPartTimeEmployee() {
		 	super.DisplayEmployee();
		 	System.out.println("Total Salary OF PartTime Employee :"+amountPaid);
			
				
		}
		
	

	
 }