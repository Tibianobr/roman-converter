package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import sample.model.ResultNumber;
import sample.service.Manager;

import java.util.Map;

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
    @FXML
    public ListView<String> countList;

    private Manager manager;

    @FXML
    public void initialize() {
        manager = new Manager();

    }

    public void convertToArabic(ActionEvent actionEvent) {
        String conversionType = "romanToArabic";
        ResultNumber result = manager.executeConversion(conversionType,romanField.getText());
        fillData(result,conversionType);
        System.out.println(result.getStats());
    }

    public void convertToRoman(ActionEvent actionEvent) {
        String conversionType = "arabicToRoman";
        ResultNumber result = manager.executeConversion(conversionType,arabicField.getText());
        fillData(result,conversionType);
        System.out.println(result.getStats());
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
        // Fill the stats list
        if (resultNumber.getStats() != null)
        {
            ObservableList<String> items = FXCollections.observableArrayList ();
            for (Map.Entry<String,Integer> letter: resultNumber.getStats().entrySet()) {
                String displayString = letter.getKey() + " = " + letter.getValue();
                items.add(displayString);
            }
            countList.setItems(items);
        }
        else
            countList.setItems(FXCollections.observableArrayList ());

        message.setText(resultNumber.getMessage());
    }
}
