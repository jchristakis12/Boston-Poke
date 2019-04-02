package bostonPoke;

import java.util.concurrent.ThreadLocalRandom;

public class Trainer implements Display {

		private int numMonsters;
		
		private Monster[] monsters;
		
		public int health;
		
		public String[] nameList = {"Frankie", "Sid", "Joey", "Kor", "Ash", "Bandit"};
		
		public String name = null;
		
		private boolean gender;
		
		//private heals = 1; monsters will heal
		
		public void Trainer(String[] name, int difficulty) {
			int nameIndex = ThreadLocalRandom.current().nextInt(0, 5 + 1);
			this.name = nameList[nameIndex];
			boolean gender = Math.random() < 0.5;
			this.gender = gender;
			this.numMonsters = 1;
			this.numMonsters = setDifficult(difficulty);
			
		}
		
		
		public int setDifficult(int perc) {
			
			return this.numMonsters * perc;
			
			
		}
		
		public void whichMonsters(int numMonsters) {
			monsters = new Monster[numMonsters]; 
			int whichMonster = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			if(whichMonster == 0) {
				Monster[i] = new Monster()
			}else if(whichMonster == 0) {
				Monster[i] = new Monster
			}else {
				Monster[i] =new Monster()
			}
			
			
			
		}
		
		//Trainer Max = new Trainer("Max", 2)
		
}
