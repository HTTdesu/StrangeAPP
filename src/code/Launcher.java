package code;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import netscape.javascript.JSObject;

public class Launcher extends Application {

	private Scene scene;
	private Logic logic;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		stage.setTitle("真的不是恶意软件");
		stage.setResizable(false);

		logic = new Logic();

		WebView browser = new WebView();
		browser.setContextMenuEnabled(false);
		
		WebEngine webEngine = browser.getEngine();
		JSObject win = (JSObject) webEngine.executeScript("window");
		win.setMember("native", logic);
		webEngine.load(getClass().getResource("/view/index.html").toString());

		scene = new Scene(browser, 640, 690);
		stage.setScene(scene);
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			public void handle(WindowEvent e) {
				logic.exit();
			}
		});
		stage.show();
	}

}
