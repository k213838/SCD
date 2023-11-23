package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
	ArrayList<Contact> Contacts = new ArrayList<Contact>();
    @FXML
    private ListView<String> ContactList;

    @FXML
    private Button addButton;

    @FXML
    private Button editButton;

    @FXML
    private TextField emailField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField phoneField;

    @FXML
    private Button removeButton;

    @FXML
    void EditContact(ActionEvent event) {
    	int selectedTask = ContactList.getSelectionModel().getSelectedIndex();
    	ContactList.getItems().set(selectedTask, nameField.getText() +" " + phoneField.getText()+" "+emailField.getText());
    	Contacts.set(selectedTask, new Contact(nameField.getText(),phoneField.getText(),emailField.getText()));
    }

    @FXML
    void addContact(ActionEvent event) {
    	Contacts.add(new Contact(nameField.getText(),phoneField.getText(),emailField.getText()));
    	ContactList.getItems().add(nameField.getText() +" " + phoneField.getText()+" "+emailField.getText());
    	nameField.setText("");
    	phoneField.setText("");
    	emailField.setText("");

    }

    @FXML
    void removeContact(ActionEvent event) {
    	int selectedTask = ContactList.getSelectionModel().getSelectedIndex();
    	ContactList.getItems().remove(selectedTask);
    	Contacts.remove(selectedTask);

    }

}
