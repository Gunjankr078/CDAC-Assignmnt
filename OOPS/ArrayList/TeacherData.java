
public class TeacherData {
	int id;
    String name;
	int sal;
	public TeacherData(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	void displayTeacher() {
		System.out.println(id +" "+name+" $"+sal);
	}
	
	
}
