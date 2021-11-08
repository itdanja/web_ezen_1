package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Appstart extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Parent parent = FXMLLoader.load( getClass().getResource("/fxml/login.fxml"));
		Scene scene = new Scene( parent );
		// ��Ʈ �ε� 
			Font.loadFont( getClass().getResourceAsStream("�������� Bold.ttf"), 14);
		// �ܺ� ��Ÿ�Ͻ�Ʈ ���� 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
			stage.setResizable(false); // �������� ũ�� ���� 
			stage.setTitle("Nike"); // �������� �̸� 
			// �������� ������ 
				// 1. �̹��� �ҷ�����
				Image image = new Image("file:C:\\Users\\505-t\\git\\web_ezen_1\\java2\\src\\fxml\\stageicon.png");
				stage.getIcons().add(image);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}











