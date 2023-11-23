package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable{
	Book a;
	Book b;
	Book c;
    @FXML
    private TableView<Book> LibraryTable;

    @FXML
    private TableColumn<Book, String> authorCol;

    @FXML
    private TextField authorField;

    @FXML
    private TableColumn<Book, String> genreCol;

    @FXML
    private TextField genreField;

    @FXML
    private Button searchButton;

    @FXML
    private TableColumn<Book, String> titleCol;

    @FXML
    private TextField titleField;

    
    @FXML
    void searchAction(ActionEvent event) {
    	if(titleField.getText().equals(a.title)||titleField.getText().equals(b.title)||titleField.getText().equals(c.title)) {
        	LibraryTable.getItems().add(new Book(a.title,a.author,a.genre));    
    	
    	}
    	else if(authorField.getText().equals(a.author)||authorField.getText().equals(b.author)||authorField.getText().equals(c.author)) {
        	LibraryTable.getItems().add(new Book(a.title,a.author,a.genre));    
    		
    		
    	}
    	else if(genreField.getText().equals(a.genre)||genreField.getText().equals(b.genre)||genreField.getText().equals(c.genre)) {
        	LibraryTable.getItems().add(new Book(a.title,a.author,a.genre));    
    		
    		
    	}
    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		titleCol.setCellValueFactory(new PropertyValueFactory<Book,String>("title"));
		authorCol.setCellValueFactory(new PropertyValueFactory<Book,String>("author"));
		genreCol.setCellValueFactory(new PropertyValueFactory<Book,String>("genre"));
		 a = new Book("Harry Potter and The Sorcerer's Stone ","J.K Rowling","Fantasy");
		 b = new Book("1984 ","George Orwell","Fiction");
		 c = new Book("The Secret Seven ","Enid Blyton","Mystery");
		
	}

    
}
