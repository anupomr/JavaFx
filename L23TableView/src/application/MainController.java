package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable {

	@FXML private TableView<Student> table;
	@FXML private TableColumn<Student, Integer> id;
	@FXML private TableColumn<Student, String> name;
	@FXML private TableColumn<Student, String> surename;
	@FXML private TableColumn<Student, Integer> age;
	
	public ObservableList<Student> list = FXCollections.observableArrayList(
			new Student(1, "Mark", "surname1", 22),
			new Student(2, "Joe", "surname2", 26),
			new Student(3, "Tom", "surname3", 28),
			new Student(4, "Stive", "surname4", 22),
			new Student(5, "Sylver", "surname5", 20)
			);
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO  method stub
		id.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		surename.setCellValueFactory(new PropertyValueFactory<Student, String>("surename"));
		age.setCellValueFactory(new PropertyValueFactory<Student, Integer>("age"));
		table.setItems(list);
		
	}

}
