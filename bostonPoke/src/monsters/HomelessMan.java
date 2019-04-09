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
	
	@Override
	public String getURL() {
		return "https://c8.alamy.com/comp/BBK8W7/close-up-portrait-of-a-homeless-guy-with-a-cigarette-on-his-nose-brixton-BBK8W7.jpg";
	}
	
}
