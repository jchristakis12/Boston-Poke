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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import monsters.Geese;
import monsters.GreenLine;
import monsters.HomelessMan;
import monsters.Humanoid;
import monsters.Monster;




public class Game extends Application{

static String playerName;
static String playerGender;
static Monster playerMonster;

static Trainer Womusk;
static Trainer bigChungus;

public static void main(String[] args) {

 
 
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
 
		System.out.println(playerName);
}  

@Override
public void start(Stage primaryStage) throws Exception {
 
		BorderPane map = Map1.getMap();
		Pane pane2 = new Pane();
		Pane startS = Start.start();
 
		Image boss1 = new Image("http://www.stickpng.com/assets/images/58b1702a102ddecdee0dd039.png");
		ImageView imgView8 = new ImageView(boss1);
		imgView8.setLayoutX(375);
		imgView8.setLayoutY(100);
		imgView8.setFitHeight(125);
		imgView8.setFitWidth(175);
   
 
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
		Scene start = new Scene(startS, 500, 500);
		

		primaryStage.setTitle("Start Game!");
		primaryStage.setScene(start);
		primaryStage.show();

		mainChar.requestFocus();
 

		TextField enterName = new TextField();
		//enterName.setPrefSize(100, 30);
		((GridPane) startS).add(enterName, 1, 1, 3, 1);
		TextField enterGender = new TextField();
		//enterGender.setPrefSize(100, 30);
		((GridPane) startS).add(enterGender, 1, 2, 3, 1);

 
		Button squirrel = new Button("Squirrel");
		//squirrel.setAlignment(Pos.CENTER);
		//squirrel.setPrefSize(75, 25);
		((GridPane) startS).add(squirrel, 1, 3);
		
		Button geese = new Button("Geese");
		//geese.setPrefSize(75, 25);
		geese.setAlignment(Pos.CENTER);
		((GridPane) startS).add(geese, 2, 3);
		
		Button homelessman = new Button("Homeless man");
		//homelessman.setPrefSize(75, 25);
		homelessman.setAlignment(Pos.CENTER);
		((GridPane) startS).add(homelessman, 3, 3);
		
		
 
		squirrel.setOnAction(e->{
		playerMonster = Player.selectMonster(1);
		playerName = enterName.getText();
		playerGender = enterGender.getText();
		if(playerMonster instanceof Monster) {
			System.out.println(playerName);
			System.out.println(playerMonster.getName());
			System.out.println(playerGender);
		}
		primaryStage.setTitle("MAIN MAP");
		primaryStage.setScene(mainMap);

		});
		
		geese.setOnAction(e->{
			playerMonster = Player.selectMonster(1);
			playerName = enterName.getText();
			playerGender = enterGender.getText();
			if(playerMonster instanceof Monster) {
				System.out.println(playerName);
				System.out.println(playerMonster.getName());
				System.out.println(playerGender);
			}
			primaryStage.setTitle("MAIN MAP");
			primaryStage.setScene(mainMap);

			});
		
		homelessman.setOnAction(e->{
			playerMonster = Player.selectMonster(1);
			playerName = enterName.getText();
			playerGender = enterGender.getText();
			if(playerMonster instanceof Monster) {
				System.out.println(playerName);
				System.out.println(playerMonster.getName());
				System.out.println(playerGender);
			}
			primaryStage.setTitle("MAIN MAP");
			primaryStage.setScene(mainMap);

			});
 
 
		imgView8.setOnMouseClicked(e->{
		primaryStage.setTitle("Fight!");
		primaryStage.setScene(battle1);
 });
 



		mainChar.requestFocus();

 
};
 
 

}





