
public class EmpData {
	String name;
	int id;
	int sal;
	public EmpData(String name, int id, int sal) {
		
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	void displayEmp() {
		System.out.println(name +" "+id+" $"+sal);
	}
	
	

}
