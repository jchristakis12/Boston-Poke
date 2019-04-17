package monsters;

public abstract class Humanoid extends Monster {

	public Humanoid(String name) {
		super(name, "Humanoid");
	}
	
	@Override
	public int attack(Monster opponent) {
		int damage = attackDMG;
		boolean crit = isCrit();
		
		if(crit == true){
			damage = (int) Math.round(damage * 1.5);
			
			if(opponent.getType().equals("Nature")) {
				damage = (int) Math.round(damage * .75);
			}else if(opponent.getType().equals("Constructs")) {
				damage = (int) Math.round(damage * 1.75);
			}
			
		}else {
			
			if(opponent.getType().equals("Nature")) {
				damage = (int) Math.round(damage * .75);
			}else if(opponent.getType().equals("Constructs")) {
				damage = (int) Math.round(damage * 1.75);
			}
		}
		
		return damage;
	}

}
