package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class MainController {
	@FXML LineChart<String, Number> lineChart;
	
	public void btn(ActionEvent event) {
		lineChart.getData().clear();
		
		XYChart.Series<String, Number> series =new XYChart.Series<String, Number>();
		series.getData().add(new XYChart.Data<String, Number>("Jan",200 ));
		series.getData().add(new XYChart.Data<String, Number>("Feb",500 ));
		series.getData().add(new XYChart.Data<String, Number>("Mar",200 ));
		series.getData().add(new XYChart.Data<String, Number>("Apr",200 ));
		series.setName("Pay 1");
		
		XYChart.Series<String, Number> series1 =new XYChart.Series<String, Number>();
		series1.getData().add(new XYChart.Data<String, Number>("Jan",400 ));
		series1.getData().add(new XYChart.Data<String, Number>("Feb",100 ));
		series1.getData().add(new XYChart.Data<String, Number>("Mar",800 ));
		series1.getData().add(new XYChart.Data<String, Number>("Apr",500 ));
		series1.setName("Pay 2");
		
		XYChart.Series<String, Number> series2 =new XYChart.Series<String, Number>();
		series2.getData().add(new XYChart.Data<String, Number>("Jan",300 ));
		series2.getData().add(new XYChart.Data<String, Number>("Feb",250 ));
		series2.getData().add(new XYChart.Data<String, Number>("Mar",500 ));
		series2.getData().add(new XYChart.Data<String, Number>("Apr",350 ));
		series2.setName("Pay 2");
		
		lineChart.getData().addAll(series, series1, series2);
	}

}
