package code;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Logic {

	public void exit() {
		Alert alert = new Alert(AlertType.WARNING, "�����ء�����������ŷ�ὴ�󻵵���");
		alert.setTitle("");
		alert.setHeaderText("�˼���������");
		alert.showAndWait();
		Platform.exit();
	}

}
