package bostonPoke;

import java.util.concurrent.ThreadLocalRandom;


import monsters.HomelessMan;
import monsters.Monster;

public class Trainer {

		private int numMonsters;
		
		private Monster[] monsters;
		
		public int health;
		
		public String[] nameList = {"Frankie", "Sid", "Joey", "Kor", "Ash", "Bandit"};
		
		public String name = null;
		
		private boolean isMale;
		
		
		public Trainer(String[] name, Monster[] has, int difficulty, boolean isMale) {
			int nameIndex = ThreadLocalRandom.current().nextInt(0, 5 + 1);
			this.name = nameList[nameIndex];
			boolean gender = Math.random() < 0.5;
			this.numMonsters = 1;
			this.numMonsters = setDifficult(difficulty);
			this.isMale = isMale;
			
		}
		
		
		public int setDifficult(int difficulty) {
			
			return this.numMonsters * difficulty;	
			
		}
		
		
		/***
		public void initializeMonsters(int numMonsters) {
			Monster[] monsters = new Monster[numMonsters]; 
			int whichMonster = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			
			
			
				for(int i = 0; i < monsters.length; i++) {
			if(whichMonster == 0) {
				Monster[i] = new Monster();
			}else if(whichMonster == 1) {
				Monster[0] = new Monster();
				Monster[1] = new Monster();
			}else {
				Monster[0] =new Monster();
				Monster[1] =new Monster();
				Monster[2] =new Monster();
			}		
			
			
		}
		
}
	***/
		
		public Monster[] getMonster() {
			return has[];
		}
}
