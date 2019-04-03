package monsters;

public class HomelessMan extends Humanoid {

	public HomelessMan() {
		super("Homeless Man you saw last week and didn't give money to");
		
	}

	@Override
	public void levelUP() {
		this.setMaxHealth(135);
		this.setAttackDMG(18);
		
	}
	
}
