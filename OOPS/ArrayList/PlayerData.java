import java.util.ArrayList;

public class PlayerData {

	public ArrayList<Player> addplayer(ArrayList<Player> pi) {
		    Player p1 = new Player("Virat Kohli", 120, 4, 260, "India", 43);
	        Player p2 = new Player("Steve Smith", 85, 23, 180, "Australia", 31);
	        Player p3 = new Player("Kane Williamson", 130, 5, 145, "New Zealand", 27);
	        Player p4 = new Player("Lasith Malinga", 120, 280, 226, "Sri Lanka", 0);
	        Player p5 = new Player("AB de Villiers", 110, 2, 230, "South Africa", 25);
	        
	        pi.add(p1);
	        pi.add(p2);
	        pi.add(p3);
	        pi.add(p4);
	        pi.add(p5);
		return pi;
	}

	public void displayPlayer(ArrayList<Player> pi) {
		for(Player obj : pi) {
			obj.displayPlayer();
		}
		
	}

	public void maxRun(ArrayList<Player> pi) {
		int max=0;
		int index =0;
		for(Player obj : pi) {
			if(obj.total_run > max) {
				max= obj.total_run;
				index = pi.indexOf(obj);
				
			}
			
		}
		
		
		
	}

	public void sortPlayer(ArrayList<Player> pi) {
		
		
		
	}

	public void deletePlayer(ArrayList<Player> pi) {
		
		int index =0;
		for(Player obj :pi) {
			if(obj.total_run<100) {
				index = pi.indexOf(obj);
				
			}
		}
		pi.remove(index);
		System.out.println("Player Deleted");
		
	}

	public void updateGrade(ArrayList<Player> pi) {
		
		
		for(Player obj :pi) {
			if(obj.no_of_century >10) {
				obj.category = "A";
			} else {
				obj.category = "B";
			}
			obj.displayCat();
		}
		
		
	}
		
}
	
	














