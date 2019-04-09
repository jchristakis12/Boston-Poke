package bostonPoke;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import monsters.Monster;

public class Battle1 {
	
	@FXML
	Button attack;
	
	static String playerName;
	static Text pName;//shows
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
	
	
	static Text pbar;
	static Text ebar;
	
	
	public static Pane getBattle(Player player, Trainer opponent) {
		
		
		Pane p = new Pane();		
		
		Text gym = new Text("First Floor");
		
		
		
		setPlayer(player);
		setTrainer(opponent);
		
		Button attack = new Button("Attack");
		
		
		
		p.getChildren().addAll(pName, pV, pHealth, pbar, t_Name, showcased, eHealth, ebar, attack);
		return p;
		
	}
	
	protected static void setDisplay() {
		pbar = healthBar(playerMonster);
		ebar = healthBar(monsterInUse);
		
	}

	public static Monster Find(Monster[] tsMonster) {
		boolean found = false;
		for(int i = 0; i <= tsMonster.length -1; i++) {
			if(tsMonster[i].isHealthy()) {
				return tsMonster[i];
			}
		}
		return null;
	}
	
	public static void setTrainer(Trainer opponent) {
		Trainer mark = new Trainer(1, true);
		tName = mark.getName();
		t_Name = new Text(tName);
		
		tsMonster =  mark.getMonster();
		monsterInUse=	Find(tsMonster);
		
		String url = monsterInUse.getURL();
		Image image = new Image(url);
		showcased = new ImageView(image);
		
		
		eHealth = new Rectangle();
		eHealth.setStroke(Color.BLACK);
		eHealth.setFill(Color.BROWN);
		
		ebar = healthBar(monsterInUse);
	}
	
	public static void setPlayer(Player player) {
		playerMonster = player.getMonster(); //gets monster

		playerName	= player.getName(); // for display of player name
		Text pName = new Text(playerName);
		
		String pshow = playerMonster.getURL(); //displays monster with url
		Image show = new Image(pshow);
		pV = new ImageView(show); 
		
		
		Rectangle pHealth = new Rectangle(); //health bar
		pHealth.setStroke(Color.BLACK);
		pHealth.setFill(Color.CORNFLOWERBLUE);
		
		pbar = healthBar(playerMonster); //health bar text
		
	}
	
	
	public static Text healthBar(Monster playerMonster2) {
		return new Text (String.format("HP: %d / %d", playerMonster2.getHealth(), playerMonster2.getMaxHealth()));
	}
	
	public Button getButton() {
		return attack;
	}
	

}
