package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ConverterScreenController {
    @FXML
    public Button toArabicButton;

    @FXML
    public Button toRomanButton;

    @FXML
    public TextField romanField;

    @FXML
    public TextField arabicField;


    public void convertToArabic(ActionEvent actionEvent) {
        //TODO
        System.out.println("TO ARABIC");
    }

    public void convertToRoman(ActionEvent actionEvent) {
        System.out.println("TO ROMAN");
    }
}
