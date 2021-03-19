import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanCalculator extends Application {
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();
    private Button btCalculate = new Button("Calculate");
    @Override
    public void start(Stage stage) throws Exception {
        // Create UI
        GridPane pane = new GridPane();
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        // Add to grid pane
        pane.add(new Label("Annual Interest Rate: "), 0, 0);
        pane.add(tfAnnualInterestRate, 1, 0);
        pane.add(new Label("Number of Years: "), 0, 1);
        pane.add(tfNumberOfYears, 1, 1);
        pane.add(new Label("Loan Amount: "), 0, 2);
        pane.add(tfLoanAmount, 1, 2);
        pane.add(new Label("Monthly Payment: "), 0, 3);
        pane.add(tfMonthlyPayment, 1, 3);
        pane.add(new Label("Total Payment: "), 0, 4);
        pane.add(tfTotalPayment, 1, 4);
        pane.add(btCalculate, 1, 5);

        // Set properties for UI
        pane.setAlignment(Pos.CENTER);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);

        // Process events
        btCalculate.setOnAction(e -> calculateLoanPayment()); // register handler

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        stage.setTitle("Loan Calculator");
        stage.setScene(scene);
        stage.show();
    }

    private void calculateLoanPayment() {
        // Get values for text fields
        double interest = Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        // Create a loan object.
        Loan loan = new Loan(interest, year, loanAmount);

        // Display monthly payment and total payment
        tfMonthlyPayment.setText(String.format("$%.2f",
                loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f",
                loan.getTotalPayment()));
    }
}
