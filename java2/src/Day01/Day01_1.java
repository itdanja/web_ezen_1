package Day01;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day01_1 extends Application {
						// 1. 상속받기 
	@Override // 2. start 오버라이딩 하기 
	public void start(Stage stage) throws Exception {
							// 3. 스테이지명 정하기 
		//6. 컨테이너 만들기 
		VBox vBox = new VBox();
			// 7. 컨트롤 구성 
				// 8. 버튼 만들기 
				Button button = new Button();
				button.setText("닫기");
				button.setOnAction( e -> Platform.exit() );
				
		// 10. 컨테이너 컨트롤 추가하기 
		vBox.getChildren().add(button );
		
		// 11. 씬 만들기 -> 컨테이너를 씬에 넣기 
		Scene scene = new Scene(vBox , 500 ,500);
		// 12. 씬을 스테이지에 넣기 
		stage.setScene(scene);
		stage.show(); // 5. 스테이지 실행
	}
	
	public static void main(String[] args) {
		
		launch(args); // 4. main메소드에 start 메소드 호출하기 
		
	}
	

}
