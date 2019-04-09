package bostonPoke;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
<<<<<<< HEAD
=======
import javafx.scene.shape.Rectangle;
>>>>>>> 8d340ae943487bbf87d3e812bcf2553d7a67e74e
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
		Pane pane2 = new Pane();
		
		Image boss1 = new Image("https://vignette.wikia.nocookie.net/dreamworks/images/5/52/8260c358617564297ca30c4dbbef7c26.jpg/revision/latest?cb=20190302123446");
		ImageView imgView8 = new ImageView(boss1);
		imgView8.setLayoutX(425);
		imgView8.setLayoutY(100);
		imgView8.setFitHeight(100);
		imgView8.setFitWidth(100);
				
		
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
		Button btn = new Button();
		btn.setText("GO BACK!");
		pane2.getChildren().add(btn);
		pane.getChildren().addAll(mainChar,imgView8);
		Scene mainMap = new Scene(pane, 1000,800);
		Scene Yuur = new Scene(pane2,200,200);
		primaryStage.setTitle("Boston Pokemon Map");
		primaryStage.setScene(mainMap);
		primaryStage.setResizable(false);
		primaryStage.show();
		

		Theodore.setOnMouseClicked(e->{
			
			setScene(Battle1.getBattle(tester, opponent), 1000, 800);
			
		});
		

		mainChar.requestFocus();
		
<<<<<<< HEAD
=======
		imgView8.setOnMouseClicked(e -> primaryStage.setScene(Yuur));
		btn.setOnMouseClicked(e -> primaryStage.setScene(mainMap));
>>>>>>> 8d340ae943487bbf87d3e812bcf2553d7a67e74e
		
		
	};
		
		
	
	



}
	



