package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Controller {
	String username = "admin";
	String password = "1234";
	Stage primaryStage = new Stage();
	Parent root;
	Scene scene;
    @FXML
    private PasswordField passwordField;

    @FXML
    private Button submit;

    @FXML
    private TextField usernameField;
    
    @FXML
    void submitAction(ActionEvent event) throws IOException {
    	if(usernameField.getText().equals(username) && passwordField.getText().equals(password)) {
			 root = FXMLLoader.load(getClass().getResource("LoginSuccessfull.fxml"));
			 scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();

    		
    	}else {
			 root = FXMLLoader.load(getClass().getResource("LoginFailed.fxml"));
			 scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();

    		
    	}
    	
    }    

    @FXML
    private Button loginSuccessButton;
    
    @FXML
    private Button loginFailedButton;
    
    @FXML
    void closeWindow(ActionEvent event) {
    	Stage stage = (Stage) loginSuccessButton.getScene().getWindow();
    	stage.close();
    	
    }    
    @FXML
    void closewindow(ActionEvent event) {
    	Stage stage = (Stage) loginFailedButton.getScene().getWindow();
    	stage.close();

    }
}