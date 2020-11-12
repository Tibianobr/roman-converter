package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.model.ResultNumber;
import sample.service.Manager;
import sample.service.Validator;

public class ConverterScreenController {
    @FXML
    public Button toArabicButton;

    @FXML
    public Button toRomanButton;

    @FXML
    public TextField romanField;

    @FXML
    public TextField arabicField;

    @FXML
    public Label message;

    private Manager manager;

    @FXML
    public void initialize() {
        manager = new Manager();
    }

    public void convertToArabic(ActionEvent actionEvent) {
        String conversionType = "romanToArabic";
        ResultNumber result = manager.executeConversion(conversionType,romanField.getText());
        fillData(result,conversionType);
    }

    public void convertToRoman(ActionEvent actionEvent) {
        String conversionType = "arabicToRoman";
        ResultNumber result = manager.executeConversion(conversionType,arabicField.getText());
        fillData(result,conversionType);
    }

    private void fillData(ResultNumber resultNumber, String type)
    {
        if (type.equals("arabicToRoman"))
        {
            romanField.setText(resultNumber.getNumber());
        }
        else if(type.equals("romanToArabic"))
        {
            arabicField.setText(resultNumber.getNumber());
        }
        message.setText(resultNumber.getMessage());
    }
}
