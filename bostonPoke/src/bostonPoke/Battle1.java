package bostonPoke;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import monsters.Monster;

public class Battle1 extends Application implements Initializable  {
	



static Text t_Name;
static int eHealth = 0;
static Monster[] tsMonster;
static Monster monsterInUse;
static ImageView showcased;
static Rectangle eBealth;
static Text ebar;




static Pane p;
static Player player1;
static Text pName;
static Text pbar;
static Rectangle pHealth;
static Button attack;

public static Button leave;


public static void main(String[] args) {
launch(args);
}



/*
 * public class BattleTest {
	 
 */

	
	 public static void getBattle() {
		player1 = new Player(Player.selectMonster(0),"yes", "No");

		getBattle(player1, Game.bigChungus);
		
		
		
	}
	 
	 
	 public static GridPane getBattle(Player player, Trainer opponent) {
		
		
		GridPane p = new GridPane();
		p.setPrefSize(500, 500);
		//p.setHgap(10);
		Text floor = new Text("First Floor");
		
		p.add(floor, 250, 500);
		
		
		
		
		t_Name = new Text(opponent.getName());
		p.add(t_Name, 499, 3);
		
		tsMonster = opponent.getMonster();
		monsterInUse = Find(tsMonster);
		showcased = new ImageView(monsterInUse.getURL());
		ebar = new Text(String.format("HP: %d / %d", monsterInUse.getHealth(), monsterInUse.getMaxHealth()));
		p.add(ebar, 499, 5);
		
		eBealth = new Rectangle(20, 20, 30, 10);
		eBealth.setStroke(Color.BLACK);
		eBealth.setFill(Color.BROWN);
		
		p.add(eBealth, 499, 7);
		
		
		pName = new Text(player.getName());
		p.add(pName, 0, 3);
		
		pHealth = new Rectangle(20, 20, 30, 10); //health bar
		pHealth.setStroke(Color.BLACK);
		pHealth.setFill(Color.CORNFLOWERBLUE);
		p.add(pHealth, 0, 7);

		
		
		leave = new Button ("Victory!");
		
		
		
		
		
		Button attack = new Button("Attack");
		p.add(attack, 0, 10);
		
		attack.setOnAction(e->{
			monsterInUse.setHealth(10);
		
			ebar.setText(String.format("HP: %d / %d", monsterInUse.getHealth(), monsterInUse.getMaxHealth()));	
			eBealth.setX(eBealth.getX() - 10);
			eBealth.setWidth(eBealth.getWidth() - 3);
			
			try {
				if(monsterInUse.getHealth() <= 0) {
					monsterInUse = Find(tsMonster);
					if(monsterInUse == null) {
						p.add(leave, 0, 15);
					}
				}
			}catch(NullPointerException ex) {
			
			}
			
			eBealth.setX(eBealth.getX() - 10);

			monsterInUse = Find(tsMonster);
		});
		
		
		
		
		
		
		/*
		 * Here is the start of the player side of things
		 */
		eBealth.requestFocus();
		
		return p;
		
	}
	 
	
	
	public static void setTrainer(Trainer opponent) {
		
		
	}
	
	public static Monster Find(Monster[] tsMonster) {
		
		for(int i = 0; i <= tsMonster.length -1; i++) {
			if(tsMonster[i].isHealthy()) {
				return tsMonster[i];
			}
		
		}
		return null;
	}
	/*
	 * public static String healthBar(Monster playerMonster2) {
		return new String (String.format("HP: %d / %d", playerMonster2.getHealth(), playerMonster2.getMaxHealth()));
	}
	
	 */



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}


	
	}
	
	
	/*
	 * protected static void setDisplay() {
		ebar.setText(healthBar(tsMonster[0]));
		
	}
	
	 */
	
	
	

	
	

