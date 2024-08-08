package fxml;


import java.util.Locale;

import fmx.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
//busca todos os controles
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;
	@FXML
	private Button btSum;
	@FXML
	private Label lbResult;
	
	@FXML
	public void onBtSumAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtNumber1.getText());
			double number2 = Double.parseDouble(txtNumber2.getText());
			double result = number1 + number2;
			
			lbResult.setText(String.format("%.2f", result));
			
		}catch (NumberFormatException e){
			Alerts.showAlert("Erro", "Parse Erros",e.getMessage(), AlertType.ERROR);
			
		}
		
		
		
		
	}

}
