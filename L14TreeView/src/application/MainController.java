package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController implements Initializable 
{
	@FXML
	TreeView <String> treeView;
	Image icon=new Image(getClass().getResourceAsStream("/img/icon.png"));

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		TreeItem<String> root= new TreeItem<>("Root", new ImageView(icon));
		
		TreeItem<String> noodA= new TreeItem<>("nood A");
		TreeItem<String> noodB= new TreeItem<>("nood B");
		TreeItem<String> noodC= new TreeItem<>("nood C");
		
		root.getChildren().addAll(noodA,noodB,noodC);
		
		/*root.getChildren().add(noodA);
		root.getChildren().add(noodB);
		root.getChildren().add(noodC);*/
		
		TreeItem<String> noodA1= new TreeItem<>("nood A 1");
		TreeItem<String> noodB1= new TreeItem<>("nood B 1");
		TreeItem<String> noodC1= new TreeItem<>("nood C 1");
		noodA.getChildren().addAll(noodA1,noodB1,noodC1);
		
		treeView.setRoot(root);
	}

}
