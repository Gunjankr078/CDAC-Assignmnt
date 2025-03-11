
public class ClassCourse {
	 int courseCode;
	 String courseName;
	 int credits;
	 
	public ClassCourse(int courseCode, String courseName, int credits) {

		this.courseCode = courseCode;
		this.courseName = courseName;
		this.credits = credits;
		
	}
	
	void DisplayCourse() {
		System.out.println("Course Code :"+courseCode);
		System.out.println("Course Name :"+courseName);
		System.out.println("Course Credits :"+credits);
		
	}
}
class OnlineCourse extends ClassCourse{
	      String platform;
	public OnlineCourse(int courseCode, String courseName, int credits,  String platform) {
		super(courseCode, courseName, credits);
		this.platform = platform;
	}
	void displayOnlineCourse(){
		System.out.println("This Is Online Course ");
		super.DisplayCourse();
		System.out.println("Platform : "+platform);
		System.out.println("=========================");
		
	}
}

class OnCampusCourse extends ClassCourse{
		String classroomNumber;
	public OnCampusCourse(int courseCode, String courseName, int credits,String classroomNumber) {
		super(courseCode, courseName, credits);
		this.classroomNumber=classroomNumber;
		}
		void displayOnCampusCourse(){
			System.out.println("This Is Offline Course ");
			super.DisplayCourse();
			System.out.println("Class Room Number : "+classroomNumber);
			System.out.println("=========================");
	}
}