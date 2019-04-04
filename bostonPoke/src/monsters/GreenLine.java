package monsters;

public class GreenLine extends Constructs {

	public GreenLine() {
		super("Green Line MBTA Train");
	}

	@Override
	public void levelUP() {
		this.setMaxHealth(150);
		this.setAttackDMG(15);
	}
	
}
