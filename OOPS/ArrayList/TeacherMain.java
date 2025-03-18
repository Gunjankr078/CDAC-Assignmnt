import java.util.ArrayList;

public class TeacherMain {

	public static void main(String[] args) {
		TeacherAllData t1 = new TeacherAllData();
		ArrayList<TeacherData> teach = new ArrayList<>();
		
		teach = t1.addTeacher();
		t1.displayTeacher(teach);
		
		t1.updateTeacher(teach);
		t1.displayTeacher(teach);
		
		t1.deleteTeacher(teach);
		t1.displayTeacher(teach);
		

	}

}
