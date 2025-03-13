
public abstract class AbstractEmployee {
	String empName;
	int empId;
	float salary;
	public AbstractEmployee(String empName, int empId, float salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}
	
	abstract void calculateSal();
	abstract void displayEmp();
	
	
}

class FullTimeEmployee extends AbstractEmployee {
	float bonus;
	float sal;
	FullTimeEmployee(String empName, int empId, float salary, float bonus){
		super(empName, empId, salary);
		this.bonus = bonus;
		displayEmp();
	}
	
	void calculateSal() {
		sal = bonus + salary;
		System.out.println("Employee Salary : " +sal);
	}
	void displayEmp() {
		System.out.println("Details of full-time Employee : ");
		System.out.println("Employee Name : " +empName);
		System.out.println("Employee Id: " +empId);
		
		
	}
	
}

class ContractEmployee extends AbstractEmployee {
	int day;
	float sal;
	ContractEmployee(String empName, int empId, float salary, int day){
		super(empName, empId, salary);
		this.day = day;
		displayEmp();
	}
	
	void calculateSal() {
		sal = salary * day;
		System.out.println("Employee Salary : " +sal);
	}
	void displayEmp() {
		System.out.println("Details of Contractual Employee : ");
		System.out.println("Employee Name : " +empName);
		System.out.println("Employee Id: " +empId);
	
	}
}
 class TestEmployee{
	 public static void main(String[] args) {
		 FullTimeEmployee f = new FullTimeEmployee("Palash", 1001, 100000, 50000);
		 f.calculateSal();
		 System.out.println("_____________________________________________________");
		 ContractEmployee c = new ContractEmployee("Gunjan", 1002, 10000, 30); 
		 c.calculateSal();
		 
	 }
 }

