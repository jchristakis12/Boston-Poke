package bostonPoke;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Start extends Application {

	
	public static FlowPane start() throws Exception {
		// TODO Auto-generated method stub
		
<<<<<<< HEAD
		FlowPane p = new FlowPane();
		p.setVgap(20);
		p.setHgap(20);
=======
		
		
		
		
		
		
		
		
		GridPane p = new GridPane();
		Text Welcome =  new Text("Welcome");
		p.add(Welcome, 100, 0);
>>>>>>> f84868d68da430c7999f9240980cbad6e8df21db
		
		
		HBox hbox = new HBox(10);
		hbox.setPrefSize(200, 200);
		
		VBox vbox = new VBox(20);
		vbox.setPrefSize(200, 200);
		
		VBox vbox1 = new VBox(20);
		vbox1.setPrefSize(200, 200);
		vbox1.setLayoutX(200);
		vbox1.setLayoutY(200);
		
		Text Welcome =  new Text("Welcome");
		Welcome.setFont(Font.font("Verdana", 45));
		
		
		
		
		Text Name = new Text("Name:");
		Name.setFont(Font.font("Verdana", 34));
		
		
		Text Gender = new Text("Gender:");
		Gender.setFont(Font.font("Verdana", 34));
		
		hbox.getChildren().add(Welcome); 
		vbox.getChildren().addAll(Name, Gender);
		
		vbox1.getChildren().addAll(hbox, vbox);
		
		p.getChildren().addAll(vbox1);

		
		
		
		
		return p;
		
	}


	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
