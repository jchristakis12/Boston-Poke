package bostonPoke;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Game extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane pane = Map1.getMap();
		
		
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
		
		pane.getChildren().add(mainChar);
		Scene mainMap = new Scene(pane, 1000,800);
		primaryStage.setTitle("Boston Pokemon Map");
		primaryStage.setScene(mainMap);
		primaryStage.setResizable(false);
		primaryStage.show();
		
		mainChar.requestFocus();
		
	};
		
		
	
	

	public static void main(String[] args) {
		launch(args);
	}
}
	



