import java.util.ArrayList;
import java.util.Scanner;

public class TeacherAllData {
    
	ArrayList<TeacherData> tea = new ArrayList<>();
	
	public ArrayList<TeacherData> addTeacher() {
		TeacherData t0 = new TeacherData(1001,"Shan",84440);
		TeacherData t2 = new TeacherData(1002,"Shanu",85440);
		TeacherData t3 = new TeacherData(1003,"Ram",84640);
		TeacherData t4 = new TeacherData(1004,"Shyam",84450);
		TeacherData t5 = new TeacherData(1005,"Mohan",94440);
		
		tea.add(t0);
		tea.add(t2);
		tea.add(t3);
		tea.add(t4);
		tea.add(t5);
		return tea;
	}
	
	public void updateTeacher(ArrayList<TeacherData> teach) {
		System.out.println("Enter id to update salary");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		int sal =s.nextInt();
		
		for (TeacherData obj: teach) {
			if (obj.id == id) {
				obj.sal = sal;
			}
		}
		
	}
	
    public void deleteTeacher(ArrayList<TeacherData> teach) {
    	System.out.println("Enter id to Delete Teacher");
    	Scanner s = new Scanner(System.in);
    	int id = s.nextInt();
    	int ind = 0;
    	for (TeacherData obj: teach) {
            if(obj.id==id) {	
				ind = teach.indexOf(obj);
			}
            
    	}
    	tea.remove(ind);
		
    }
	
	

	

	public void displayTeacher(ArrayList<TeacherData> teach) {
		for (TeacherData obj: teach) {
			obj.displayTeacher();
		}
		
	}

	




	



	


	
}
