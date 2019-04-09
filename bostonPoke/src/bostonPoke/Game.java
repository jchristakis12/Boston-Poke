package bostonPoke;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import monsters.Geese;
import monsters.GreenLine;
import monsters.HomelessMan;
import monsters.Humanoid;

public class Game extends Application{
	
	int Width = 1000;
	int Height = 800;
	
	@FXML
	Button Theodore;
	
	@FXML
	Button Womusk;
	
	@FXML
	Button bigChungus;
	
	public static void main(String[] args) {
		Map.main(args);

		
		Trainer Theodore = new Trainer(1, true);
		Geese Pham = new Geese();
		Theodore.setMonster(Pham, 0);
		Theodore.selectName();
		
		
		Trainer Womusk = new Trainer(2, false);
		HomelessMan myDude = new HomelessMan(); 
		Geese Fronto = new Geese();
		Womusk.setMonster(myDude, 0);
		Womusk.setMonster(Fronto, 1);
		
		Trainer bigChungus = new Trainer(3, true);
		GreenLine blueLine = new GreenLine();
		GreenLine commuterRail = new GreenLine();
		Geese meatShield = new Geese();
		bigChungus.setMonster(blueLine, 0);
		bigChungus.setMonster(meatShield, 1);
		bigChungus.setMonster(commuterRail, 2);
		
		
		
		
		
	}
	
	public Game() {
		new Window(Width, Height, "Boston Poke", this);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		
		Theodore.setOnMouseClicked(e->{
			
			setScene(setBattleScene1(), 1000, 800);
			
		});
		
	}

	@Override
	public void draw() {
		Stage pStage = new Stage();
		
	}
	

}
	



