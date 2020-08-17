package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import animatefx.animation.FadeIn;
import dao.VisitabileDAO;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class ExplorationController implements Initializable {
	
	 @FXML
	    private AnchorPane rootPane;
	  @FXML
	    private VBox contentVbox;
	  
	  private VisitabileDAO VDAO = new VisitabileDAO();
	  private String luogo;

	

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		rootPane.setOpacity(0);
		makefadein();	
		 rootPane.setPrefSize(974, 409);
		 rootPane.setBottomAnchor(rootPane, (double) 0);
		 rootPane.setTopAnchor(rootPane, (double) 0);
		 int nVisitabili  = VDAO.numeroVisitabiliXLuogo(luogo);
		
		 //aggiungo card visitabili(item) allo scroll pane
		 Node[] nodes = new Node[nVisitabili];
	        for (int i = 0; i < nodes.length; i++) {
	            try {

	                final int j = i;
	                nodes[i] = FXMLLoader.load(getClass().getResource("Item.fxml"));

	                //give the items some effect

	                nodes[i].setOnMouseEntered(event -> {
	                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
	                });
	                nodes[i].setOnMouseExited(event -> {
	                    nodes[j].setStyle("-fx-background-color : #02030A");
	                });
	                contentVbox.getChildren().add(nodes[i]);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	}
	
	private void makefadein() {
		FadeTransition fadeTransition = new FadeTransition();
		fadeTransition.setDelay(Duration.millis(200));
		fadeTransition.setNode(rootPane);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();
		 
	}

}
