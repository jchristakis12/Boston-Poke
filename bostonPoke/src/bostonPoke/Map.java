package bostonPoke;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Map extends Window implements Display {
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		Pane p = new Pane(); //free form pane, hbox and vbox are too limiting
		Text gym = new Text("Prudential Center"); //set an initial location
		//add image view that can move around
		
		waldo.setX(100);
		waldo.setY(100);
		
		waldo.setOnKeyPressed(e->{
			
		});
		
		/***
		waldo.setOnKeyPressed(new EventHandler<KeyEvent>() { //waldo.source object fires keyevent

			@Override
			public void handle(KeyEvent event) {
				// TODO Auto-generated method stub
				if(event.getCode() == KeyCode.UP) {
					waldo.setY(waldo.getY() - 3);
				}
			}
			
			
			
		});
		***/
		
		p.setOnMouseMoved(new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent move) {
				waldo.setY(move.getY());
				waldo.setX(move.getX());
			}
		});
	

}
