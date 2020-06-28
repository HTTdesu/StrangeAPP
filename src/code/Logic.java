package code;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Logic {

	public void exit() {
		Alert alert = new Alert(AlertType.WARNING, "呜呜呜······欧尼酱大坏蛋！");
		alert.setTitle("");
		alert.setHeaderText("人家生气啦！");
		alert.showAndWait();
		Platform.exit();
	}

}
