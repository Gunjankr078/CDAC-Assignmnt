
public class Static {

	int stdId;
	String stdName;
	int stdClass;
	double stdMarks;
	String schName = "CDAC Public School";
	static int totalStudent = 0;
	
	public Static(int stdId,String stdName,int stdClass,int stdMarks) {
		this.stdId=stdId;
		this.stdName=stdName;
		this.stdClass=stdClass;
		this.stdMarks=stdMarks;
		totalStudent++;
		
	}
	
	public void displayStd() {
		System.out.println("Student Id/Roll: " +stdId);
		System.out.println("Student Name: " +stdName);
		System.out.println("Student Class: " +stdClass);
		System.out.println("Student Marks: " +stdMarks);
		System.out.println("School Name : " +schName);
	}
	
	public static void totalStudents() {
		System.out.println("total : " +totalStudent);
	}
	
}
