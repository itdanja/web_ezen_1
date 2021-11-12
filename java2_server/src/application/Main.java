package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		
		HBox[] box = new HBox[3];
		
		
		
		
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("server.fxml"));
			Scene scene = new Scene( parent );
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("¼­¹ö");
			primaryStage.show();
		} catch(Exception e) {}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
