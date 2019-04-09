package bostonPoke;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;

public class Map1 {
	
	public static BorderPane getMap(){

		BorderPane pane = new BorderPane();
		
		pane.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #dc143c, #661a33)");
		
		
		
		// Entrance into map
		Rectangle door = new Rectangle(20,20,100,100);
		door.setLayoutX(810);
		door.setLayoutY(775);
		
		Rectangle wall1 = new Rectangle(10,500,10,500);
		wall1.setLayoutX(700);
		wall1.setLayoutY(0);
		
		Rectangle wall2 = new Rectangle(100,10,100,10);
		wall2.setLayoutX(610);
		wall2.setLayoutY(480);
		
		Rectangle wall3 = new Rectangle(10, 200, 10, 200);
		wall3.setLayoutX(700);
		wall3.setLayoutY(100);
		
		Rectangle wall4 = new Rectangle(300, 10, 300, 10);
		wall4.setLayoutX(120);
		wall4.setLayoutY(285);
		
		Rectangle wall5 = new Rectangle(10,400, 10, 400);
		wall5.setLayoutX(250);
		wall5.setLayoutY(-400);
		
		
	
		
		
		Image img1 = new Image("https://vignette.wikia.nocookie.net/family-guy-the-quest-for-stuff/images/4/47/Deco-flower-bush.png/revision/latest?cb=20140617165144");
		ImageView imgView1 = new ImageView(img1);
		imgView1.setLayoutX(920);
		imgView1.setLayoutY(550);
		imgView1.setFitHeight(70);
		imgView1.setFitWidth(70);
		//pane.getChildren().add(new ImageView(img1));
		
		Image img2 = new Image("https://vignette.wikia.nocookie.net/family-guy-the-quest-for-stuff/images/4/47/Deco-flower-bush.png/revision/latest?cb=20140617165144");
		ImageView imgView2 = new ImageView(img2);
		imgView2.setLayoutX(920);
		imgView2.setLayoutY(625);
		imgView2.setFitHeight(70);
		imgView2.setFitWidth(70);
		//pane.getChildren().add(new ImageView(img2));
		
		Image img3 = new Image("https://vignette.wikia.nocookie.net/family-guy-the-quest-for-stuff/images/4/47/Deco-flower-bush.png/revision/latest?cb=20140617165144");
		ImageView imgView3 = new ImageView(img3);
		imgView3.setLayoutX(920);
		imgView3.setLayoutY(700);
		imgView3.setFitHeight(70);
		imgView3.setFitWidth(70);
		//pane.getChildren().add(new ImageView(img3));
		
		Image img4 = new Image("https://vignette.wikia.nocookie.net/family-guy-the-quest-for-stuff/images/4/47/Deco-flower-bush.png/revision/latest?cb=20140617165144");
		ImageView imgView4 = new ImageView(img4);
		imgView4.setLayoutX(775);
		imgView4.setLayoutY(550);
		imgView4.setFitHeight(70);
		imgView4.setFitWidth(70);
		//pane.getChildren().add(new ImageView(img4));
		
		Image img5 = new Image("https://vignette.wikia.nocookie.net/family-guy-the-quest-for-stuff/images/4/47/Deco-flower-bush.png/revision/latest?cb=20140617165144");
		ImageView imgView5 = new ImageView(img5);
		imgView5.setLayoutX(775);
		imgView5.setLayoutY(625);
		imgView5.setFitHeight(70);
		imgView5.setFitWidth(70);
		//pane.getChildren().add(new ImageView(img5));
		
		Image img6 = new Image("https://vignette.wikia.nocookie.net/family-guy-the-quest-for-stuff/images/4/47/Deco-flower-bush.png/revision/latest?cb=20140617165144");
		ImageView imgView6 = new ImageView(img6);
		imgView6.setLayoutX(775);
		imgView6.setLayoutY(700);
		imgView6.setFitHeight(70);
		imgView6.setFitWidth(70);
		//pane.getChildren().add(new ImageView(img6));
		
		
		
		
		Image b1_bush = new Image("https://vignette.wikia.nocookie.net/family-guy-the-quest-for-stuff/images/4/47/Deco-flower-bush.png/revision/latest?cb=20140617165144");
		ImageView imgView9 = new ImageView(b1_bush);
		imgView9.setLayoutX(525);
		imgView9.setLayoutY(200);
		imgView9.setFitHeight(70);
		imgView9.setFitWidth(70);
		
		Image b1_bush2 = new Image("https://vignette.wikia.nocookie.net/family-guy-the-quest-for-stuff/images/4/47/Deco-flower-bush.png/revision/latest?cb=20140617165144");
		ImageView imgView10 = new ImageView(b1_bush2);
		imgView10.setLayoutX(600);
		imgView10.setLayoutY(200);
		imgView10.setFitHeight(70);
		imgView10.setFitWidth(70);
		
		Image b1_bush3 = new Image("https://vignette.wikia.nocookie.net/family-guy-the-quest-for-stuff/images/4/47/Deco-flower-bush.png/revision/latest?cb=20140617165144");
		ImageView imgView11 = new ImageView(b1_bush3);
		imgView11.setLayoutX(675);
		imgView11.setLayoutY(200);
		imgView11.setFitHeight(70);
		imgView11.setFitWidth(70);
		
		Image b1_bush4 = new Image("https://vignette.wikia.nocookie.net/family-guy-the-quest-for-stuff/images/4/47/Deco-flower-bush.png/revision/latest?cb=20140617165144");
		ImageView imgView12 = new ImageView(b1_bush4);
		imgView12.setLayoutX(675);
		imgView12.setLayoutY(50);
		imgView12.setFitHeight(70);
		imgView12.setFitWidth(70);
		
		Image b1_bush5 = new Image("https://vignette.wikia.nocookie.net/family-guy-the-quest-for-stuff/images/4/47/Deco-flower-bush.png/revision/latest?cb=20140617165144");
		ImageView imgView13 = new ImageView(b1_bush5);
		imgView13.setLayoutX(600);
		imgView13.setLayoutY(50);
		imgView13.setFitHeight(70);
		imgView13.setFitWidth(70);
		
		Image b1_bush6 = new Image("https://vignette.wikia.nocookie.net/family-guy-the-quest-for-stuff/images/4/47/Deco-flower-bush.png/revision/latest?cb=20140617165144");
		ImageView imgView14 = new ImageView(b1_bush6);
		imgView14.setLayoutX(525);
		imgView14.setLayoutY(50);
		imgView14.setFitHeight(70);
		imgView14.setFitWidth(70);
		
		
		
		
		
		
		Image boss2 = new Image("https://vignette.wikia.nocookie.net/pokemon/images/2/29/Ingo.png/revision/latest?cb=20110225193531");
		ImageView imgView15 = new ImageView(boss2);
		imgView15.setLayoutX(450);
		imgView15.setLayoutY(650);
		imgView15.setFitHeight(100);
		imgView15.setFitWidth(100);
		
		
		
		Image b2_fire1 = new Image("https://images.pond5.com/hand-drawn-fire-animation-transparent-footage-070060562_iconm.jpeg");
		ImageView imgView16 = new ImageView(b2_fire1);
		imgView16.setLayoutX(475);
		imgView16.setLayoutY(510);
		imgView16.setFitHeight(125);
		imgView16.setFitWidth(200);
		
		Image b2_fire2 = new Image("https://images.pond5.com/hand-drawn-fire-animation-transparent-footage-070060562_iconm.jpeg");
		ImageView imgView17 = new ImageView(b2_fire2);
		imgView17.setLayoutX(475);
		imgView17.setLayoutY(410);
		imgView17.setFitHeight(125);
		imgView17.setFitWidth(200);
		
		
		Image b2_fire3 = new Image("https://images.pond5.com/hand-drawn-fire-animation-transparent-footage-070060562_iconm.jpeg");
		ImageView imgView18 = new ImageView(b2_fire3);
		imgView18.setLayoutX(475);
		imgView18.setLayoutY(310);
		imgView18.setFitHeight(125);
		imgView18.setFitWidth(200);
		
		
		Image b2_fire4 = new Image("https://images.pond5.com/hand-drawn-fire-animation-transparent-footage-070060562_iconm.jpeg");
		ImageView imgView19 = new ImageView(b2_fire4);
		imgView19.setLayoutX(300);
		imgView19.setLayoutY(510);
		imgView19.setFitHeight(125);
		imgView19.setFitWidth(200);
		
		Image b2_fire5 = new Image("https://images.pond5.com/hand-drawn-fire-animation-transparent-footage-070060562_iconm.jpeg");
		ImageView imgView20 = new ImageView(b2_fire5);
		imgView20.setLayoutX(300);
		imgView20.setLayoutY(410);
		imgView20.setFitHeight(125);
		imgView20.setFitWidth(200);
		
		
		/*Image b2_fire6 = new Image("https://images.pond5.com/hand-drawn-fire-animation-transparent-footage-070060562_iconm.jpeg");
		ImageView imgView21 = new ImageView(b2_fire6);
		imgView21.setLayoutX(300);
		imgView21.setLayoutY(410);
		imgView21.setFitHeight(125);
		imgView21.setFitWidth(200);*/
		
		
		
		
		Image boss3 = new Image("https://upload.wikimedia.org/wikipedia/en/0/0e/Eggman_robotnik.png");
		ImageView imgView22 = new ImageView(boss3);
		imgView22.setLayoutX(75);
		imgView22.setLayoutY(50);
		imgView22.setFitHeight(150);
		imgView22.setFitWidth(150);
		
		
		Image carpet = new Image("https://d2v9y0dukr6mq2.cloudfront.net/video/thumbnail/VgUL7MqLl/red-carpet-animation_4nia26npx__S0008.jpg");
		ImageView imgView23 = new ImageView(carpet);
		imgView23.setLayoutX(25);
		imgView23.setLayoutY(250);
		imgView23.setFitHeight(150);
		imgView23.setFitWidth(200);
		
		
		
		pane.getChildren().addAll( imgView1, imgView2, imgView3, imgView4, imgView5, imgView6, door, wall1, wall2, wall3, wall4, wall5, imgView9, imgView10, imgView11, imgView12, imgView13, imgView14, imgView15, imgView16, imgView17, imgView18, imgView19, imgView20, imgView22, imgView23);
		
		return pane;
		
	}
	
	
}
