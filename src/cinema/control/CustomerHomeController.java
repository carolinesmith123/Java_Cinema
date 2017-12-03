package cinema.control;

import java.net.URL;
import java.util.ResourceBundle;

import cinema.CinemaMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class CustomerHomeController implements Initializable {

	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	

	
	
	
////////NAVIGATION FUNCTIONS///////
	@FXML
	private void loadfilms(ActionEvent event) {
		//TAKES YOU TO 'WhatsOn' PAGE WHEN 'ALL FILM' BUTTON OR 'WHATS ON' MENU ITEM PRESSED
		CinemaMain main = new CinemaMain();
		main.goToNextPage("view/WhatsOn.fxml", "What's On");
	}
	
	@FXML
	private void logsOut(ActionEvent event) {
		//TAKES YOU TO BACK TO LOGIN SCREEN
		CinemaMain main = new CinemaMain();
		main.goToNextPage("view/LoginScreen.fxml", "Cinema Login");
	}
	
	@FXML 
	private void goToMyAccount() {
		CinemaMain main = new CinemaMain();
		main.goToNextPage("view/CustomerAccount.fxml", "My Account");
	}

}
