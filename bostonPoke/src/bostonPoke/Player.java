package bostonPoke;

import monsters.Geese;
import monsters.GreenLine;
import monsters.HomelessMan;
import monsters.Monster;

public class Player {
	
	private String name, gender;
	private static Monster[] monster = new Monster[1];

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
	
	public Monster[] getMonster() {
		return monster;
	}
	
	public static void selectMonster(int choice) {
		if(choice == 0) {
			monster[0] = new HomelessMan();
		}else if(choice == 1) {
			monster[0] = new Geese();
		}else if(choice == 2) {
			monster[0] = new GreenLine();
		}
	}
	
	
}
