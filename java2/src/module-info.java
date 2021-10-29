module java2 {
	requires javafx.controls;
	requires javafx.fxml;
	

	opens Day01 to javafx.graphics, javafx.fxml;
	opens app to javafx.graphics, javafx.fxml;
	opens controller to javafx.graphics, javafx.fxml;
	opens Day02 to javafx.graphics, javafx.fxml;
}
