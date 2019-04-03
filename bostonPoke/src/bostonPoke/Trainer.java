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
		
		
		public Trainer(String[] name, int difficulty,boolean isMale) {
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
		
		public void whichMonsters(int numMonsters) {
			Monster[] monsters = new Monster[numMonsters]; 
			int whichMonster = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			for(int i = 0; i < numMonsters; i ++) {
				
			}
			if(whichMonster == 0) {
				monsters[i] = new Geese();
			}else if(whichMonster == 0) {
				monsters[i] = new HomelessMan();
			}else {
				monsters[i] =new Monster();
			}
			
			
			
		}
		
}
