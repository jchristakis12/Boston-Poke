package bostonPoke;

import java.util.Random;

public class Trainer implements Display {

		private numMonsters;
		
		private Monster[] monsters;
		
		private health;
		
		public name[] = {"Frankie", "Sid", "Joey", "Kor", "Ash", "Bandit"};
		
		private gender;
		
		//private heals = 1; monsters will heal
		
		public void Trainer(String[] name, int difficulty) {
			double x = (Math.random()*((5)))+1;
			this.name = name[x];
			boolean gender = Math.random() < 0.5;
			this.gender = gender;
			this.numMonsters = 1;
			setDifficult(difficulty);
		}
		
		
		public void setDifficult(int perc) {
			
			this.numMonsters = this.numMonsters * perc;
			
			
		}
		
		public void whichMonsters(int numMonsters) {
			monsters = new Monster[numMonsters]; 
			int xRandom = (int) ((Math.random() * ((2))) +1);
			for(int i = 0; i < monsters.length; i++) {
				monsters[i] = new Monster(xRandom);
			}
			
			
			
		}
		
		//Trainer Max = new Trainer("Max", 2)
		
}
