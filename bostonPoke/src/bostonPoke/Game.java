package bostonPoke;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Game extends Application implements Display {
	
	
	public static final int Width = 640, Height = Width / 12 * 9;
	public Thread thread;
	private boolean running = false;

	public static void main(String[] args) {
		Map.main(args);
		
		
		Stage primaryStage = new Stage();
		Map.start(primaryStage);
		
		
		
	}
	
	public Game() {
		new Window(Width, Height, "Boston Poke", this);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void draw() {
		Stage pStage = new Stage();
		
	}
	
}
	



