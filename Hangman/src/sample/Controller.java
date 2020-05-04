package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {


    @FXML
    public TextField _inputGuessedChar;




    public void onExitClick(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void onTryClick(ActionEvent actionEvent) {
        _inputGuessedChar.getText();

        Scanner scannerE = new Scanner(_inputGuessedChar.getText());
    }


}
