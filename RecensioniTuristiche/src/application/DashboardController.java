package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.security.auth.kerberos.KeyTab;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import org.controlsfx.control.textfield.TextFields;

import animatefx.animation.AnimationFX;
import animatefx.animation.BounceOut;
import animatefx.animation.FadeIn;
import animatefx.animation.FadeOut;
import animatefx.animation.Hinge;
import animatefx.animation.SlideInLeft;
import animatefx.animation.SlideInUp;
import animatefx.animation.SlideOutRight;
import animatefx.animation.Tada;
import dao.VisitabileDAO;

public class DashboardController implements Initializable{
	
	private VisitabileDAO VDAO = new VisitabileDAO();
	private String luogo ;//qui ci andrà il luogo scelto
	private double x= 0, y=0;
	
	   @FXML
	    private TextField searchBar;
	  
	   @FXML
	    private AnchorPane contentPane;//pagina Iniziale
	   @FXML
	    private AnchorPane content;//il contenitore
	   
	   @FXML
	    private HBox headerBar;
	   @FXML
	    private TextField searchBarOnTop;


	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ArrayList<String> possiblewords = VDAO.mostraLuoghi();
		//crea un autocompletamento della searchBar
		TextFields.bindAutoCompletion(searchBar, possiblewords);
		new Tada(searchBar).play();
		searchBarOnTop.setVisible(false);
	}
	
	@FXML
    void handleButtonOnClick(MouseEvent event) {
		
		makefadeout();
    }
	
	private void makefadeout() {
    	AnimationFX fadeOut = new FadeOut(contentPane);

		fadeOut.setOnFinished((ActionEvent event)->{
			loadNextScene();
			AnimationFX fadeInSearchBar = new FadeIn(searchBarOnTop);
			fadeInSearchBar.play();
		});
		fadeOut.play();

	}

	private void loadNextScene() {
			
		AnchorPane secondView;
		try {
			secondView = (AnchorPane) FXMLLoader.load(getClass().getResource("Exploration.fxml"));
			content.getChildren().setAll(secondView);
			searchBarOnTop.setVisible(true);

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	  @FXML
	    void closeOperation(MouseEvent event) {
		  	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
		  	s.close();
	    }
	  
	  @FXML
	    void minimizeOperation(MouseEvent event) {
		  	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
		  	s.setIconified(true);
	    }
	  
	  @FXML
	    void openLoginPage(MouseEvent event) throws IOException {
		  AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Login.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
	        stage.initStyle(StageStyle.UNDECORATED);
//	        stage.setWidth(1000);
//	        stage.setHeight(700);
	        stage.show();
	    }
	  
	 

	
}
