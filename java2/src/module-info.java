module java2 {
	requires javafx.controls;
	requires javafx.fxml;
	

	opens Day01 to javafx.graphics, javafx.fxml;
}
