package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private double  x =0, y=0;
	@Override
	public void start(Stage primaryStage) {
		try {
			//rendo lo stage trascinabile
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
			root.setOnMousePressed(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					x = event.getSceneX();
					y = event.getSceneY();
				}
				
			});
			root.setOnMouseDragged(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					primaryStage.setX(event.getScreenX()-x);
					primaryStage.setY(event.getScreenY()-y);
				}
			});
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
	        primaryStage.initStyle(StageStyle.UNDECORATED);
	        primaryStage.setWidth(1000);
	        primaryStage.setHeight(700);
	        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
