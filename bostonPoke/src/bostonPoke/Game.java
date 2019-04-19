package bostonPoke;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
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
import javafx.scene.layout.StackPane;
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
	
	
	 ImageView showcased;//shows
	static Rectangle eHealth;
	static int attackDMG = 10;
	static int eAttackDMG = 10;
	static String pURL;
	
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
 
		
		launch(args);
 
}  

@Override
public void start(Stage primaryStage) throws Exception {
 
		BorderPane map = Map1.getMap();
		GridPane startS = Start.start();
		
		//tsMonster = Womusk.getMonster() ; // initialized here and used for battle 1
		//mArr = tsMonster[0];
		//wHealth = mArr.getMaxHealth();
		
		
		//Creates the character image and inserts it into the map and handles user input to move the image around 
		Text PlayerName = new Text();
		
		Geese Jack = new Geese();
		GreenLine DEAD = new GreenLine();
		HomelessMan Steve = new HomelessMan();
   
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
		
///////////////////////////////////////////Boss 2//////////////////////////////////////////////////////////////////////
		
		Image boss2 = new Image("https://vignette.wikia.nocookie.net/pokemon/images/2/29/Ingo.png/revision/latest?cb=20110225193531");
		ImageView imgView15 = new ImageView(boss2);
		imgView15.setLayoutX(450);
		imgView15.setLayoutY(650);
		imgView15.setFitHeight(100);
		imgView15.setFitWidth(100);
		
//////////////////////////////////////////Boss 3///////////////////////////////////////////////////////////////////////	
		
		Image boss3 = new Image("https://upload.wikimedia.org/wikipedia/en/0/0e/Eggman_robotnik.png");
		ImageView imgView22 = new ImageView(boss3);
		imgView22.setLayoutX(75);
		imgView22.setLayoutY(50);
		imgView22.setFitHeight(150);
		imgView22.setFitWidth(150);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////
		map.getChildren().addAll(mainChar,imgView8,imgView15, imgView22);
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
		((GridPane) startS).add(geese, 1, 4);
		
		Button homelessman = new Button("Homeless man");
		//homelessman.setPrefSize(75, 25);
		homelessman.setAlignment(Pos.CENTER);
		((GridPane) startS).add(homelessman, 1, 5);
		
		train.setOnAction(e->{
		playerMonster = Player.selectMonster(2);
		playerName = enterName.getText();
		playerGender = enterGender.getText();
		player = new Player(playerMonster,playerName,playerGender);
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
			player = new Player(playerMonster,playerName,playerGender);
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
			player = new Player(playerMonster,playerName,playerGender);
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
		
//////////////////////////////////////////ENDING SCREEN//////////////////////////////////////////////////////////////// 
		primaryStage.setTitle("End page");
		StackPane sp = new StackPane();
		Image theEnd = 
		new Image("https://i.ytimg.com/vi/8i41YRX5k5g/maxresdefault.jpg");
		ImageView imgTheEnd = new ImageView(theEnd);
		sp.getChildren().add(imgTheEnd);
		Scene endPage = new Scene(sp,700,700);

//////////////////////////////////////////LOSING END SCREEN//////////////////////////////////////////////////////////////// 
primaryStage.setTitle("End page");
StackPane sp1 = new StackPane();
Image theEnd1 = 
new Image("http://cdn3.whatculture.com/images/2019/04/ae8b6e43374302c8-600x338.jpg");
ImageView imgTheEnd1 = new ImageView(theEnd1);

sp1.getChildren().add(imgTheEnd1);
Scene endPage1 = new Scene(sp1,700,700);

		
//////////////////////////////////////////BATTLE 1 BOYS///////////////////////////////////////////////////////////////
			
			Pane b1p = new Pane();
			b1p.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #dc143c, #661a33)");
			VBox b1vbox = new VBox(50);
			b1vbox.setAlignment(Pos.CENTER);
			VBox b1vbox1 = new VBox(50);
			b1vbox1.setAlignment(Pos.CENTER);
			HBox b1hbox = new HBox(50);
			Text TrainerName1 = new Text("Teddy");
			Image playerMon = new Image("https://i.ytimg.com/vi/8i41YRX5k5g/maxresdefault.jpg"); 
			ImageView viewPlayer = new ImageView(playerMon);
			
			viewPlayer.setPreserveRatio(true);
			viewPlayer.setFitHeight(300);
			viewPlayer.setFitWidth(300);
			Image b1monster = new Image("https://www.boston.com/wp-content/uploads/2014/04/05212011_0521oped_goose_jpg-7937585-800x478.jpg");
			ImageView monsterb1 = new ImageView(b1monster);
			monsterb1.setPreserveRatio(true);
			monsterb1.setFitHeight(300);
			monsterb1.setFitWidth(300);
			Button atk = new Button("Attack");
			Button returnBtn = new Button("Leave");
			
			//Rectangle healthbar = new Rectangle (100, 50);
			
			Text health = new Text("Health: ");
			Rectangle healthbar = new Rectangle();
			healthbar.setWidth(100);
			healthbar.setHeight(15);
			HBox hbox2 = new HBox();
			hbox2.setAlignment(Pos.CENTER);
			hbox2.setPadding(new Insets(15));
			hbox2.setSpacing(10);
			hbox2.getChildren().addAll(health, healthbar);

			Text health2 = new Text("Health: ");
			Rectangle healthbar2 = new Rectangle();
			healthbar2.setWidth(100);
			healthbar2.setHeight(15);
			HBox hbox3 = new HBox();
			hbox3.setAlignment(Pos.CENTER);
			hbox3.setPadding(new Insets(15));
			hbox3.setSpacing(10);
			hbox3.getChildren().addAll(health2, healthbar2);
			b1vbox.getChildren().addAll(PlayerName, viewPlayer, hbox3, atk);
			//vbox1.setMargin(TrainerName, new Insets(40, 0, 0, 0));
			b1vbox1.getChildren().addAll(TrainerName1, monsterb1, hbox2);
			b1hbox.getChildren().addAll(b1vbox, b1vbox1);
			b1p.getChildren().add(b1hbox);
			
			Scene battle1 = new Scene(b1p,700,700);
			
			atk.setOnAction(e->{
			//	playerMonster.attack(mArr);
			//	wHealth = wHealth - 10;
			//	healthbar.setWidth(wHealth);; //atck button works now w/ health
			//	if(wHealth == 0) {
					//b1vbox1.getChildren().add(returnBtn);
					
				try {
					attackDMG = playerMonster.attack(Jack);
					eAttackDMG = Jack.attack(playerMonster);
					healthbar.setWidth(healthbar.getWidth() - attackDMG);
					healthbar2.setWidth(healthbar2.getWidth() - eAttackDMG);
					if(healthbar.getWidth() <= 0) {
						b1vbox1.getChildren().add(returnBtn);
					}else if(healthbar2.getWidth() <= 0 && healthbar.getWidth() > 0) {
						primaryStage.setScene(endPage1);
					}
				}catch(Exception e1) {
					System.out.println("Stop spamming!");
				}
				
			});
			
			returnBtn.setOnAction(e->{
				map.getChildren().remove(imgView8);
				primaryStage.setScene(mainMap);
				playerMonster.levelUP();
				mainChar.requestFocus();
				
			});
			
			

////////////////////////////////////////////////////////////////Battle 2////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			Pane b2p = new Pane();
			
		
			b2p.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #dc143c, #661a33)");
			VBox b2vbox = new VBox(50);
			b2vbox.setAlignment(Pos.CENTER);
			VBox b2vbox1 = new VBox(50);
			b2vbox1.setAlignment(Pos.CENTER);
			HBox b2hbox = new HBox(50);
			Text TrainerName2 = new Text("Teddy");
			Image playerMon1 = new Image("https://vignette.wikia.nocookie.net/sonicpokemon/images/8/8c/Ashanime.png/revision/latest?cb=20130107051930"); //hardcoded image until later
			ImageView viewPlayer1 = new ImageView(playerMon1);
			
			viewPlayer1.setPreserveRatio(true);
			viewPlayer1.setFitHeight(300);
			viewPlayer1.setFitWidth(300);
			Image b1monster2 = new Image("https://www.boston.com/wp-content/uploads/2014/04/05212011_0521oped_goose_jpg-7937585-800x478.jpg");  //made enemy always have a goose
			ImageView monsterb2 = new ImageView(b1monster2);
			monsterb2.setPreserveRatio(true);
			monsterb2.setFitHeight(300);
			monsterb2.setFitWidth(300);
			Button atk2 = new Button("Attack");
			Button returnBtn2 = new Button("Leave");
			
			//Rectangle healthbar = new Rectangle (100, 50);
			
			Text healthb2 = new Text("Health: ");
			Rectangle healthbarb2 = new Rectangle();
			healthbarb2.setWidth(100); //enemy health bar
			healthbarb2.setHeight(15);
			HBox hboxb2 = new HBox();
			hboxb2.setAlignment(Pos.CENTER);
			hboxb2.setPadding(new Insets(15));
			hboxb2.setSpacing(10);
			hboxb2.getChildren().addAll(healthb2, healthbarb2);

			Text phealthb2 = new Text("Health: ");
			Rectangle phealthbarb2 = new Rectangle();
			phealthbarb2.setWidth(100); //player health bar
			phealthbarb2.setHeight(15);
			HBox hbox4 = new HBox();
			hbox4.setAlignment(Pos.CENTER);
			hbox4.setPadding(new Insets(15));
			hbox4.setSpacing(10);
			hbox4.getChildren().addAll(phealthb2, phealthbarb2);
			b2vbox.getChildren().addAll(PlayerName, viewPlayer1, hbox4, atk2);
			//vbox1.setMargin(TrainerName, new Insets(40, 0, 0, 0));
			b2vbox1.getChildren().addAll(TrainerName2, monsterb2, hboxb2);
			b2hbox.getChildren().addAll(b2vbox, b2vbox1);
			b2p.getChildren().add(b2hbox);
			
			Scene battle2 = new Scene(b2p,700,700);
			
			
			
			atk2.setOnAction(e->{
				
						
					try {
						attackDMG = playerMonster.attack(DEAD);
						eAttackDMG = DEAD.attack(playerMonster);
						healthbarb2.setWidth(healthbarb2.getWidth() - attackDMG);   //enemy health bar
						phealthbarb2.setWidth(phealthbarb2.getWidth() - eAttackDMG); //player health bar shrink
						if(healthbarb2.getWidth() <= 0) {
							b2vbox1.getChildren().add(returnBtn2);
						}else if(phealthbarb2.getWidth() <= 0 && healthbarb2.getWidth() > 0) {
							primaryStage.setScene(endPage1);
						}
					}catch(Exception e1) {
						System.out.println("Stop spamming!");
					}
					
				});
				
				returnBtn2.setOnAction(e->{
					map.getChildren().remove(imgView15);
					primaryStage.setScene(mainMap);
					playerMonster.levelUP();
					mainChar.requestFocus();
					
				});
			
			
			
			
			
			
						
			
			
			
			
////////////////////////////////////////////////////////////////Battle 3/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			Pane b3p = new Pane();
			
			b3p.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #dc143c, #661a33)");
			VBox b3vbox = new VBox(50);
			b3vbox.setAlignment(Pos.CENTER);
			VBox b3vbox1 = new VBox(50);
			b2vbox1.setAlignment(Pos.CENTER);
			HBox b3hbox = new HBox(50);
			Text TrainerName3 = new Text("Teddy");
			Image playerMon2 = new Image("https://i.ytimg.com/vi/8i41YRX5k5g/maxresdefault.jpg"); //hardcoded image until later
			ImageView viewPlayer2 = new ImageView(playerMon2);
			
			viewPlayer2.setPreserveRatio(true);
			viewPlayer2.setFitHeight(300);
			viewPlayer2.setFitWidth(300);
			Image b3monster = new Image("https://www.boston.com/wp-content/uploads/2014/04/05212011_0521oped_goose_jpg-7937585-800x478.jpg");  //made enemy always have a goose
			ImageView monsterb3 = new ImageView(b3monster);
			monsterb3.setPreserveRatio(true);
			monsterb3.setFitHeight(300);
			monsterb3.setFitWidth(300);
			Button atk3 = new Button("Attack");
			Button returnBtn3 = new Button("Leave");
			
			//Rectangle healthbar = new Rectangle (100, 50);
			
			Text healthb3 = new Text("Health: ");
			Rectangle healthbarb3 = new Rectangle();
			healthbarb3.setWidth(100); //enemy health bar
			healthbarb3.setHeight(15);
			HBox hboxb3 = new HBox();
			hboxb3.setAlignment(Pos.CENTER);
			hboxb3.setPadding(new Insets(15));
			hboxb3.setSpacing(10);
			hboxb3.getChildren().addAll(healthb3, healthbarb3);

			Text phealthb3 = new Text("Health: ");
			Rectangle phealthbarb3 = new Rectangle();
			phealthbarb3.setWidth(100); //player health bar
			phealthbarb3.setHeight(15);
			HBox hbox5 = new HBox();
			hbox5.setAlignment(Pos.CENTER);
			hbox5.setPadding(new Insets(15));
			hbox5.setSpacing(10);
			hbox5.getChildren().addAll(phealthb3, phealthbarb3);
			b3vbox.getChildren().addAll(PlayerName, viewPlayer2, hbox5, atk3);
			//vbox1.setMargin(TrainerName, new Insets(40, 0, 0, 0));
			b3vbox1.getChildren().addAll(TrainerName2, monsterb3, hboxb3);
			b3hbox.getChildren().addAll(b3vbox, b3vbox1);
			b3p.getChildren().add(b3hbox);
			
			
			
			
			atk3.setOnAction(e->{
				
						
					try {
						attackDMG = playerMonster.attack(Steve);
						eAttackDMG = Steve.attack(playerMonster);
						healthbarb3.setWidth(healthbarb3.getWidth() - attackDMG);   //enemy health bar
						phealthbarb3.setWidth(phealthbarb3.getWidth() - eAttackDMG); //player health bar shrink
						if(healthbarb3.getWidth() <= 0) {
							b3vbox1.getChildren().add(returnBtn3);
						}else if(phealthbarb3.getWidth() <= 0 && healthbarb3.getWidth() > 0) {
							primaryStage.setScene(endPage1);
						}
						
					}catch(Exception e1) {
						System.out.println("Stop spamming!");
					}
					
				});
				
				returnBtn3.setOnAction(e->{
					map.getChildren().remove(imgView22);
					primaryStage.setScene(endPage);
					playerMonster.levelUP();
					mainChar.requestFocus();
					
				});
			
			
			Scene battle3 = new Scene(b3p,700,700);
			
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		imgView8.setOnMouseClicked(e->{
		primaryStage.setTitle("Fight!");
		primaryStage.setScene(battle1);
		});
		
		imgView15.setOnMouseClicked(e->{
			primaryStage.setTitle("Fight!");
			primaryStage.setScene(battle2);
			});
		
		
		imgView22.setOnMouseClicked(e->{
			primaryStage.setTitle("Fight!");
			primaryStage.setScene(battle3);
			});
		
 
			primaryStage.setScene(mainMap);
			
			primaryStage.setTitle("Start Game!");
			primaryStage.setScene(start);
			primaryStage.show();

		
 
	};
	

 
}





