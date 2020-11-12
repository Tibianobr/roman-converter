package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.tests.ConversionTests;
import sample.tests.ValidationTests;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        ConversionTests conversionTests = new ConversionTests();
        System.out.println(conversionTests.runTests());
        ValidationTests validationTests = new ValidationTests();
        System.out.println(validationTests.runTests());
        launch(args);
    }
}
