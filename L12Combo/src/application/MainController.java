package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.activation.ActivationDataFlavor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MainController implements Initializable
{
	
	@FXML
	public Label myLabel;
	
	@FXML
	public ComboBox<String > comboBox;
	
	@FXML
	public ListView <String> myListView;
	
	ObservableList<String > list= FXCollections.observableArrayList("ON","QC","AB");
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		// Initialized GUI value
		comboBox.setItems(list);
		myListView.setItems(list);
		myListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	//for Listener
	public void ComboChanged(ActionEvent event)
	{
		myLabel.setText(comboBox.getValue());
		//comboBox.getItems().addAll("BC","SK","MB");
		
	}
	public void buttonAction(ActionEvent event)
	{
		//myLabel.setText(comboBox.getValue());
		//comboBox.getItems().addAll("BC","SK","MB");
		myListView.getItems().addAll("BC","SK","MB");
	}

}
