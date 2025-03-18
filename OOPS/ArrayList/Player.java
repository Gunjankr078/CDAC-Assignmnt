
public class Player {

	String player_name;
	int total_run;
	int no_of_wicket;
	int no_of_matches;
	String country;
	int no_of_century;
	String category = null;
	public Player(String player_name, int total_run, int no_of_wicket, int no_of_matches, String country,
			int no_of_century) {
		
		this.player_name = player_name;
		this.total_run = total_run;
		this.no_of_wicket = no_of_wicket;
		this.no_of_matches = no_of_matches;
		this.country = country;
		this.no_of_century = no_of_century;
		this.category = null;
	}
	void displayPlayer() {
		System.out.println(player_name+" "+ total_run+" "+ no_of_wicket+" "+ no_of_matches+" "+ country+" "+ no_of_century);
		
	}
	void displayCat() {
		System.out.println(player_name+" "+ total_run+" "+ no_of_wicket+" "+ no_of_matches+" "+ country+" "+ no_of_century+" "+ category);

		
	}
	
}
