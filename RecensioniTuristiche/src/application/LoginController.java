package application;

import java.io.IOException;

import animatefx.animation.AnimationFX;
import animatefx.animation.FadeOut;
import animatefx.animation.RotateIn;
import animatefx.animation.RotateOutDownLeft;
import animatefx.animation.RotateOutUpRight;
import animatefx.animation.SlideInLeft;
import animatefx.animation.SlideOutRight;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class LoginController {

		@FXML
	    private AnchorPane contentPane;

	    @FXML
	    private AnchorPane memberLoginPane;

	    @FXML
	    private TextField textUsername;

	    @FXML
	    private PasswordField textPassword;

	    @FXML
	    void createAccount(MouseEvent event) {
	    	changeToCreateAccountPanel();
	    }

	    private void changeToCreateAccountPanel() {

//	    	new animatefx.animation.LightSpeedOut(memberLoginPane).play();

//	    	new animatefx.animation.SlideOutUp(memberLoginPane).play();  

	    	AnimationFX slideOutRight = new SlideOutRight(memberLoginPane);
	    	slideOutRight.setOnFinished((ActionEvent)->{
	    		
	    		loadNextPane();
	    		
	    	});
	    	slideOutRight.setDelay(Duration.millis(20));
	    	slideOutRight.play();
			
	    }
	    
	    private void loadNextPane() {
	    	AnchorPane secondView;
			try {
				secondView = (AnchorPane) FXMLLoader.load(getClass().getResource("SignUp.fxml"));
				
				contentPane.getChildren().setAll(secondView);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }

		@FXML
	    void login(MouseEvent event) {

	    }
}
