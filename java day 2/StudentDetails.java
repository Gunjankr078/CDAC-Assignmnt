import java.util.Scanner;

public class StudentDetails {
	
	    public String name;
	    public int roll;
	    public int dob;
	    public int[] marks;
	    public int totalMarks;
	    public float per;
	
	public StudentDetails(String name,int roll, int dob ,int[]marks,int totalMarks,float per) {
		this.name=name;
		this.roll=roll;
		this.dob=dob;
		this.marks=marks;
		this.totalMarks=totalMarks;
		this.per= per;
		   
		
	}
	public static StudentDetails takeInput() {
		
		int size =5;
		int[] marks = new int[5];
		 int totalMarks=0;
		System.out.println("Enter Student Details");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Name :");
		String name =s.next();
		System.out.println("Enter Student's Roll No");
		int roll = s.nextInt();
		System.out.println("Enter Student DOB");
		int dob = s.nextInt();
		System.out.println("Enter Student Marks");
		for(int i=0;i<size;i++) {
			System.out.println("Enter Student Marks in subject");
			marks[i]=s.nextInt();
			totalMarks=totalMarks+marks[i];	
			
		}
		float per=(totalMarks)/5;
		//System.out.println("Total = "+totalMarks);
		//System.out.println("per = "+per);
		
		
		StudentDetails s1 = new StudentDetails(name,roll,dob,marks,totalMarks,per);
		return s1;
	
		
	}
	
	public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("DOB: " + dob);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage : " + per);
    }
	
	public static void main(String args[]) {
		StudentDetails s =  StudentDetails.takeInput();
		s.displayDetails();
		
	
	}
}
