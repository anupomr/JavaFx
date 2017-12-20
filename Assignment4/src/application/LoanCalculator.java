package application;



import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LoanCalculator extends Application
{
	TextField txtAnnualInterestRate=new TextField();
	TextField txtLoanAmount=new TextField();
	TextField txtNumberOfYears=new TextField();
	
	TextField txtMonthlyPayment=new TextField();	
	TextField txtTotalPayment=new TextField();
	
	Button calcutate=new Button("Calcutate");
	Button clear = new Button("    Clear    ");
	
	String title="  Loan  "+" Calculator ";
	Label lblTitle=new Label(title);
	 
	@Override
	public void start(Stage primaryStage) throws Exception 
	{

		try {
			GridPane gridPane= new GridPane();
			gridPane.setAlignment(Pos.CENTER);
			gridPane.setVgap(6);
			gridPane.setHgap(6);
			gridPane.add(lblTitle, 0, 0);
			lblTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			
			gridPane.add(new Label("Annual Interest Rate"), 0, 3);
			gridPane.add(txtAnnualInterestRate, 2, 3);
			
			gridPane.add(new Label("Number Of Years"), 0, 4);
			gridPane.add(txtNumberOfYears, 2, 4);
			
			gridPane.add(new Label("Loan Amount"), 0, 5);
			gridPane.add(txtLoanAmount, 2, 5);
			
			gridPane.add(new Label("Monthly Payment"), 0, 6);
			gridPane.add(txtMonthlyPayment, 2, 6);
			txtMonthlyPayment.setEditable(false);
			
			gridPane.add(new Label("Total payment"), 0, 8);
			gridPane.add(txtTotalPayment, 2, 8);
			txtTotalPayment.setEditable(false);
			
			gridPane.add(calcutate, 2, 10);
			gridPane.add(clear, 2, 12);
			
			Scene scene = new Scene(gridPane,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Loan Calculator");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) 
		{
			e.printStackTrace();
		}
		calcutate.setOnAction((ActionEvent e)->
		{
			this.calculateLoanPayment();
		});
		clear.setOnAction((ActionEvent e)->
		{			
			this.clearText();
		});
		
	}

	public static void main(String[] args) 
	{
		launch(args);
		
	}
	
	public  void calculateLoanPayment() 
	{
		DecimalFormat daf2 = new DecimalFormat(".##");
		double annualInterestRate=(Double.parseDouble(txtAnnualInterestRate.getText().trim()));
		double loanAmount=(Double.parseDouble(txtLoanAmount.getText().trim()));		
		int numberOfYears=(Integer.parseInt(txtNumberOfYears.getText().trim()));
		
		Loan newLoan=new Loan(annualInterestRate,numberOfYears,loanAmount);
		txtMonthlyPayment.setText(String.valueOf(daf2.format(newLoan.getMonthlyPayment())));
		txtTotalPayment.setText(String.valueOf(daf2.format(newLoan.getMonthlyPayment()*numberOfYears*12) ));
	}
	
	public  void clearText() 
	{
		 txtAnnualInterestRate.clear();
		 txtLoanAmount.clear();
		 txtNumberOfYears.clear();
		 txtMonthlyPayment.clear();
		 txtTotalPayment.clear();
	}
	
	
}

