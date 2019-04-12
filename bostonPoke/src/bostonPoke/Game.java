package bostonPoke;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import monsters.Geese;
import monsters.GreenLine;
import monsters.HomelessMan;
import monsters.Humanoid;
import monsters.Monster;




public class Game extends Application{
	
	static Player player;
	static Trainer Theodore;
	static Trainer Womusk;
	static Trainer bigChungus;
	
	static String playerName;
	static Monster playerMonster;
	static Image show;
	static ImageView pV;//shows
	static Rectangle pHealth;//shows
	
	
	//top right
	static String tName;
	static Text t_Name;//shows
	static Monster[] tsMonster;
	static Monster monsterInUse;
	static Image image;
	static ImageView showcased;//shows
	static Rectangle eHealth;
	
	static String playerGender;
	
	
	static Text pbar;
	static Text ebar;
	
	public static Button leave;
	
	Pane battlePane;
	

	public static void main(String[] args) {

		
		
		Womusk = new Trainer(2, false);
		HomelessMan myDude = new HomelessMan(); 
		Geese Fronto = new Geese();
		Womusk.setMonster(myDude, 0);
		Womusk.setMonster(Fronto, 1);
		
		bigChungus = new Trainer(3, true);
		GreenLine blueLine = new GreenLine();
		GreenLine commuterRail = new GreenLine();
		Geese meatShield = new Geese();
		bigChungus.setMonster(blueLine, 0);
		bigChungus.setMonster(meatShield, 1);
		bigChungus.setMonster(commuterRail, 2);
		
		
		
		
		launch(args);
		
		System.out.println(playerName);
	}		

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane map = Map1.getMap();
		Pane pane2 = new Pane();
		FlowPane startS = Start.start();
		
		Image boss1 = new Image("http://www.stickpng.com/assets/images/58b1702a102ddecdee0dd039.png");
		ImageView imgView8 = new ImageView(boss1);
		imgView8.setLayoutX(425);
		imgView8.setLayoutY(100);
		imgView8.setFitHeight(100);
		imgView8.setFitWidth(100);
				
		
		//Creates the character image and inserts it into the map and handles user input to move the image around 
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
		map.getChildren().addAll(mainChar,imgView8);
		Scene mainMap = new Scene(map, 1000,800);
		
		//Creates the scene for the first battle and handles 
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("Battle.fxml"));
		Pane battleScene1 = loader.load();
		Scene battle1 = new Scene(battleScene1,1000,800);
		Scene start = new Scene(startS, 1000, 800);
		

		primaryStage.setTitle("Start Game!");
		primaryStage.setScene(start);
		primaryStage.show();

		mainChar.requestFocus();
<<<<<<< HEAD
		
	
		TextField enterName = new TextField(); 
		((GridPane) startS).add(enterName, 3, 2);
		TextField enterGender = new TextField();
		((GridPane) startS).add(enterGender, 3, 4);
=======

		Button submit = new Button("SUBMIT");
		startS.getChildren().add(submit);
		
		TextField enterName = new TextField(); 
		((FlowPane) startS).getChildren().add(enterName);
		TextField Gender = new TextField();
		((FlowPane) startS).getChildren().add(Gender);
>>>>>>> 9c6ee80e3bbda033cd2e4a04fe8e2249a7279c92

		
		Button squirrel = new Button("Squirrel");
		((GridPane) startS).add(squirrel, 2, 8);
		
		squirrel.setOnAction(e->{
			playerMonster = Player.selectMonster(1);
			playerName = enterName.getText();
			playerGender = enterGender.getText();

			
			primaryStage.setTitle("MAIN MAP");
			primaryStage.setScene(mainMap);

		});
		
		
		imgView8.setOnMouseClicked(e->{
			
			Pane p = Battle1.getBattle(player, Theodore);
			Scene a = new Scene(p, 500, 500);
			primaryStage.setTitle("Face off");
			primaryStage.setScene(a);
		});
		
		
		squirrel.setOnAction(e->{
			playerMonster = Player.selectMonster(1);
			playerName = enterName.getText();
			playerGender = enterGender.getText();
			if(playerMonster instanceof Monster) {
				System.out.println(playerName);
				System.out.println(playerMonster.getName());
				System.out.println(playerGender);
			}
			primaryStage.setScene(mainMap);
		});
		
		
		/*
		 * BATTLE1 SHIT
		 * 	 */
		
		/*
		 * 
		attack.setOnAction(e->{
			Tra.setHealth(10);
		
			ebar.setText(String.format("HP: %d / %d", monsterInUse.getHealth(), monsterInUse.getMaxHealth()));	
			eHealth.setX(eHealth.getX() - 10);
			
			monsterInUse = Find(arr);
		});
		*/
		


		mainChar.requestFocus();

		
	};
		
		

}
	



