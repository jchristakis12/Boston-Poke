package bostonPoke;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import monsters.Monster;

public class Battle {
	//bottom left
	String playerName;
	Monster playerMonster;
	Image show;
	
	//top right
	String tName;
	Monster[] tsMonster;
	Monster monsterInUse;
	Image showcased;
	
	
	Text pbar;
	Text ebar;
	
	

	
	

	public void start(Stage primaryStage, Player Player, Trainer Trainer) throws Exception{

	public void start(Stage primaryStage, Player Player, Trainer oponnent) throws Exception{

		
		primaryStage.setTitle("Prudential Center");
		
	
		GridPane p = new GridPane(); //easiest i think
		p.setAlignment(Pos.CENTER);
		
		Text gym = new Text("First Floor"); //set position with fxml
		
		setPlayer();
		setTrainer();

		Button attack = new Button("Attack");
		Button defend = new Button("Defense Up");
		Button special = new Button("Special Attack");
		Button heal = new Button("Heal");
		
		
		
		
		
		attack.setOnMouseClicked(new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent click) {
				
				//use get methods for math
				//then update the hbar string
				int newHealth = monsterInUse.getHealth() - playerMonster.getAttackDMG();
				if(newHealth <= 0) {
					Switch(tsMonster);
				}
				monsterInUse.setMaxHealth(newHealth);
				ebar = healthBar(monsterInUse);
				
			}
		});
		
		defend.setOnMouseClicked(new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent click) {
				
				//use get methods for math
				//then update the hbar string
				int newHealth = monsterInUse.getHealth() - playerMonster.getAttackDMG();
				if(newHealth <= 0) {
					Switch(tsMonster);
				}
				monsterInUse.setMaxHealth(newHealth);
				ebar = healthBar(monsterInUse);
				
			}
		});
		

		special.setOnMouseClicked(new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent click) {
				
				//use get methods for math
				//then update the hbar string
				int newHealth = monsterInUse.getHealth() - playerMonster.getAttackDMG();
				if(newHealth <= 0) {
					Switch(tsMonster);
				}
				monsterInUse.setMaxHealth(newHealth);
				ebar = healthBar(monsterInUse);
				
			}
		});
		
		heal.setOnMouseClicked(new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent click) {
				
				//use get methods for math
				//then update the hbar string
				int newHealth = monsterInUse.getHealth() - playerMonster.getAttackDMG();
				if(newHealth <= 0) {
					Switch(tsMonster);
				}
				monsterInUse.setMaxHealth(newHealth);
				ebar = healthBar(monsterInUse);
				
			}
		});
		
		primaryStage.setScene(new Scene(p, 400, 225));
		primaryStage.show();
	

}
	//updates battlescreen after each click
	protected void setDisplay() {
		
		
	}

	public Monster Find(Monster[] tsMonster) {
		boolean found = false;
		for(int i = 0; i <= tsMonster.length -1; i++) {
			if(tsMonster[i].inUse) {
				return tsMonster[i];
			}
		}
	}
	
	
	public Monster Switch(Monster[] tsMonster) {
		int counter = 0;
		
		for(int i = 0; i <= tsMonster.length; i++) {
			
			if(tsMonster[i].isHealthy()) {
				return tsMonster[i];
			}
			
		}
		
		Text victory = new Text("YOU WON");
		return null;
	}
	
	@Override
	public String toString(T o) {
		// x / y
		int x = o.getHealth();
		int y = o.getMaxHealth();
		
		return String.format("HP: %d / %d", x, y);
	}
	
	public void setPlayer() {
		playerName	=	Player.getName();	
		
		playerMonster = Player.getMonster();
		
		String player = playerMonster.getUrl();
		show = new Image(player);
		
		
		Rectangle pHealth = new Rectangle();
		pHealth.setStroke(Color.BLACK);
		pHealth.setFill(Color.CORNFLOWERBLUE);
		
		pbar = healthBar(playerMonster);
	}
	
	
	
	public void setTrainer() {
		tName = Trainer.getName();
		
		tsMonster =  Trainer.getMonster();
		monsterInUse=	Find(tsMonster);
		
		ImageView imageView = monsterInUse.getUrl();
		showcased = new Image(imageView);
		
		Rectangle eHealth = new Rectangle();
		eHealth.setStroke(Color.BLACK);
		eHealth.setFill(Color.BROWN);
		
		ebar = healthBar(monsterInUse);
	}
	
	
	public Text healthBar(Monster Monster) {
		return String.format("HP: %d / %d", Monster.getHealth(), Monster.getMaxHealth());
	}
	

}
