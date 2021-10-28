package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Appstart extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Parent parent = FXMLLoader.load( getClass().getResource("/fxml/login.fxml"));
		Scene scene = new Scene( parent );
		stage.setScene(scene);
			stage.setResizable(false); // 스테이지 크기 고정 
			stage.setTitle("Nike"); // 스테이지 이름 
			// 스테이지 아이콘 
				// 1. 이미지 불러오기
				Image image = new Image("file:C:\\Users\\505-t\\git\\web_ezen_1\\java2\\src\\fxml\\stageicon.png");
				stage.getIcons().add(image);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}











