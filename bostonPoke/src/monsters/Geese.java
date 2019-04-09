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
	
	@Override
	public String getURL() {
		return "https://www.boston.com/wp-content/uploads/2014/04/05212011_0521oped_goose_jpg-7937585-800x478.jpg";
	}

}
