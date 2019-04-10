package bostonPoke;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import monsters.Geese;
import monsters.GreenLine;
import monsters.HomelessMan;
import monsters.Humanoid;

public class Game extends Application{
	
	static String playerName = null;
	static String playerGender = null;

	public static void main(String[] args) {

		
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
		
		Player player = new Player(playerName, playerGender);
		
		launch(args);
		
		System.out.print(playerGender);
	}		

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane pane = Map1.getMap();
		Pane pane2 = new Pane(); // replace with getbattle()
		Pane startS = Start.start();

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
		Scene Yuur = new Scene(pane2,1000,800);
		Scene start = new Scene(startS, 1000, 800);

		primaryStage.setTitle("Start Game!");
		primaryStage.setScene(start);
		
		primaryStage.show();


		mainChar.requestFocus();
		
		Button submit = new Button("SUBMIT");
		startS.getChildren().add(submit);
		
		TextField enterName = new TextField(); 
		((GridPane) startS).add(enterName, 3, 2);
		TextField Gender = new TextField();
		((GridPane) startS).add(Gender, 2, 4);

		
		submit.setOnAction(e->{
			//String playerName = startS how to access textfield from game
			playerName = enterName.getText();
			playerGender = Gender.getText();
			primaryStage.setScene(mainMap);
		});
		
		imgView8.setOnMouseClicked(e -> primaryStage.setScene(Yuur));
		
		btn.setOnMouseClicked(e -> primaryStage.setScene(mainMap));


		mainChar.requestFocus();

		
	};
		
		

}
	



