package monsters;

import java.util.Random;

public abstract class Monster {
	private String name, type;
	private int health;
	private int level; 
	private boolean isHealthy;
	protected int maxHealth = 100;
	protected int attackDMG = 10;
	
	//Constructor to create monsters
	public Monster(String name, String type) {
		
		this.name = name;
		this.type = type;
		health = 100;
		level = 1;
		isHealthy = true;
	}
	
	//Getter methods used to return the "stats" of each monster
	public int getHealth() {
		if(health > maxHealth) {
			return maxHealth;
		}
		return health;
	}
	
	public int getLvL() {
		return level;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	public int getAttackDMG() {
		return attackDMG;
	}
	
	public boolean isHealthy() {
		if(health > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void setMaxHealth(int health) {
		maxHealth = health;
	}
	public void setAttackDMG(int dmg ) {
		attackDMG = dmg;
	}
	//Methods that will calculate and change the health of monsters
	public void takeDamage(int damage) {
		health = health - damage;
	}
	
	public static double critValue() {
		Random crit = new Random();
		double critVal = crit.nextDouble() * 100;
		return critVal;
	}
	public static boolean isCrit() {
		double critVal = critValue();
		if(critVal >= 0 && critVal <= 6.25) {
			return true;
		}
		return false;
		
	}
	public abstract void attack(Monster opponent);		
	
	public abstract void levelUP();	
	
}
