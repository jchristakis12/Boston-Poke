package bostonPoke;

import monsters.Monster;

public class Player {
	
	private String name, gender;
	private Monster[] monster = new Monster[1];

	public Player(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
}
