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
	
	
	
	
	

	
	
	@Override
	public void start(Stage primaryStage, Player Player, Trainer Trainer) throws Exception{
		
		primaryStage.setTitle("Prudential Center");
		
	
		GridPane p = new GridPane(); //easiest i think
		p.setAlignment(Pos.CENTER);
		
		Text gym = new Text("First Floor"); //set position with fxml
		
		
		
		//some might be unneccesary, can call player methods for fx
		//need these for display
		Monster playerMonster = Player.getMonster();
		String	playerName	=	Player.getName();
		int health = playerMonster.getHealth();
		int maxHp	= playerMonster.getMaxHealth();
		
		//probably uncessecary, need these for click on action methods
		
		
		
		//Now the trainer portion  of the battle screen
		//trainer name
		String tName = Trainer.getName();
		//get current fighting monster
		Monster[] tsMonster =  Trainer.getMonster();
		Monster	monsterInUse=	Find(tsMonster);
		//health bar
		int eMax = monsterInUse.getMaxHealth();
		int eHP = monsterInUse.getHealth();
		//image, all of these must be updated per move when player finishes or hurts trainer monster
		String imageView = monsterInUse.getUrl();
		Image showcased = new Image(imageView);
		
		
		
		
		//aren't updated so hardcode is fine
		Button attack = new Button("Attack");
		Button defend = new Button("Defense Up");
		Button special = new Button("Special Attack");
		Button heal = new Button("Heal");
		//player hp/100 will use a method
		Rectangle pHealth = new Rectangle();
		pHealth.setStroke(Color.BLACK);
		pHealth.setFill(Color.CORNFLOWERBLUE);
		
		
		
		//is always here, but the eStatus must be updated
		Rectangle eHealth = new Rectangle();
		eHealth.setStroke(Color.BLACK);
		eHealth.setFill(Color.BROWN);
		
		//use toString method that is passed any type, but uses the T object to get max and current hp of either p or t
		String pBar = Player.toString();
		String eBar = Trainer.toString();
		
		Text pbar = new Text(pBar);
		Text ebar = new Text(eBar);
		
		
		
		attack.setOnMouseClicked(new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent click) {
				monsterInUse = Find(tsMonster);
				int previousHP = monsterInUse.getHealth();
				int updateHealth = previousHP - playerMonster.getAttackDamage();
				ebar = monsterInUse.toString();
				setDisplay();				
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
			if(tsMonster[i].getHealth() == 0) {
				counter++;
			}else {
				return tsMonster[i];
			}
		}
		//call victory screen? exit battle screen? when counter == tlength?
		return null;
	}
	
	@Override
	public String toString(T o) {
		// x / y
		int x = o.getHealth();
		int y = o.getMaxHealth();
		
		return String.format("HP: %d / %d", x, y);
	}
	

}
