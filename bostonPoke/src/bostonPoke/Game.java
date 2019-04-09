package bostonPoke;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
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
	
	@FXML
	Pane battle;
	
	
	
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
		
		
		
		Player tester = new Player("HOI", "APACHE HELICOPTER");
		
		
		Pane battle = Battle1.getBattle(tester, Theodore);

		
		
		
	}
	
	public Game() {
		new Window(Width, Height, "Boston Poke", this);

	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane pane = Map1.getMap();
		
		
		Image character = new Image("https://vignette.wikia.nocookie.net/pokemon/images/7/7a/VS_Red_SM.png/revision/latest?cb=20170101032644");
		ImageView mainChar = new ImageView(character);
		mainChar.setLayoutX(820);
		mainChar.setLayoutY(750);
		mainChar.setFitHeight(70);
		mainChar.setFitWidth(100);
		
		mainChar.setOnKeyPressed(new EventHandler<KeyEvent>() {
		
			
			@Override
			public void handle(KeyEvent event) {
				// TODO Auto-generated method stub
				if (event.getCode() == KeyCode.LEFT) {
					mainChar.setX(mainChar.getX() - 10);
				}
				if (event.getCode() == KeyCode.RIGHT) {
					mainChar.setX(mainChar.getX() + 10);
				}
				if (event.getCode() == KeyCode.UP) {
					mainChar.setY(mainChar.getY() - 10);
				}
				if (event.getCode() == KeyCode.DOWN) {
					mainChar.setY(mainChar.getY() + 10);
				}
			}
		}); 
		
		pane.getChildren().add(mainChar);
		Scene mainMap = new Scene(pane, 1000,800);
		primaryStage.setTitle("Boston Pokemon Map");
		primaryStage.setScene(mainMap);
		primaryStage.setResizable(false);
		primaryStage.show();
		

		Theodore.setOnMouseClicked(e->{
			
			setScene(Battle1.getBattle(tester, opponent), 1000, 800);
			
		});
		

		mainChar.requestFocus();
		
		
		
	};
		
		
	
	



}
	



