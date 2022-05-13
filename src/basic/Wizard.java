package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application{
	
	private Stage window;
	private Scene sceneOne;
	private Scene sceneTwo;
	private Scene sceneThree;
	
	private String pathCss = getClass().getResource("/basic/wizard.css").toExternalForm();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		
		createStepOne();
		createStepTwo();
		createStepThree();
		
		window.setScene(sceneOne);
		window.setTitle("Wizard:: Step One");
		window.show();
		
	}
	
	private void createStepOne() {
		Button next = new Button("Next >>");
		next.getStyleClass().add("button");
		next.setOnAction(e->{
			window.setScene(sceneTwo);
			window.setTitle("Wizard:: Step Two");
		});
		
		HBox box = new HBox();
		box.setSpacing(5);
		box.getStyleClass().add("content");
		box.setAlignment(Pos.BOTTOM_RIGHT);
		box.getChildren().add(next);
		
		sceneOne = new Scene(box,400,400);
		sceneOne.getStylesheets().add(pathCss);
		sceneOne.getStylesheets().add("https://fonts.googleapis.com/css2?family=Bebas+Neue");
	}
	
	private void createStepTwo() {
		
		Button past = new Button("<< Past");
		past.getStyleClass().add("button");
		past.setOnAction(e->{
			window.setScene(sceneOne);
			window.setTitle("Wizard:: Step One");
		});
		Button next = new Button("Next >>");
		next.getStyleClass().add("button");
		next.setOnAction(e->{
			window.setScene(sceneThree);
			window.setTitle("Wizard:: Step Three");
		});
		
		HBox box = new HBox();
		box.setSpacing(5);
		box.getStyleClass().add("content");
		box.setAlignment(Pos.BOTTOM_RIGHT);
		box.getChildren().add(past);
		box.getChildren().add(next);
		
		sceneTwo = new Scene(box,400,400);
		sceneTwo.getStylesheets().add(pathCss);
		sceneTwo.getStylesheets().add("https://fonts.googleapis.com/css2?family=Bebas+Neue");
	}
	
	private void createStepThree() {
		
		Button past = new Button("<< Past");
		past.getStyleClass().add("button");
		past.setOnAction(e->{
			window.setScene(sceneTwo);
			window.setTitle("Wizard :: Step Two");
		});
		Button next = new Button("Finish >>");
		next.getStyleClass().add("button");
		next.setOnAction(e->{
			System.exit(0);
		});
		
		HBox box = new HBox();
		box.setSpacing(5);
		box.getStyleClass().add("content");
		box.setAlignment(Pos.BOTTOM_RIGHT);
		box.getChildren().add(past);
		box.getChildren().add(next);
		
		sceneThree = new Scene(box,400,400);
		sceneThree.getStylesheets().add(pathCss);
		sceneThree.getStylesheets().add("https://fonts.googleapis.com/css2?family=Bebas+Neue");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
