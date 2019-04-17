package monsters;

public abstract class Constructs extends Monster {
	
	public Constructs(String name) {
		super(name,"Construct");
	}
	
	@Override
	public int attack(Monster opponent) {
		int damage = attackDMG;
		boolean crit = isCrit();
		
		if(crit == true){
			damage = (int) Math.round(damage * 1.5);
			
			if(opponent.getType().equals("Humanoid")) {
				damage = (int) Math.round(damage * .75);
			}else if(opponent.getType().equals("Nature")) {
				damage = (int) Math.round(damage * 1.75);
			}
			
		}else {
			
			if(opponent.getType().equals("Humanoid")) {
				damage = (int) Math.round(damage * .75);
			}else if(opponent.getType().equals("Nature")) {
				damage = (int) Math.round(damage * 1.75);
			}
		}
		
		return damage;
	}
	
	
}
