package Day01;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day01_1 extends Application {
						// 1. ��ӹޱ� 
	@Override // 2. start �������̵� �ϱ� 
	public void start(Stage stage) throws Exception {
							// 3. ���������� ���ϱ� 
		//6. �����̳� ����� 
		VBox vBox = new VBox();
			// 7. ��Ʈ�� ���� 
				// 8. ��ư ����� 
				Button button = new Button();
				button.setText("�ݱ�");
				button.setOnAction( e -> Platform.exit() );
				
		// 10. �����̳� ��Ʈ�� �߰��ϱ� 
		vBox.getChildren().add(button );
		
		// 11. �� ����� -> �����̳ʸ� ���� �ֱ� 
		Scene scene = new Scene(vBox , 500 ,500);
		// 12. ���� ���������� �ֱ� 
		stage.setScene(scene);
		stage.show(); // 5. �������� ����
	}
	
	public static void main(String[] args) {
		
		launch(args); // 4. main�޼ҵ忡 start �޼ҵ� ȣ���ϱ� 
		
	}
	

}
