package com.example.demo6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SceneTwoController implements Initializable {

    @FXML
    private TextField ageField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    void addData(ActionEvent event) throws SQLException {
        db.addDataToDB(firstNameField.getText(),lastNameField.getText(),Integer.parseInt(ageField.getText()));
    }

    DbController db;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        db = new DbController();
        db.startConnection();
    }
}
