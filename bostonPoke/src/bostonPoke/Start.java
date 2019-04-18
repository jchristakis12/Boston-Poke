package bostonPoke;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
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

	
	public static GridPane start() throws Exception {
		// TODO Auto-generated method stub
		
		//FlowPane p = new FlowPane();
		
		
		
		
		
		
		
		

		GridPane p = new GridPane();
		//p.setGridLinesVisible(true);
		p.setAlignment(Pos.CENTER);
		p.setPrefSize(500, 400);
		p.setHgap(10);
		p.setVgap(10);
		p.setPadding(new Insets(5));

		
		
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
		
		
		

		Welcome.setFont(Font.font("Tahoma", 32));
		p.add(Welcome, 100, 0);

		
	//	p.add(Welcome, 0, 0, 3, 1);

		Text Name = new Text("Name: ");
		p.add(Name, 0, 1);
		
		Text Gender = new Text("Gender: ");
		p.add(Gender, 0, 2);
		
		Text SelectPokemon = new Text("Select Pokemon: ");
		p.add(SelectPokemon, 0, 3);
		
		return p;
		
	}


	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
