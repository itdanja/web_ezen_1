package Day01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day01_2_fxml extends Application {
	
	@Override
	public void start(Stage stage ) throws Exception {
		// 1. [씬빌더에서 작업한파일]fxml 불러오기 
		Parent parent = FXMLLoader.load( getClass().getResource("test1.fxml") );
		// 2. parent -> scene
		Scene scene = new Scene( parent );
		// 3. scene -> stage 
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
