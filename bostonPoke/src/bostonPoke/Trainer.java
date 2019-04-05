package bostonPoke;

import java.util.Random;

import monsters.Geese;
import monsters.HomelessMan;
import monsters.Monster;

@SuppressWarnings("unused")
public class Trainer {
		
		private Monster[] monsters;
		
		private String[] nameList = {"Frankie", "Sid", "Joey", "Kor", "Ash", "Bandit"};
		
		private String name;
		
		private boolean isMale;
		
		private String[] greetings = new String[5];
		
		private String[] loss = new String[5];
		
		private static Random rn = new Random();
				
		
		
		public Trainer(int difficulty,boolean isMale) {
			
			this.name = selectName();
			this.isMale = isMale;
			monsters = new Monster[difficulty];
			
		}
		
		public String selectName() {
			int name = rn.nextInt(6);
			return nameList[name];
		}
		
		public String Greeting() {
			greetings[0] = "Hello challenger";
			greetings[1] = "What's up nerd, let's battle";
			greetings[2] = "*grunts profusely*";
			greetings[3] = "Blessin the rains down in Africa";
			greetings[4] = "Greetings traveler";
			int greet = rn.nextInt(greetings.length);
			return greetings[greet];
		}
		
		public boolean isDefeated() {
			for(int i = 0; i < monsters.length; i++) {
				if(monsters[i].isHealthy() == true) {
					return false;
				}
			}
			return true;
		}
		
		public String Lost() {
			loss[0] = "I'll get you next time";
			loss[1] = "Darn!";
			loss[2] = "Unlucky!";
			loss[3] = "I would've gotten away with it if it weren't for you meddling adults!";
			loss[4] = "*cries*";
			int iLoss = rn.nextInt(loss.length);
			return loss[iLoss];
		}
		
		
		
}
