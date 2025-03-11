import java.util.Scanner;

public class StudentInput {


     String name;
     int roll;
     int dob;
     int[] marks;
     int totalMarks;
     float per;

public void takeInput() {
	
	int size =5;
	int[] marks = new int[5];
	 Scanner s = new Scanner(System.in);
	
	 System.out.println("Enter Student Details");
	
	
	System.out.println("Enter Student Name :");
	 name =s.next();
	
	System.out.println("Enter Student's Roll No");
	 roll = s.nextInt();
	
	System.out.println("Enter Student DOB");
	 dob = s.nextInt();
	 
	 
	System.out.println("Enter Student Marks");
	for(int i=0;i<size;i++) {
		System.out.println("Enter Student Marks in subject");
		marks[i]=s.nextInt();
		totalMarks=totalMarks+marks[i];	
		
	}
	 per=(totalMarks)/5;
	//System.out.println("Total = "+totalMarks);
	//System.out.println("per = "+per);

	
}

public void displayDetails() {
    System.out.println("\nStudent Details:");
    System.out.println("Name: " + name);
    System.out.println("Roll No: " + roll);
    System.out.println("DOB: " + dob);
    System.out.println("Total Marks: " + totalMarks);
    System.out.println("Percentage : " + per);
}
	
	
}
