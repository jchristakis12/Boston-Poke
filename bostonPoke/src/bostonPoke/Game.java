package bostonPoke;

import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application implements Display {
	
	
	public static final int Width = 640, Height = Width / 12 * 9;
	public Thread thread;
	private boolean running = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Game();
	}
	
	public Game() {
		new Window(Width, Height, "Boston Poke", this);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
	



