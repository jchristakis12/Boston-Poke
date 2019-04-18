package bostonPoke;

import monsters.Geese;
import monsters.GreenLine;
import monsters.HomelessMan;
import monsters.Monster;

public class Player {
	
	private String name, gender;
	private static Monster monster;
	static String url;

	public Player(Monster monster, String name, String gender) {
		this.name = name;
		this.gender = gender;
		Player.monster = monster;
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
			
			monster = new HomelessMan();
			url = monster.getURL();
			return monster;
			
		}else if(choice == 1) {
			 monster = new Geese();
			url = monster.getURL();
			return monster;
		}else if(choice == 2) {
			
			 monster = new GreenLine();
			 url = monster.getURL();
			return monster;
		}
		return null;
	}
	
	
}
