package monsters;

public class Geese extends Nature {

	public Geese() {
		super("Goose that hangs out in front of the MFA");
	}
	
	@Override
	public void levelUP() {
		this.setMaxHealth(125);
		this.setAttackDMG(20);
	}

}
