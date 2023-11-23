package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
	ArrayList<Task> Tasks = new ArrayList();
	
    @FXML
    private TextField TaskField;

    @FXML
    private Button addButton;

    @FXML
    private Button removeButton;

    @FXML
    private ListView<String> taskList;

    @FXML
    private Button viewButton;
    @FXML
    private Button completeButton;
    @FXML
    void addTask(ActionEvent event) {
    	Tasks.add(new Task(TaskField.getText()));
    	TaskField.setText("");
    }

    @FXML
    void removeTask(ActionEvent event) {
    	int selectedTask = taskList.getSelectionModel().getSelectedIndex();
    	taskList.getItems().remove(selectedTask);
    	Tasks.remove(selectedTask);
    }

    @FXML
    void viewTasks(ActionEvent event) {
    	for(int i = 0 ; i < Tasks.size(); i++) {
    		taskList.getItems().add(Tasks.get(i).name+" "+ Tasks.get(i).Status);
    		
    	}
    }
    
    @FXML
    void completeTask(ActionEvent event) {
    	int selectedTask = taskList.getSelectionModel().getSelectedIndex();
    	Tasks.get(selectedTask).setStatusComplete();
    	taskList.getItems().set(selectedTask, Tasks.get(selectedTask).name+" "+ Tasks.get(selectedTask).Status);

    }
}
