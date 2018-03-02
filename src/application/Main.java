package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Main.fxml"));
			Parent root = loader.load();
			MainController controller = (MainController) loader.getController();
			controller.init(primaryStage);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Application");
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
