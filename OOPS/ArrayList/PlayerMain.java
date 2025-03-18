import java.util.ArrayList;

public class PlayerMain {

	public static void main(String[] args) {
		
		PlayerData p = new PlayerData();
		ArrayList<Player> pi = new ArrayList<>();

		pi = p.addplayer(pi);
		p.displayPlayer(pi);
		
		
	    	//	p.maxRun(pi);
			//p.sortPlayer(pi);
		
		System.out.println("----------------------------------");
			p.deletePlayer(pi);
			p.displayPlayer(pi);
		System.out.println("----------------------------------");
			p.updateGrade(pi);
			
	}

}
