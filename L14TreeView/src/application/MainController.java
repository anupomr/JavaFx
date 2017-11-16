package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class MainController implements Initializable 
{
	@FXML
	TreeView <String> treeView;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		TreeItem<String> root= new TreeItem<>("Root");
		
		TreeItem<String> noodA= new TreeItem<>("nood A");
		TreeItem<String> noodB= new TreeItem<>("nood B");
		TreeItem<String> noodC= new TreeItem<>("nood C");
		root.getChildren().addAll(noodA,noodB,noodC);
		/*root.getChildren().add(noodA);
		root.getChildren().add(noodB);
		root.getChildren().add(noodC);*/
		
		treeView.setRoot(root);
	}

}
