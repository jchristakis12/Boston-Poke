package bostonPoke;

import monsters.Geese;
import monsters.GreenLine;
import monsters.HomelessMan;
import monsters.Monster;

public class Player {
	
	private String name, gender;
	private static Monster monster;

	public Player(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public Monster getMonster() {
		return monster;
	}
	
	public static Monster selectMonster(int choice) {
		if(choice == 0) {
			return monster = new HomelessMan();
		}else if(choice == 1) {
			return monster = new Geese();
		}else if(choice == 2) {
			return monster= new GreenLine();
		}
		return null;
	}
	
	
}
