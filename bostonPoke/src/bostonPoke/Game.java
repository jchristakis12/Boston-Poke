package bostonPoke;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
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

 
 
		Trainer Womusk = new Trainer(2, false);

		
		
		Womusk = new Trainer(2, false);
		HomelessMan myDude = new HomelessMan(); 
		Geese Fronto = new Geese();
		Womusk.setMonster(myDude, 0);
		Womusk.setMonster(Fronto, 1);
 
		Trainer bigChungus = new Trainer(3, true);
		
		bigChungus = new Trainer(3, true);
		GreenLine blueLine = new GreenLine();
		GreenLine commuterRail = new GreenLine();
		Geese meatShield = new Geese();
		bigChungus.setMonster(blueLine, 0);
		bigChungus.setMonster(meatShield, 1);
		bigChungus.setMonster(commuterRail, 2);
 
		Player player = new Player(playerName, playerGender);

		launch(args);
 
}  

@Override
public void start(Stage primaryStage) throws Exception {
 
		BorderPane map = Map1.getMap();
		Pane pane2 = new Pane();
		Pane startS = Start.start();
		Text PlayerName = new Text();
   
/////////Creates the character image and inserts it into the map and handles user input to move the image around/////////////// 
		Image character = new Image("https://vignette.wikia.nocookie.net/pokemon/images/7/7a/VS_Red_SM.png/revision/latest?cb=20170101032644");
		ImageView mainChar = new ImageView(character);
		mainChar.setLayoutX(820);
		mainChar.setLayoutY(750);
		mainChar.setFitHeight(70);
		mainChar.setFitWidth(100);
   
		mainChar.setOnKeyPressed(new EventHandler<KeyEvent>() {
 
		@Override
		public void handle(KeyEvent event) {
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
		
		mainChar.requestFocus();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
//////////////////////Handles adding first trainer into map////////////////////////////////////////////////////////////		
		Image boss1 = new Image("http://www.stickpng.com/assets/images/58b1702a102ddecdee0dd039.png");
		ImageView imgView8 = new ImageView(boss1);
		imgView8.setLayoutX(375);
		imgView8.setLayoutY(100);
		imgView8.setFitHeight(125);
		imgView8.setFitWidth(175);
		map.getChildren().addAll(mainChar,imgView8);
		Scene mainMap = new Scene(map, 1000,800);
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Scene start = new Scene(startS, 500, 500);
		
		
///////////////////////////////////////////START SCREEN/////////////////////////////////////////////////////////////////
		TextField enterName = new TextField();
		//enterName.setPrefSize(100, 30);
		((GridPane) startS).add(enterName, 1, 1, 3, 1);
		TextField enterGender = new TextField();
		//enterGender.setPrefSize(100, 30);
		((GridPane) startS).add(enterGender, 1, 2, 3, 1);		

 
		Button train = new Button("Train");
		//squirrel.setAlignment(Pos.CENTER);
		//squirrel.setPrefSize(75, 25);
		((GridPane) startS).add(train, 1, 3);
		
		Button geese = new Button("Geese");
		//geese.setPrefSize(75, 25);
		geese.setAlignment(Pos.CENTER);
		((GridPane) startS).add(geese, 2, 3);
		
		Button homelessman = new Button("Homeless man");
		//homelessman.setPrefSize(75, 25);
		homelessman.setAlignment(Pos.CENTER);
		((GridPane) startS).add(homelessman, 3, 3);
		
		
 
		train.setOnAction(e->{
		playerMonster = Player.selectMonster(2);
		playerName = enterName.getText();
		playerGender = enterGender.getText();
		PlayerName.setText(playerName);
		if(playerMonster instanceof Monster) {
			System.out.println(playerName);
			System.out.println(playerMonster.getName());
			System.out.println(playerGender);
		}
		primaryStage.setTitle("MAIN MAP");
		primaryStage.setScene(mainMap);
		mainChar.requestFocus();

		});
		
		geese.setOnAction(e->{
			playerMonster = Player.selectMonster(1);
			playerName = enterName.getText();
			playerGender = enterGender.getText();
			PlayerName.setText(playerName);
			if(playerMonster instanceof Monster) {
				System.out.println(playerName);
				System.out.println(playerMonster.getName());
				System.out.println(playerGender);
			}
			primaryStage.setTitle("MAIN MAP");
			primaryStage.setScene(mainMap);
			mainChar.requestFocus();
			
			});
		
		homelessman.setOnAction(e->{
			playerMonster = Player.selectMonster(0);
			playerName = enterName.getText();
			playerGender = enterGender.getText();
			PlayerName.setText(playerName);
			if(playerMonster instanceof Monster) {
				System.out.println(playerName);
				System.out.println(playerMonster.getName());
				System.out.println(playerGender);
			}
			primaryStage.setTitle("MAIN MAP");
			primaryStage.setScene(mainMap);
			mainChar.requestFocus();

		});
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 		
//////////////////////////////////////////BATTLE 1 BOYS///////////////////////////////////////////////////////////////
			
			Pane b1p = new Pane();
			VBox b1vbox = new VBox(50);
			b1vbox.setAlignment(Pos.CENTER);
			VBox b1vbox1 = new VBox(50);
			b1vbox1.setAlignment(Pos.CENTER);
			HBox b1hbox = new HBox(50);
			Text TrainerName1 = new Text("Teddy");
			Image playerMon = new Image("https://vignette.wikia.nocookie.net/pokemon/images/7/7a/VS_Red_SM.png/revision/latest?cb=20170101032644");
			ImageView viewPlayer = new ImageView(playerMon);
			
			viewPlayer.setPreserveRatio(true);
			viewPlayer.setFitHeight(300);
			viewPlayer.setFitWidth(300);
			Image b1monster = new Image("http://www.stickpng.com/assets/images/58b1702a102ddecdee0dd039.png");
			ImageView monsterb1 = new ImageView(b1monster);
			monsterb1.setPreserveRatio(true);
			monsterb1.setFitHeight(300);
			monsterb1.setFitWidth(300);
			Button atk = new Button("Attack");
			Button returnBtn = new Button("Leave");
			
			Rectangle healthbar = new Rectangle (100, 100);
			
			//vbox.setMargin(PlayerName, new Insets(40, 0, 0, 0));
			b1vbox.getChildren().addAll(PlayerName, viewPlayer, atk);
			//vbox1.setMargin(TrainerName, new Insets(40, 0, 0, 0));
			b1vbox1.getChildren().addAll(TrainerName1, monsterb1);
			b1hbox.getChildren().addAll(b1vbox, b1vbox1);
			b1p.getChildren().addAll(b1hbox, healthbar);
			Scene battle1 = new Scene(b1p, 700, 700);
			
			
			
			atk.setOnAction(e->{
				healthbar.setWidth(healthbar.getWidth() - 10);;
				if(healthbar.getWidth() == 0) {
					b1vbox1.getChildren().add(returnBtn);
				}
			});
			
			returnBtn.setOnAction(e->{
				primaryStage.setScene(mainMap);
				mainChar.requestFocus();
			});
			
			

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
			
			
			
		imgView8.setOnMouseClicked(e->{
		primaryStage.setTitle("Fight!");
		primaryStage.setScene(battle1);
		});
 
			primaryStage.setScene(mainMap);
			
			primaryStage.setTitle("Start Game!");
			primaryStage.setScene(start);
			primaryStage.show();

		
			imgView8.setOnMouseClicked(e-> primaryStage.setScene(battle1));
		
		
 
	};

 
}





