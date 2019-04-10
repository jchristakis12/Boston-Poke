package bostonPoke;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Start extends Application {

	
	public static GridPane start() throws Exception {
		// TODO Auto-generated method stub
		
		GridPane p = new GridPane();
		Text Welcome =  new Text("Welcome");
		p.add(Welcome, 100, 0);
		
		Text Name = new Text("Name:");
		p.add(Name, 2, 2);
		
		
		Text Gender = new Text("Gender:");
		p.add(Gender, 2, 4);
		
		
		
		
		
		
		
		
		return p;
		
	}


	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
