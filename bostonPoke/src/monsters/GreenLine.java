package monsters;

public class GreenLine extends Constructs {

	public GreenLine() {
		super("Green Line MBTA Train");
	}

	@Override
	public void levelUP() {
		this.setMaxHealth(this.getMaxHealth() + 50);
		this.setAttackDMG(this.getAttackDMG() + 5);
	}
	
	@Override
	public String getURL() {
		return "https://cdn20.patchcdn.com/users/22926785/20180524/112313/styles/T800x600/public/processed_images/greenlinenew_courtesy-1527175348-5740.jpg";
	}
	
	
}
