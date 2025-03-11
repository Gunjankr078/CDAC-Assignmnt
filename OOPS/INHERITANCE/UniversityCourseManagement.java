
public class UniversityCourseManagement {

	public static void main(String[] args) {
			
		OnlineCourse on1= new OnlineCourse(101, "PG-DAC(online)", 10, "Zoom");
		OnlineCourse on2= new OnlineCourse(102, "PG-DBDA(online)", 10, "MEET");
		
		OnCampusCourse oc1 = new OnCampusCourse (201, "PG-DAC(offline)", 10, "EC-10A");
		OnCampusCourse oc2 = new OnCampusCourse(202, "PG-DBDA(offline)", 10, "EC -10B");
			on1.displayOnlineCourse();
			on2.displayOnlineCourse();
			
			oc1.displayOnCampusCourse();
			oc2.displayOnCampusCourse();

	}

}
